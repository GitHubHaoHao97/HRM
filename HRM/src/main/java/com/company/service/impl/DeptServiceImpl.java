package com.company.service.impl;

import com.company.commons.Result;
import com.company.dao.DeptMapper;
import com.company.dao.pojo.Dept;
import com.company.service.iservice.DeptService;
import com.github.pagehelper.PageHelper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service("deptService")
public class DeptServiceImpl implements DeptService {
    @Autowired
    DeptMapper deptMapper;
    @Override
    public String save(Dept dept) {
        int result = deptMapper.insert(dept);
        return result>0? Result.SUCCESS:Result.ERROR;
    }

    @Override
    public String delete(Integer dno) {
        int result = deptMapper.deleteByPrimaryKey(dno);
        return result>0? Result.SUCCESS:Result.ERROR;
    }

    @Override
    public String update(Dept dept) {
        int result = deptMapper.updateByPrimaryKeySelective(dept);
        return result>0? Result.SUCCESS:Result.ERROR;
    }

    @Override
    public List<Dept> findByPage(int page, int size) {
        PageHelper.startPage(page, size);
        return deptMapper.findAll();
    }

    @Override
    public List<Dept> findByName(String dname) {
        return deptMapper.findByName(dname);
    }

    @Override
    public Dept findById(Integer dno) {
        return deptMapper.selectByPrimaryKey(dno);
    }
}
