package com.company.action;

import com.company.commons.RepositoryResult;
import com.company.commons.Result;
import com.company.dao.pojo.Emp;
import com.company.service.iservice.EmpService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
@RequestMapping("emp")
public class EmpAction{
    @Autowired
    EmpService empService;

    @RequestMapping("save")
    public @ResponseBody RepositoryResult<Emp> save(Emp emp){
        String msg = empService.save(emp);
        return Result.SUCCESS.equals(msg)?new RepositoryResult(200,Result.SUCCESS):new RepositoryResult(500,Result.ERROR);
    }
    @RequestMapping(value = "delete/{eno}",method = RequestMethod.DELETE)
    public @ResponseBody
    RepositoryResult<Emp> delete(@PathVariable("eno") Integer eno){
        String msg = empService.delete(eno);
        return Result.SUCCESS.equals(msg)?new RepositoryResult(200,Result.SUCCESS):new RepositoryResult(500,Result.ERROR);
    }
    @RequestMapping("update")
    public @ResponseBody RepositoryResult<Emp> update(Emp emp){
        String msg = empService.update(emp);
        return Result.SUCCESS.equals(msg)?new RepositoryResult(200,Result.SUCCESS):new RepositoryResult(500,Result.ERROR);
    }
    @RequestMapping("findByPage")
    public @ResponseBody
    RepositoryResult<List<Emp>> findByPage(
            @RequestParam(value = "page",required = false,defaultValue = "1") int page,
            @RequestParam(value = "size",required = false,defaultValue = "2") int size){
        List<Emp> emps = empService.findByPage(page,size);
        if (emps != null && emps.size()>0){
            return new RepositoryResult<List<Emp>>(200,Result.SUCCESS,emps);
        }else{
            return new RepositoryResult<List<Emp>>(500,Result.ERROR);
        }
    }
    @RequestMapping("findById/{eno}")
    public @ResponseBody RepositoryResult<Emp> findById(@PathVariable("eno") int eno){
        Emp emp = empService.findById(eno);
        if (emp != null){
            return new RepositoryResult<Emp>(200,Result.SUCCESS,emp);
        }else{
            return new RepositoryResult<Emp>(500,Result.ERROR);
        }
    }
    @RequestMapping("findByName/{ename}")
    public @ResponseBody
    RepositoryResult<List<Emp>> findByName(@PathVariable("ename") String ename){
        List<Emp> emps = empService.findByName(ename);
        if (emps != null){
            return new RepositoryResult<List<Emp>>(200,Result.SUCCESS, emps);
        }else{
            return new RepositoryResult<List<Emp>>(500,Result.ERROR);
        }
    }

    @RequestMapping("findDimission/{estate}")
    public @ResponseBody RepositoryResult<List<Emp>> findDimission(@PathVariable("estate") String estate) {
        List<Emp> emps = empService.findDimission(estate);
        if(emps != null) {
            return new RepositoryResult<List<Emp>>(200, Result.SUCCESS, emps);
        }else{
            return new RepositoryResult<List<Emp>>(200,Result.SUCCESS);
        }
    }

    @RequestMapping("findJno/{jno}")
    public @ResponseBody RepositoryResult<List<Emp>> findJno(@PathVariable("jno") int jno){
        List<Emp> emps = empService.findJno(jno);
        if (emps != null){
            return new RepositoryResult<List<Emp>>(200,Result.SUCCESS,emps);
        }else {
            return new RepositoryResult<List<Emp>>(500,Result.ERROR);
        }
    }
    @RequestMapping("findDno/{dno}")
    public @ResponseBody RepositoryResult<List<Emp>> findDno(@PathVariable("dno") int dno){
        List<Emp> emps = empService.findDno(dno);
        if (emps != null){
            return new RepositoryResult<List<Emp>>(200,Result.SUCCESS,emps);
        }else {
            return new RepositoryResult<List<Emp>>(500,Result.ERROR);
        }
    }

}
