package com.hnitoj.service;

import com.hnitoj.pojo.Problem;

import java.util.List;

public interface ProblemService {
    //显示全部商品(不分页)
    List<Problem> getAll();

    //删除
    int delete(int problem_id);
}
