package com.company.service.iservice;

import com.company.dao.pojo.Emp;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface EmpService {
    /**
     * 新添员工
     * @param emp
     * @return
     */
    String save(Emp emp);

    /**
     * 删除员工
     * @param eno
     * @return
     */
    String delete(Integer eno);
    /**
     * 更改员工信息
     * @param emp
     * @return
     */
    String update(Emp emp);

    /**
     * 分页查询员工信息
     * @return
     */
    List<Emp> findByPage(int page,int size);
    /**
     * 按编号查询员工信息
     * @param eno
     * @return
     */
    Emp findById(Integer eno);

    /**
     * 员工姓名查询
     * @param ename
     * @return
     */
    List<Emp> findByName(String ename);

    /**
     * 已离职员工信息查询
     * @param estate
     * @return 离职
     */
    List<Emp> findDimission(String estate);
}
