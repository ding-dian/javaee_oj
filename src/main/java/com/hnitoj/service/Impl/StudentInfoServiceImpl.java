package com.hnitoj.service.Impl;

import com.hnitoj.mapper.StudentddMapper;
import com.hnitoj.pojo.Studentdd;
import com.hnitoj.pojo.StudentddExample;
import com.hnitoj.service.StudentInfoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StudentInfoServiceImpl implements StudentInfoService {
    //切记:业务逻辑层中一定有数据访问层的对象
    @Autowired
    StudentddMapper studentddMapper;

    @Override
    public int addBatch(Studentdd info) {
        return studentddMapper.addBatch(info);
    }

    @Override
    public List<Studentdd> getPage() {
        return studentddMapper.getPage(new StudentddExample());
    }

    @Override
    public int updateById(Studentdd info) {
        return studentddMapper.updateById(info);
    }



}
