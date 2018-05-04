package com.zhangzhen.testproxymodel.jdkdynamicproxy;

import com.zhangzhen.testproxymodel.staticproxy.IUserDao;
import com.zhangzhen.testproxymodel.staticproxy.UserDao;

/**
 * @author: zhangzhen
 * @since: 2018-05-04 17:26
 */
public class TestJdkDynamicProxy {

    public static void main(String[] args) {
        // 目标对象
        IUserDao target = new UserDao();
        // 原始类型 class com.zhangzhen.testproxymodel.staticproxy.UserDao
        System.out.println(target.getClass());
        // 给目标对象创建代理对象 class com.sun.proxy.$Proxy0
        IUserDao proxy = (IUserDao) new ProxyFactory(target).getProxyInstance();
        // 代理的类型
        System.out.println(proxy.getClass());
        proxy.save();
    }
}
