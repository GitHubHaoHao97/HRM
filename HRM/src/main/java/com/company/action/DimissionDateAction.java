package com.company.action;

import com.company.commons.RepositoryResult;
import com.company.commons.Result;
import com.company.dao.pojo.DimissionDate;
import com.company.service.iservice.DimissionDateService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
public class DimissionDateAction {
    @Autowired
    DimissionDateService dimissionDateService;

    @RequestMapping("dimissionDate")
    public @ResponseBody
    RepositoryResult<List<DimissionDate>> findDimissionDate(
            @RequestParam(value = "begin",required = true) String begin,
            @RequestParam(value = "end",required = true) String end){
        List<DimissionDate> dimissionDates = dimissionDateService.findDimissionDate(begin,end);
        if (dimissionDates != null){
            return new RepositoryResult<List<DimissionDate>>(200, Result.SUCCESS,dimissionDates);
        }else{
            return new RepositoryResult<List<DimissionDate>>(200, Result.SUCCESS);
        }
    }
}
