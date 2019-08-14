package com.company.action;

import com.company.commons.RepositoryResult;
import com.company.commons.Result;
import com.company.dao.pojo.EmpProbation;
import com.company.service.iservice.EmpProbationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
public class EmpProAction {
    @Autowired
    EmpProbationService empProbationService;

    @RequestMapping("emppro")
    public @ResponseBody
    RepositoryResult<EmpProbation> save(EmpProbation empPro) {
        String msg = empProbationService.save(empPro);
        int code = Result.SUCCESS.equals(msg) ? 200 : 500;
        return new RepositoryResult<EmpProbation>(code, msg);
    }

    @RequestMapping(value = "empproupdate", method = RequestMethod.POST)
    public @ResponseBody
    RepositoryResult<EmpProbation> update(EmpProbation empPro) {
        String msg = empProbationService.update(empPro);
        int code = Result.SUCCESS.equals(msg) ? 200 : 500;
        return new RepositoryResult<EmpProbation>(code, msg);
    }

    @RequestMapping(value = "emppro/{eno}", method = RequestMethod.DELETE)
    public @ResponseBody
    RepositoryResult<EmpProbation> delete(@PathVariable("eno") Integer eno) {
        String msg = empProbationService.delete(eno);
        int code = Result.SUCCESS.equals(msg) ? 200 : 500;
        return new RepositoryResult<EmpProbation>(code, msg);
    }

    @RequestMapping(value = "emppros")
    public @ResponseBody
    RepositoryResult<List<EmpProbation>> findByPage(
            @RequestParam(value = "page", required = false, defaultValue = "1") int page,
            @RequestParam(value = "size", required = false, defaultValue = "5") int size) {
        List<EmpProbation> empPros = empProbationService.findByPage(page, size);
        if (empPros != null && empPros.size() > 0) {
            return new RepositoryResult<List<EmpProbation>>(200, Result.SUCCESS, empPros);
        } else {
            return new RepositoryResult<List<EmpProbation>>(500, Result.ERROR);
        }
    }

    @RequestMapping(value = "emppro/{eno}")
    public @ResponseBody
    RepositoryResult<EmpProbation> findById(Integer eno) {
        EmpProbation empPro = empProbationService.findById(eno);
        if (empPro != null) {
            return new RepositoryResult<EmpProbation>(200, Result.SUCCESS, empPro);
        } else {
            return new RepositoryResult<EmpProbation>(500, Result.ERROR);
        }
    }
}
