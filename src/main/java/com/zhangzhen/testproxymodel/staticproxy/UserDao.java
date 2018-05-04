package com.zhangzhen.testproxymodel.staticproxy;

/**
 * @author zhangzhen
 * @since 2018.05.04
 *
 * 这是目标对象(实现了接口)
 */
public class UserDao implements IUserDao {
    @Override
    public void save() {
        System.out.println("----已经保存数据!----");
    }
}
