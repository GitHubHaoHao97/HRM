package com.company.action;

import com.company.commons.RepositoryResult;
import com.company.commons.Result;
import com.company.dao.pojo.Job;
import com.company.service.iservice.JobService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller()
public class JobAction {
    @Autowired
    JobService jobService;

    @RequestMapping(value = "job", method = RequestMethod.POST)
    public @ResponseBody
    RepositoryResult<Job> save(Job job) {
        String msg = jobService.save(job);
        int code = Result.SUCCESS.equals(msg) ? 200 : 500;
        return new RepositoryResult<Job>(code, msg);
    }

    @RequestMapping(value = "job/{jno}", method = RequestMethod.DELETE)
    public @ResponseBody
    RepositoryResult<Job> delete(@PathVariable("jno") Integer jno) {
        String msg = jobService.delete(jno);
        int code = Result.SUCCESS.equals(msg) ? 200 : 500;
        return new RepositoryResult<Job>(code, msg);
    }

    @RequestMapping(value = "jobupdate", method = RequestMethod.POST)
    public @ResponseBody
    RepositoryResult<Job> update(Job job) {
        String msg = jobService.update(job);
        int code = Result.SUCCESS.equals(msg) ? 200 : 500;
        return new RepositoryResult<Job>(code, msg);
    }

    @RequestMapping(value = "jobs")
    public @ResponseBody
    RepositoryResult<List<Job>> findByPage(
            @RequestParam(value = "page", required = false, defaultValue = "1") int page,
            @RequestParam(value = "size", required = false, defaultValue = "4") int size) {
        List<Job> jobs = jobService.findByPage(page, size);
        if (jobs != null && jobs.size() > 0) {
            return new RepositoryResult<List<Job>>(200, Result.SUCCESS, jobs);
        } else {
            return new RepositoryResult<List<Job>>(500, Result.ERROR);
        }
    }

    @RequestMapping(value = "jobs/{jname}")
    public @ResponseBody
    RepositoryResult<List<Job>> findByName(@PathVariable("jname") String jname) {
        List<Job> jobs = jobService.findByName(jname);
        if (jobs != null && jobs.size() > 0) {
            return new RepositoryResult<List<Job>>(200, Result.SUCCESS, jobs);
        } else {
            return new RepositoryResult<List<Job>>(500, Result.ERROR);
        }
    }
    @RequestMapping(value = "job/{jno}")
    public @ResponseBody
    RepositoryResult<Job> findById(@PathVariable("jno") int jno) {
        Job job  = jobService.findById(jno);
        if (job != null ) {
            return new RepositoryResult<Job>(200, Result.SUCCESS, job);
        } else {
            return new RepositoryResult<Job>(500, Result.ERROR);
        }
    }
}
