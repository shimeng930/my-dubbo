package com.shim.consumer;

import com.shim.api.SayHello;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @类描述：
 * @创建人：xn064961
 * @创建时间：2017/4/11
 * @版权：Copyright (c) 深圳市牛鼎丰科技有限公司-版权所有.
 */
public class GetMessage {

    public void sayHello(){
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(
                new String[] { "consumer.xml" });

        context.start();

        //获取服务器那边的bean
        SayHello sayHelloService = (SayHello) context.getBean("sayHelloService");

        System.out.println(sayHelloService.sayHello("lisi"));
    }
}
