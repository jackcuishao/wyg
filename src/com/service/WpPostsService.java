package com.service;

import com.dao.WpPostsDao;
import com.dao.WpUserDao;
import com.modal.WpPosts;
import com.modal.WpUsers;
import com.utils.Md5;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;

/**
 * Created by cuishaojie on 2017/2/8.
 */
@Service
public class WpPostsService {
    @Autowired
    private WpPostsDao postsDao;

    public void insert(WpPosts posts) {

        postsDao.insert(posts);
    }
}
