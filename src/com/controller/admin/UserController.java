package com.controller.admin;

import com.dao.WpUserDao;
import com.modal.WpUsers;
import com.service.WpUserService;
import org.beetl.sql.core.engine.PageQuery;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

/**
 * Created by cuishaojie on 2017/1/24.
 */
@Controller
@RequestMapping("/admin/user")
public class UserController {
    @Autowired
    private WpUserService userService;

    @Autowired
    private WpUserDao userDao;

    @RequestMapping("/userlist")
    public ModelAndView userlist(@RequestParam(value="page", defaultValue="1") Long page, WpUsers users){
        PageQuery pager = userService.PageQuery(page,users);
        ModelAndView modelAndView = new ModelAndView("/admin/user/userlist.html");
        modelAndView.addObject("pager",pager);
        return modelAndView;
    }


    @RequestMapping("/addview")
    public String addview(){
        return "/admin/user/addview.html";
    }

    @RequestMapping("/useradd")
    public String useradd(WpUsers users){
        userService.insert(users);
        return "redirect:/admin/user/userlist.do";
    }
}
