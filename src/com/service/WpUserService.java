package com.service;

import com.dao.WpUserDao;
import com.modal.WpUsers;
import com.utils.Md5;
import org.beetl.sql.core.annotatoin.Sql;
import org.beetl.sql.core.db.KeyHolder;
import org.beetl.sql.core.engine.PageQuery;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;

/**
 * Created by cuishaojie on 2017/1/23.
 */
@Service
public class WpUserService {
    @Autowired
    private WpUserDao userDao;

    public WpUsers unique(int i) {
        return userDao.unique(i);
    }


    public void insert(WpUsers users) {
        users.setUserPass(Md5.getMD5(users.getUserPass()));
        users.setUserRegistered(new Date());
        userDao.insert(users);
    }

    public PageQuery PageQuery(Long page, WpUsers users) {
        PageQuery query = new PageQuery(page,users);
        userDao.getSQLManager().pageQuery("wpUsers.queryWpUser",WpUsers.class,query);
        return query;
    }
}
