package com.company.service.impl;

import com.company.dao.pojo.NewDate;
import com.company.service.iservice.NewDateService;
import com.company.vo.DateVO;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.util.List;

import static org.junit.Assert.*;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = "classpath:applicationContext.xml")
public class NewDateServiceImplTest {

    @Autowired
    NewDateService newDateService;

    @Test
    public void findNewDate() {
        List<NewDate> newDates = newDateService.findNewDate("2018-01-01","2019-06-01");
        for (NewDate newDate:newDates){
            System.err.println(newDate);
        }
    }
}