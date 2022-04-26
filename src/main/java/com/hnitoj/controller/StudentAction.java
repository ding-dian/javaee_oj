package com.hnitoj.controller;

import com.hnitoj.pojo.Studentdd;
import com.hnitoj.service.StudentInfoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.List;

@Controller

public class StudentAction {
    //每页显示的记录数实验一
   // public static final int PAGE_SIZE =10;

    //切记:在界面层中,一定会有业务逻辑层的对象
    @Autowired
    StudentInfoService studentInfoService;


    //显示全部学生信息不分页
    @ResponseBody
    @RequestMapping("/getPage")
    public List<Studentdd> getAll(HttpServletRequest request, HttpServletResponse httpServletResponse) {
        List<Studentdd> list = studentInfoService.getPage();
        request.setAttribute("list", list);
        return list;
    }
    @ResponseBody
    @RequestMapping("/addBatch")
    public String save(Studentdd info, HttpServletRequest request,HttpServletResponse response) {
        int num = -1;
        try {
            num = studentInfoService.addBatch(info);

        } catch (Exception e) {
            e.printStackTrace();
        }
        if (num > 0) {
            request.setAttribute("msg", "增加成功!");
            return "addBatch success";
        } else {
            request.setAttribute("msg", "增加失败!");
            return "addBatch error";
        }

    }
    @ResponseBody
    @RequestMapping("/updateById")
    public String update(Studentdd info, HttpServletRequest request, HttpServletResponse response) {
        int num = -1;
        try {
            num = studentInfoService.updateById(info);
        } catch (Exception e) {
            e.printStackTrace();
        }
        if (num > 0) {
            //此时说明更新成功
           // request.setAttribute("msg", "更新成功!");
            return "updateById success";
        } else {
            //更新失败
           // request.setAttribute("msg", "更新失败!");
            return "updateById error";
        }

        //处理完更新后,saveFileName里有可能有数据,
        // 而下一次更新时要使用这个变量做为判断的依据,就会出错,所以必须清空saveFileName.
        //saveFileName = "";
        //return "forward:/prod/split.action";
    }


}
