package com.controller.admin;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by cuishaojie on 2017/1/25.
 */
@Controller
@RequestMapping("/admin/post")
public class PostController {
    @RequestMapping("/addview")
    public String addview(){
        return "/admin/post/addview.html";
    }
}
