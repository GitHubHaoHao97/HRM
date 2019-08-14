package com.company.dao;

import com.company.dao.pojo.Job;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface JobMapper {
    int deleteByPrimaryKey(Integer jno);

    int insert(Job record);

    int insertSelective(Job record);

    Job selectByPrimaryKey(Integer jno);

    int updateByPrimaryKeySelective(Job record);

    int updateByPrimaryKey(Job record);

    List<Job> findAll();

    List<Job> findByName(@Param("jname") String jname);
}