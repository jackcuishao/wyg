package com.service;

import com.dao.WpUserDao;
import com.modal.WpUsers;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Created by cuishaojie on 2017/1/23.
 */
@Service
public class WpUserService {
    @Autowired
    WpUserDao userDao;

    public WpUsers unique(int i) {
        return userDao.unique(i);
    }


}
