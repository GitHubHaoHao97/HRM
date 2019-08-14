package com.company.service.impl;

import com.company.commons.Result;
import com.company.dao.EmpProbationMapper;
import com.company.dao.pojo.EmpProbation;
import com.company.service.iservice.EmpProbationService;
import com.github.pagehelper.PageHelper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EmpProServiceImpl implements EmpProbationService {
    @Autowired
    EmpProbationMapper empProbationMapper;

    @Override
    public String save(EmpProbation empPro) {
        int result = empProbationMapper.insertSelective(empPro);
        return result > 0 ? Result.SUCCESS : Result.ERROR;
    }

    @Override
    public String update(EmpProbation empPro) {
        int result = empProbationMapper.updateByPrimaryKeySelective(empPro);
        return result > 0 ? Result.SUCCESS : Result.ERROR;
    }

    @Override
    public String delete(Integer eno) {
        int result = empProbationMapper.deleteByPrimaryKey(eno);
        return result > 0 ? Result.SUCCESS : Result.ERROR;
    }

    @Override
    public List<EmpProbation> findByPage(int page, int size) {
        PageHelper.startPage(page, size);
        return empProbationMapper.findAll();
    }

    @Override
    public EmpProbation findById(Integer eno) {
        return empProbationMapper.selectByPrimaryKey(eno);
    }
}
