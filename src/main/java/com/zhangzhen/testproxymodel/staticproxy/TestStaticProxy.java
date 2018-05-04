package com.zhangzhen.testproxymodel.staticproxy;

/**
 * @author: zhangzhen
 * @since: 2018-05-04 15:10
 *
 * 静态代理测试类
 */
public class TestStaticProxy {

    public static void main(String[] args) {
        // 目标对象
        UserDao target = new UserDao();
        // 创建代理对象，维护代理对象和目标对象的关系，用代理对象的构造方法来实现
        UserProxyDao proxy = new UserProxyDao(target);
        // 执行代理方法
        proxy.save();

        //执行结果,目标对象本来只有保存数据的方法，通过代理，加了事务的处理（模拟）
        //开始事务...
        //----已经保存数据!----
        //提交事务...

        // 静态代理：优点
        // 可以做到在不修改目标对象的功能前提下,对目标功能扩展.
        // 静态代理：缺点
        // 因为代理对象需要与目标对象实现一样的接口,所以会有很多代理类,类太多.同时,一旦接口增加方法,目标对象与代理对象都要维护.

    }

}
