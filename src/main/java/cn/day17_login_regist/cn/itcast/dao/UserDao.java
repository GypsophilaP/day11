package cn.day17_login_regist.cn.itcast.dao;

import cn.day17_login_regist.cn.itcast.pojo.User;

/**
 * Created by Gypsophila on 2018/4/26.
 *
 * 这是针对用户进行操作的接口
 *
 */
public interface UserDao {
    public abstract boolean isLogin(String username,String password);

    public abstract void regist(User user);


}
