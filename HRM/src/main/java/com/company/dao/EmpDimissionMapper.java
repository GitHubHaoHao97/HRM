package com.company.dao;

import com.company.dao.pojo.EmpDimission;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface EmpDimissionMapper {
    int deleteByPrimaryKey(Integer eno);

    int insert(EmpDimission record);

    int insertSelective(EmpDimission record);

    EmpDimission selectByPrimaryKey(Integer eno);

    int updateByPrimaryKeySelective(EmpDimission record);

    int updateByPrimaryKey(EmpDimission record);

    List<EmpDimission> findAll();

    EmpDimission findById(@Param("id") Integer id) ;
}