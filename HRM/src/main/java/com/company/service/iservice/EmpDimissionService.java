package com.company.service.iservice;

import com.company.dao.pojo.EmpDimission;

import java.util.List;

public interface EmpDimissionService {
    String save(EmpDimission empDim);

    String delete(int eno);

    String update(EmpDimission empDim);


    List<EmpDimission> findByPage(int page, int size);

    EmpDimission findById(int eno);
}
