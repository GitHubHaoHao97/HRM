package com.company.service.impl;

import com.company.commons.Result;
import com.company.dao.EmpDimissionMapper;
import com.company.dao.pojo.EmpDimission;
import com.company.service.iservice.EmpDimissionService;
import com.github.pagehelper.PageHelper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service("empDimService")
public class EmpDimissionServiceImpl implements EmpDimissionService {
    @Autowired
    EmpDimissionMapper empDimissionMapper;


    @Override
    public String save(EmpDimission empDim) {
        int result = empDimissionMapper.insertSelective(empDim);
        return result>0? Result.SUCCESS :Result.ERROR;
    }

    @Override
    public String delete(int eno) {
        int result = empDimissionMapper.deleteByPrimaryKey(eno);
        return result>0? Result.SUCCESS :Result.ERROR;
    }

    @Override
    public String update(EmpDimission empDim) {
        int result = empDimissionMapper.updateByPrimaryKeySelective(empDim);
        return result>0? Result.SUCCESS :Result.ERROR;
    }

    @Override
    public List<EmpDimission> findByPage(int page, int size) {
        PageHelper.startPage(page,size);
        return empDimissionMapper.findAll();
    }

    @Override
    public EmpDimission findById(int eno) {
        return empDimissionMapper.findById(eno);
    }


}
