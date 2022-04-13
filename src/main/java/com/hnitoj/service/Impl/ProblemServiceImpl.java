package com.hnitoj.service.Impl;

import com.hnitoj.mapper.ProblemMapper;
import com.hnitoj.pojo.Problem;
import com.hnitoj.pojo.ProblemExample;
import com.hnitoj.service.ProblemService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProblemServiceImpl implements ProblemService {
    @Autowired
    ProblemMapper problemMapper;

    @Override
    public List<Problem> getAll(){
        System.out.println(problemMapper);
        return problemMapper.selectByExample(new ProblemExample());
    }

    @Override
     public int delete(int problem_id){
        return problemMapper.deleteByPrimaryKey(problem_id);
    }


}
