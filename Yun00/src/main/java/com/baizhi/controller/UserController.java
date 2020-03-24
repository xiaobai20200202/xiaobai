package com.baizhi.controller;

import com.alibaba.druid.support.json.JSONUtils;
import com.baizhi.entity.User;
import com.baizhi.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;
import java.util.Map;

@Controller
public class UserController {

    @Autowired
    private UserService userService;

    private int pageNow=1;
    private int pageSize=5;
    private int totalpage;

    @RequestMapping("/save")
    public String save(User user){
        userService.saveUser(user);
        System.out.println(user);
        return "redirect:/queryUserByPage";
    }

    @RequestMapping("/login")
    public String login(String name,String password,Map map){
        User user = userService.login(name, password);
        map.put("user",user);
        return "index";
    }

    @RequestMapping("/queryUserById")
    public String queryUserById(Map map,int id){
        User user = userService.queryUserById(id);
        map.put("user",user);
        return "forward:showone.jsp";
    }

    @RequestMapping("/updateUser")
    public String updateUser(User user){
        userService.updateUser(user);
        return "redirect:/queryUserByPage";
    }

    @RequestMapping("/queryUserByPage")
    public String queryUserByPage(String column,String value,Map map){
        System.out.println(pageNow+"  "+pageSize+" "+column+" "+value);
        List<User> users = userService.queryUserByPage(pageNow, 3,column,value);
        //totalpage=userService.countTotal(pageSize,column,value);
        System.out.println(users);
        for (User user : users) {
            System.out.println("aa");
            System.out.println(user);
        }
        map.put("list",users);
        return "redirect:showAll.jsp";
    }


    @RequestMapping("/delete")
    public String delete(Integer[] ids){
        userService.deleteByUserIds(ids);
        return "redirect:/queryUserByPage";
    }



    public int getPageNow() {
        return pageNow;
    }

    public void setPageNow(int pageNow) {
        this.pageNow = pageNow;
    }

    public int getPageSize() {
        return pageSize;
    }

    public void setPageSize(int pageSize) {
        this.pageSize = pageSize;
    }

    public int getTotalpage() {
        return totalpage;
    }

    public void setTotalpage(int totalpage) {
        this.totalpage = totalpage;
    }
}
