package com.company.service.impl;

import com.company.commons.Result;
import com.company.dao.EmpMapper;
import com.company.dao.pojo.Emp;
import com.company.service.iservice.EmpService;
import com.github.pagehelper.PageHelper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EmpServiceImpl implements EmpService {

    @Autowired
    EmpMapper empMapper;

    @Override
    public String save(Emp emp) {
        int result = empMapper.insertSelective(emp);
        return result>0?Result.SUCCESS:Result.ERROR;
    }

    @Override
    public String delete(Integer eno) {
        int result = empMapper.deleteByPrimaryKey(eno);
        return result>0?Result.SUCCESS:Result.ERROR;
    }

    @Override
    public String update(Emp emp) {
        int result = empMapper.updateByPrimaryKeySelective(emp);
        return result>0?Result.SUCCESS:Result.ERROR;
    }

    @Override
    public List<Emp> findByPage(int page,int size) {
        PageHelper.startPage(page, size);
        return empMapper.findAll();
    }

    @Override
    public Emp findById(Integer eno) {
        return empMapper.selectByPrimaryKey(eno);
    }

    @Override
    public List<Emp> findByName(String ename) {
        return empMapper.findByName(ename);
    }

    @Override
    public List<Emp> findDimission(String estate) {
        return empMapper.findDimission(estate);
    }

    @Override
    public List<Emp> findJno(Integer jno) {
        return empMapper.findJno(jno);
    }

    @Override
    public List<Emp> findDno(Integer dno) {
        return empMapper.findDno(dno);
    }
}
