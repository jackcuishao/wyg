package com.controller.admin;

import com.dao.WpUserDao;
import com.modal.WpUsers;
import com.service.WpUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

/**
 * Created by cuishaojie on 2017/1/23.
 */
@Controller
@RequestMapping("/admin")
public class AdminController {
    @Autowired
    WpUserService userService;

    @Autowired
    private WpUserDao userDao;

    @RequestMapping("/index")
    public ModelAndView index(){
        ModelAndView view = new ModelAndView("/admin/index.html");
        return view;
    }

}
