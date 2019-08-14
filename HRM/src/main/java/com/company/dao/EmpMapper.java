package com.company.dao;

import com.company.dao.pojo.Emp;

import java.util.List;

public interface EmpMapper {
    int deleteByPrimaryKey(Integer eno);

    int insert(Emp record);

    int insertSelective(Emp record);

    Emp selectByPrimaryKey(Integer eno);

    int updateByPrimaryKeySelective(Emp record);

    int updateByPrimaryKey(Emp record);

    List<Emp> findAll();

    List<Emp> findByName(String ename);

    List<Emp> findDimission(String estate);

    List<Emp> findJno(Integer jno);

    List<Emp> findDno(Integer dno);

}