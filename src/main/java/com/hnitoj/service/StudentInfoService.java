package com.hnitoj.service;

import com.hnitoj.pojo.Studentdd;

import java.util.List;

public interface StudentInfoService {
    //增加信息
    int addBatch(Studentdd info);

    //显示全部
    List<Studentdd> getPage();

    //更新
    int updateById(Studentdd info);






}
