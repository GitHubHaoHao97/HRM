package com.company.dao;

import com.company.dao.pojo.EmpProbation;

import java.util.List;

public interface EmpProbationMapper {
    int deleteByPrimaryKey(Integer eno);

    int insert(EmpProbation record);

    int insertSelective(EmpProbation record);

    EmpProbation selectByPrimaryKey(Integer eno);

    int updateByPrimaryKeySelective(EmpProbation record);

    int updateByPrimaryKey(EmpProbation record);

    List<EmpProbation> findAll();
}