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

    /**
     * 分页查询员工信息
     * @param page=1,size=2
     * @return List<Emp>
     */
    List<Emp> findAll();
    /**
     * 员工姓名查询
     * @param ename
     * @return List<Emp>
     */
    List<Emp> findByName(String ename);

    /**
     * 已离职员工信息查询
     * @param estate
     * @return List<Emp>
     */
    List<Emp> findDimission(String estate);



}