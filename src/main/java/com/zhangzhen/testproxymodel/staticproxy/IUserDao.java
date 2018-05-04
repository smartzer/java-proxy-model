package com.zhangzhen.testproxymodel.staticproxy;

/**
 * @author zhangzhen
 * @since 2018.05.04
 *
 * 这是接口
 */
public interface IUserDao {

    /**
     * 静态代理在使用时,需要定义接口或者父类,被代理对象与代理对象一起实现相同的接口或者是继承相同父类.
     */
    void save();
}
