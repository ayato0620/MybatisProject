package com.mybatis.entity;

/**
 * Created by Ayato on 2016/8/31.
 */
public class DeptJob {
    private int deptjobno;
    private Dept dept;
    private Job job;

    public DeptJob() {
    }

    public DeptJob(int deptjobno, Dept dept, Job job) {
        this.deptjobno = deptjobno;
        this.dept = dept;
        this.job = job;
    }

    public int getDeptjobno() {
        return deptjobno;
    }

    public void setDeptjobno(int deptjobno) {
        this.deptjobno = deptjobno;
    }

    public Dept getDept() {
        return dept;
    }

    public void setDept(Dept dept) {
        this.dept = dept;
    }

    public Job getJob() {
        return job;
    }

    public void setJob(Job job) {
        this.job = job;
    }

    @Override
    public String toString() {
        return "DeptJob{" +
                "deptjobno=" + deptjobno +
                ", dept=" + dept.toString() +
                ", job=" + job.toString() +
                '}';
    }
}
