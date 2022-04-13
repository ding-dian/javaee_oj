package com.hnitoj.controller;

import com.hnitoj.pojo.Problem;
import com.hnitoj.service.ProblemService;
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


    //功能二:根据id删除题目
    @ResponseBody
    @RequestMapping("/delete")
    public String delete(int problem_id,HttpServletRequest request, HttpServletResponse response){
        int num = -1;
        try {
         num=problemService.delete(problem_id);
        }catch (Exception e){
            e.printStackTrace();
        }
        if (num > 0) {
            request.setAttribute("msg", "删除成功!");
            return "chengg";

        } else {
            request.setAttribute("msg", "删除失败!");
            return "shibai";
        }
       // return "forward:/problem/getAll.action";//此处有问题

    }







}
