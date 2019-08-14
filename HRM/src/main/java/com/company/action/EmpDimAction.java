package com.company.action;

import com.company.commons.RepositoryResult;
import com.company.commons.Result;
import com.company.dao.pojo.EmpDimission;
import com.company.service.iservice.EmpDimissionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
@RequestMapping("EmpDim")
public class EmpDimAction {
    @Autowired
    EmpDimissionService empDimissionService;
    @RequestMapping(value = "empDim",method = RequestMethod.POST)
    public @ResponseBody
    RepositoryResult<EmpDimission> save(EmpDimission empDim){
        String msg = empDimissionService.save(empDim);
        return Result.SUCCESS.equals(msg)?new RepositoryResult<EmpDimission>(200,Result.SUCCESS):new RepositoryResult<EmpDimission>(404,Result.ERROR);
    }
    @RequestMapping(value = "empDim/{eno}",method = RequestMethod.DELETE)
    public @ResponseBody RepositoryResult<EmpDimission> delete(@PathVariable int eno){
        String msg = empDimissionService.delete(eno);
        return Result.SUCCESS.equals(msg)?new RepositoryResult<EmpDimission>(200,Result.SUCCESS):new RepositoryResult<EmpDimission>(404,Result.ERROR);
    }
    @RequestMapping(value = "update",method = RequestMethod.POST)
    public @ResponseBody RepositoryResult<EmpDimission> update(EmpDimission empDim){
        String msg = empDimissionService.update(empDim);
        return Result.SUCCESS.equals(msg)?new RepositoryResult<EmpDimission>(200,Result.SUCCESS):new RepositoryResult<EmpDimission>(404,Result.ERROR);
    }
    @RequestMapping(value = "empDim/{eno}",method = RequestMethod.GET)
    public  @ResponseBody RepositoryResult<EmpDimission>findById(@PathVariable int eno) {
        EmpDimission empDim = empDimissionService.findById(eno);
        if (empDim != null) {
            return new RepositoryResult<EmpDimission>(200, Result.SUCCESS, empDim);
        } else {
            return new RepositoryResult<EmpDimission>(404,Result.ERROR);
        }

    }

    @RequestMapping(value = "emps",method = RequestMethod.GET)
    public @ResponseBody RepositoryResult<List<EmpDimission>> findByPage(
            @RequestParam(value = "page",required = false,defaultValue = "1") int page,
            @RequestParam(value = "size",required = false,defaultValue = "20") int size) throws Exception {
        List<EmpDimission> emps = empDimissionService.findByPage(page,size);
        if(emps!=null && emps.size()>0){
            return new RepositoryResult<List<EmpDimission>>(200,Result.SUCCESS,emps);
        }else {
            return new RepositoryResult<List<EmpDimission>>(404,Result.ERROR);
        }
    }

}


