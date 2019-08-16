package com.company.action;

import com.company.commons.RepositoryResult;
import com.company.commons.Result;
import com.company.dao.pojo.NewDate;
import com.company.service.iservice.NewDateService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
public class NewDateAction {
    @Autowired
    NewDateService newDateService;
    @RequestMapping("newDate")
    public @ResponseBody
    RepositoryResult<List<NewDate>> findNewDate(
            @RequestParam(value = "begin",required = true) String begin,
            @RequestParam(value = "end",required = true) String end){
        List<NewDate> newDateList = newDateService.findNewDate(begin,end);
        if (newDateList != null){
            return new RepositoryResult<List<NewDate>>(200, Result.SUCCESS,newDateList);
        }else{
            return new RepositoryResult<List<NewDate>>(200, Result.SUCCESS);
        }

    }
}
