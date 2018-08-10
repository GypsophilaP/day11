package cn.day17_login_regist.cn.itcast.impl;

import cn.day17_login_regist.cn.itcast.dao.UserDao;
import cn.day17_login_regist.cn.itcast.pojo.User;

import java.util.ArrayList;

/**
 * Created by Gypsophila on 2018/4/27.
 */
public class UserDaoImpl implements UserDao{
    private ArrayList<User> array = new ArrayList<User>();
    public boolean isLogin(String username,String password){

        boolean flag = false;
        for (User user :
                array) {
            if (user.getUsername().equals(username) && user.getPassword().equals(password)) {
                flag = true;break;
            }
        }
        
        return flag;
    }

    public void regist(User user){
        ArrayList<User> array = new ArrayList<User>();
        array.add(user);

    }
}
