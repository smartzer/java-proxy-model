package com.zhangzhen.testproxymodel.cglibdynamicproxy;

/**
 * @author: zhangzhen
 * @since: 2018-05-04 18:28
 */
public class TestCglibDynamicProxy {

    public static void main(String[] args){
        // 目标对象
        UserDao target = new UserDao();
        // 为目标对象创建代理对象
        UserDao proxy = (UserDao) new CglibDynamicProxyFactory(target).getProxyInstance();
        proxy.save();
    }
}
