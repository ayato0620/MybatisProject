package com.mybatis.entity;

/**
 * Created by Ayato on 2016/8/31.
 */
public class Emp {
    private int empno;
    private String ename,job;
    private float sal;
    private Dept dept;

    public Emp() {

    }

    public Emp(int empno, String ename, String job, float sal, Dept dept) {
        this.empno = empno;
        this.ename = ename;
        this.job = job;
        this.sal = sal;
        this.dept = dept;
    }

    public int getEmpno() {
        return empno;
    }

    public void setEmpno(int empno) {
        this.empno = empno;
    }

    public String getEname() {
        return ename;
    }

    public void setEname(String ename) {
        this.ename = ename;
    }

    public String getJob() {
        return job;
    }

    public void setJob(String job) {
        this.job = job;
    }

    public float getSal() {
        return sal;
    }

    public void setSal(float sal) {
        this.sal = sal;
    }

    public Dept getDept() {
        return dept;
    }

    public void setDept(Dept dept) {
        this.dept = dept;
    }

    @Override
    public String toString() {
        return "Emp{" +
                "empno=" + empno +
                ", ename='" + ename + '\'' +
                ", job='" + job + '\'' +
                ", sal=" + sal +
                '}';
    }
}
