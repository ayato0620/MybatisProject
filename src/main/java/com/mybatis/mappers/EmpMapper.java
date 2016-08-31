package com.mybatis.mappers;

import com.mybatis.entity.Emp;

/**
 * Created by Ayato on 2016/8/31.
 */
public interface EmpMapper {

    Emp findEmpDeptByEmpId(int id);

}
