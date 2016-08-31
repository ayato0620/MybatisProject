package com.mybatis.mappers;

import com.mybatis.entity.Dept;

/**
 * Created by Ayato on 2016/8/31.
 */
public interface DeptMapper {

    Dept findDeptEmpByDeptId(int id);

    Dept findDeptJobByDeptId(int id);
}
