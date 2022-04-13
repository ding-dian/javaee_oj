package com.hnitoj.controller;

import com.hnitoj.pojo.Problem;
import com.hnitoj.service.ProblemService;
import com.hnitoj.utils.R;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.List;

@Controller
@RequestMapping("/problem")
public class ProblemAction {
    //切记:在所有的界面层,一定会有业务逻辑层的对象
    @Autowired
    ProblemService problemService;

    //功能一:查 所有不分页题目列表
    @RequestMapping("/getAll")
    @ResponseBody
    public List<Problem> getAll(HttpServletRequest request, HttpServletResponse response){
        List<Problem> list=problemService.getAll();
        request.setAttribute("list",list);
       // System.out.println("list");
        return list;
    }








}
