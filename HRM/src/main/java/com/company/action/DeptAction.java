package com.company.action;

import com.company.commons.RepositoryResult;
import com.company.commons.Result;
import com.company.dao.pojo.Dept;
import com.company.service.iservice.DeptService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
public class DeptAction {
    @Autowired
    DeptService deptService;
    @RequestMapping(value = "dept", method = RequestMethod.POST)
    public @ResponseBody
    RepositoryResult<Dept> save(Dept dept) {
        String msg = deptService.save(dept);
        int code = Result.SUCCESS.equals(msg) ? 200 : 500;
        return new RepositoryResult<Dept>(code, msg);
    }

    @RequestMapping(value = "dept/{dno}", method = RequestMethod.DELETE)
    public @ResponseBody
    RepositoryResult<Dept> delete(@PathVariable("dno") Integer dno) {
        String msg = deptService.delete(dno);
        int code = Result.SUCCESS.equals(msg) ? 200 : 500;
        return new RepositoryResult<Dept>(code, msg);
    }

    @RequestMapping(value = "deptupdate", method = RequestMethod.POST)
    public @ResponseBody
    RepositoryResult<Dept> update(Dept dept) {
        String msg = deptService.update(dept);
        int code = Result.SUCCESS.equals(msg) ? 200 : 500;
        return new  RepositoryResult<Dept>(code, msg);
    }

    @RequestMapping(value = "depts")
    public @ResponseBody
    RepositoryResult<List<Dept>> findByPage(
            @RequestParam(value = "page", required = false, defaultValue = "1") int page,
            @RequestParam(value = "size", required = false, defaultValue = "5") int size) {
        List<Dept> depts = deptService.findByPage(page, size);
        if (depts != null && depts.size() > 0) {
            return new RepositoryResult<List<Dept>>(200, Result.SUCCESS, depts);
        } else {
            return new  RepositoryResult<List<Dept>>(500, Result.ERROR);
        }
    }

    @RequestMapping("depts/{dname}")
    public @ResponseBody
    RepositoryResult<List<Dept>> findByName(@PathVariable("dname") String dname) {
        List<Dept> depts = deptService.findByName(dname);
        if (depts != null && depts.size() > 0) {
            return new RepositoryResult<List<Dept>>(200,Result.SUCCESS, depts);
        } else {
            return new RepositoryResult<List<Dept>>(500, Result.ERROR);
        }
    }

    @RequestMapping("dept/{dno}")
    public @ResponseBody
    RepositoryResult<Dept> findById(@PathVariable("dno") int dno) {
        Dept dept = deptService.findById(dno);
        if (dept != null) {
            return new RepositoryResult<Dept>(200, Result.SUCCESS, dept);
        } else {
            return new RepositoryResult<Dept>(500, Result.ERROR);
        }
    }
}
