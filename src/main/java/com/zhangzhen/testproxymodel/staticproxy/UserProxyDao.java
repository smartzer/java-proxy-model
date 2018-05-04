package com.zhangzhen.testproxymodel.staticproxy;

/**
 * @author: zhangzhen
 * @since: 2018-05-04 15:04
 *
 * 这是代理对象，静态代理
 */
public class UserProxyDao implements IUserDao {
    // 接收保存目标对象
    private IUserDao target;

    public UserProxyDao(IUserDao target) {
        this.target = target;
    }

    @Override
    public void save() {
        System.out.println("静态代理开始事务...");
        //执行目标对象的方法
        target.save();
        System.out.println("静态代理提交事务...");
    }
}
