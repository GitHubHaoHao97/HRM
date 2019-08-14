package com.company.dao;

import com.company.dao.pojo.Dept;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface DeptMapper {
    int deleteByPrimaryKey(Integer dno);

    int insert(Dept record);

    int insertSelective(Dept record);

    Dept selectByPrimaryKey(Integer dno);

    int updateByPrimaryKeySelective(Dept record);

    int updateByPrimaryKey(Dept record);

    List<Dept> findAll();

    List<Dept> findByName(@Param("dname") String dname);
}