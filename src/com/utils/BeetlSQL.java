package com.utils;

import org.beetl.sql.core.*;
import org.beetl.sql.core.db.DBStyle;
import org.beetl.sql.core.db.MySqlStyle;
import org.beetl.sql.ext.DebugInterceptor;
import org.beetl.sql.ext.gen.GenConfig;
import org.beetl.sql.ext.gen.GenFilter;

/**
 * Created by cuishaojie on 2017/1/13.
 */
public class BeetlSQL {
    public static void main(String[] args) {

        ConnectionSource source = ConnectionSourceHelper.getSimple("com.mysql.jdbc.Driver","jdbc:mysql://localhost:3306/wordpress","root","root");
        DBStyle mysql = new MySqlStyle();
        // sql语句放在classpagth的/sql 目录下
        SQLLoader loader = new ClasspathLoader("/com/modal/sql");
        // 数据库命名跟java命名一样，所以采用DefaultNameConversion，还有一个是UnderlinedNameConversion，下划线风格的
        UnderlinedNameConversion nc = new  UnderlinedNameConversion();
        // 最后，创建一个SQLManager,DebugInterceptor 不是必须的，但可以通过它查看sql执行情况
        SQLManager sqlManager = new SQLManager(mysql,loader,source,nc,new Interceptor[]{new DebugInterceptor()});
//
//
//        //使用内置的生成的sql 新增用户，如果需要获取主键，可以传入KeyHolder
//        User user = new User();
//        user.setAge(19);
//        user.setName("xiandafu");
//        sqlManager.insert(user);
//
//        sqlManager.template(user,1,3);
//
//        //使用内置sql查询用户
//        int id = 1;
//        user = sqlManager.unique(User.class,id);
//
//        //模板更新,仅仅根据id更新值不为null的列
//        User newUser = new User();
//        newUser.setId(1);
//        newUser.setAge(20);
//        sqlManager.updateTemplateById(newUser);
//
//        //模板查询
//        User query = new User();
//        query.setName("xiandafu");
//        List<User> list = sqlManager.template(query);
//
//
//        //使用user.md 文件里的select语句，参考下一节。
//        User query2 = new User();
//        query.setName("xiandafu");
//        List<User> list2 = sqlManager.select("user.select",User.class,query2);


        //数据库全部生成,不可卵用,可加过滤器
        try {
            sqlManager.genALL("com.modal", new GenConfig(), new GenFilter(){
                public boolean accept(String tableName) {
                    if (tableName.equalsIgnoreCase("wp_posts")) {
                        return true;
                    } else {
                        return false;
                    }
                    // return false
                }
            });
        } catch (Exception e) {
            e.printStackTrace();
        }

    }
}
