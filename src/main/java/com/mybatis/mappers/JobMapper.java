package com.mybatis.mappers;

import com.mybatis.entity.Job;

/**
 * Created by Ayato on 2016/8/31.
 */
public interface JobMapper {
    Job findJobDeptByJobId(int id);
}
