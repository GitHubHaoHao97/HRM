package com.company.service.impl;

import com.company.commons.Result;
import com.company.dao.JobMapper;
import com.company.dao.pojo.Job;
import com.company.service.iservice.JobService;
import com.github.pagehelper.PageHelper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service("jobService")
public class JobServiceImpl implements JobService {
    @Autowired
    JobMapper jobMapper;
    @Override
    public String save(Job job) {
        int result = jobMapper.insertSelective(job);
        return result>0? Result.SUCCESS:Result.ERROR;


    }

    @Override
    public String delete(Integer jno) {
        int result = jobMapper.deleteByPrimaryKey(jno);
        return result>0? Result.SUCCESS:Result.ERROR;
    }

    @Override
    public String update(Job job) {
        int result = jobMapper.updateByPrimaryKeySelective(job);
        return result>0? Result.SUCCESS:Result.ERROR;
    }

    @Override
    public List<Job> findByPage(int page, int size) {
        PageHelper.startPage(page, size);
        return jobMapper.findAll();
    }

    @Override
    public List<Job> findByName(String jname) {
        return jobMapper.findByName(jname);
    }

    @Override
    public Job findById(int jno) {
        return jobMapper.selectByPrimaryKey(jno);
    }
}
