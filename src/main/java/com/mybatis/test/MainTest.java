package com.mybatis.test;

import com.mybatis.entity.Dept;
import com.mybatis.entity.Emp;
import com.mybatis.entity.Job;
import com.mybatis.mappers.DeptMapper;
import com.mybatis.mappers.EmpMapper;
import com.mybatis.mappers.JobMapper;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import java.io.IOException;
import java.io.InputStream;
import java.util.List;

/**
 * Created by Ayato on 2016/8/31.
 */
public class MainTest {
    public static void main(String[] args) {
        MainTest test = new MainTest();

        //一对多查询
        //test.findDeptEmpByDeptId(10);

        //多对一查询
        //test.findEmpDeptByEmpId(104);

        //多对多查询-1
        //test.findDeptJobByDeptId(10);

        //多对多查询-2
        test.findJobDeptByJobId(6);

    }
    public void findDeptEmpByDeptId(int id){
        DeptMapper deptMapper = getSqlSessionFactory().openSession().getMapper(DeptMapper.class);
        Dept dept = deptMapper.findDeptEmpByDeptId(id);
        System.out.println(dept);
        for (Emp emp :dept.getList()){
            System.out.println(emp);
        }
    }

    public void findEmpDeptByEmpId(int id){
        EmpMapper empMapper = getSqlSessionFactory().openSession().getMapper(EmpMapper.class);
        Emp emp = empMapper.findEmpDeptByEmpId(102);
        System.out.println(emp+"   "+emp.getDept().toString());
    }

    public void findDeptJobByDeptId(int id){
        DeptMapper deptMapper = getSqlSessionFactory().openSession().getMapper(DeptMapper.class);
        Dept dept = deptMapper.findDeptJobByDeptId(10);
        System.out.println(dept);
        for (Job job : dept.getJobList()){
            System.out.println(job);
        }
    }

    public void findJobDeptByJobId(int id){
        JobMapper jobMapper = getSqlSessionFactory().openSession().getMapper(JobMapper.class);
        Job job = jobMapper.findJobDeptByJobId(6);
        System.out.println(job);
        for (Dept dept:job.getDeptList()){
            System.out.println(dept);
        }
    }


    public SqlSessionFactory getSqlSessionFactory(){
        InputStream inputStream = null;
        try {
            inputStream = Resources.getResourceAsStream("mainconfig.xml");
        } catch (IOException e) {
            e.printStackTrace();
        }
        return new SqlSessionFactoryBuilder().build(inputStream);
    }
}
