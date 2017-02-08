package com.controller.admin;

import com.modal.WpPosts;
import com.service.WpPostsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by cuishaojie on 2017/1/25.
 */
@Controller
@RequestMapping("/admin/post")
public class PostController {
    @Autowired
    WpPostsService wpPostsService;
    /**
     * 添加页面
     * @return
     */
    @RequestMapping("/addview")
    public String addview(){
        return "/admin/post/addview.html";
    }

    /**
     * 添加
     * @return
     */
    @RequestMapping("/add")
    public String add(WpPosts posts){
        wpPostsService.insert(posts);
        return "/admin/post/index.html";
    }
}
