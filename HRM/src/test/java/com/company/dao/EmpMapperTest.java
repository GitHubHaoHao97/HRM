package com.company.dao;

import com.company.dao.pojo.Emp;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.lang.reflect.Array;
import java.util.Date;
import java.util.List;

import static org.junit.Assert.*;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = "classpath:applicationContext.xml")
public class EmpMapperTest {

    @Autowired
    EmpMapper empMapper;

    @Test
    public void deleteByPrimaryKey() {
        assertNotNull(empMapper.deleteByPrimaryKey(1004));
    }

    @Test
    public void insertSelective() {
        Emp emp = new Emp("shi","boy",new Date(),"1234567890","student",2001,3001,new Date(),new Date(),"工作","跳舞","清洁工");
        int result = empMapper.insertSelective(emp);
        System.err.println(emp);
    }

    @Test
    public void selectByPrimaryKey() {
        System.err.println(empMapper.selectByPrimaryKey(1003));
    }

    @Test
    public void updateByPrimaryKeySelective() {
        Emp emp = new Emp();
        emp.setEno(1001);
        emp.setEstate("离职");
        int result = empMapper.updateByPrimaryKeySelective(emp);
//        assertTrue(emp.getEtype().equals("蹦迪"));
        System.err.println(emp);
    }


    @Test
    public void findAll() {
        List<Emp> empList = empMapper.findAll();
        for (Emp emp:empList){
            System.err.println(emp);
        }
    }

    @Test
    public void findByName() {
        List<Emp> empList = empMapper.findByName("n");
        for (Emp emp:empList){
            System.err.println(emp);
        }
    }

    @Test
    public void findDimission() {
        List<Emp> emps = empMapper.findDimission("离职");
        for (Emp emp:emps){
            System.err.println(emp);
        }
    }
}