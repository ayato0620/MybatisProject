package com.mybatis.entity;

import java.util.List;

/**
 * Created by Ayato on 2016/8/31.
 */
public class Job {
    private int jobno;
    private String job;
    private Dept dept;
    private List<Dept> deptList;

    public Job() {
    }

    public Job(int jobno, String job) {
        this.jobno = jobno;
        this.job = job;
    }

    public int getJobno() {
        return jobno;
    }

    public void setJobno(int jobno) {
        this.jobno = jobno;
    }

    public String getJob() {
        return job;
    }

    public void setJob(String job) {
        this.job = job;
    }

    public List<Dept> getDeptList() {
        return deptList;
    }

    public void setDeptList(List<Dept> deptList) {
        this.deptList = deptList;
    }

    public Dept getDept() {
        return dept;
    }

    public void setDept(Dept dept) {
        this.dept = dept;
    }

    @Override
    public String toString() {
        return "Job{" +
                "jobno=" + jobno +
                ", job='" + job + '\'' +
                '}';
    }
}
