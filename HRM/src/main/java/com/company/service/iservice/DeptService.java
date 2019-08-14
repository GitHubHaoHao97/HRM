package com.company.service.iservice;

import com.company.dao.pojo.Dept;

import java.util.List;

public interface DeptService {
    String save(Dept dept);

    String delete(Integer dno);

    String update(Dept dept);

    List<Dept> findByPage(int page, int size);

    List<Dept> findByName(String dname);

    Dept findById(Integer dno);
}
