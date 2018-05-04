package com.zhangzhen.testproxymodel.cglibdynamicproxy;

/**
 * @author: zhangzhen
 * @since: 2018-05-04 17:39
 * 目标对象
 */
public class UserDao {

    public void save() {
        System.out.println("----已经保存数据!----");
    }
}
