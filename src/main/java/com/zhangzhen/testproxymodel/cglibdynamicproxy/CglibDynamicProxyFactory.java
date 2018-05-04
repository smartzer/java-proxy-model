package com.zhangzhen.testproxymodel.cglibdynamicproxy;

import org.aopalliance.intercept.MethodInvocation;
import org.springframework.cglib.proxy.Callback;
import org.springframework.cglib.proxy.Enhancer;
import org.springframework.cglib.proxy.MethodInterceptor;
import org.springframework.cglib.proxy.MethodProxy;

import java.lang.reflect.Method;

/**
 * @author: zhangzhen
 * @since: 2018-05-04 17:34 cglib 动态代理
 *     <p>有时候目标对象只是一个单独的对象,并没有实现任何的接口,这个时候就可以使用以目标对象子类的方式类实现代理,这种方法就叫做:Cglib代理.
 *     Cglib代理,也叫作子类代理,它是在内存中构建一个子类对象从而实现对目标对象功能的扩展.
 *     <p>Cglib是一个强大的高性能的代码生成包,它可以在运行期扩展java类与实现java接口.它广泛的被许多AOP的框架使用, 例如Spring AOP和synaop,为他们提供方法的interception(拦截)
 *     <p>Cglib子类代理实现方法:
 *     <p>1.需要引入cglib的jar文件,但是Spring的核心包中已经包括了Cglib功能,所以直接引入pring-core-3.2.5.jar即可.
 *     <p>2.引入功能包后,就可以在内存中动态构建子类
 *     <p>3.代理的类不能为final,否则报错
 *     <p>4.目标对象的方法如果为final/static,那么就不会被拦截,即不会执行目标对象额外的业务方法.
 */
public class CglibDynamicProxyFactory implements MethodInterceptor {

    private Object target;

    public CglibDynamicProxyFactory(Object target) {
        this.target = target;
    }

    public Object getProxyInstance() {
        // 工具类
        Enhancer en = new Enhancer();
        // 设置父类
        en.setSuperclass(target.getClass());
        // 设置回调
        en.setCallback(this);
        // 创建（）
        return en.create();
    }

    @Override
    public Object intercept(Object o, Method method, Object[] objects, MethodProxy methodProxy) throws Throwable {
        System.out.println("cglib动态代理开始事务...");
        Object invoke = method.invoke(target);
        System.out.println("cglib动态代理提交事务...");
        return invoke;
    }
}
