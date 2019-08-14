package com.company.service.iservice;

import com.company.dao.pojo.EmpProbation;

import java.util.List;

public interface EmpProbationService {
    String save(EmpProbation empPro);

    String update(EmpProbation empPro);

    String delete(Integer eno);

    List<EmpProbation> findByPage(int page, int size);

    EmpProbation findById(Integer eno);
}
