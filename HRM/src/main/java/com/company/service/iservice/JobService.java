package com.company.service.iservice;

import com.company.dao.pojo.Job;
import java.util.List;

public interface JobService {
    String save(Job job);

    String delete(Integer jno);

    String update(Job job);

    List<Job> findByPage(int page, int size);

    List<Job> findByName(String jname);

    Job findById(int jno);
}
