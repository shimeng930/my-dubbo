package com.shim.provider;

import com.shim.api.SayHello;
import org.springframework.stereotype.Service;

/**
 * @类描述：
 * @创建人：xn064961
 * @创建时间：2017/4/11
 * @版权：Copyright (c) 深圳市牛鼎丰科技有限公司-版权所有.
 */
@Service("sayHelloService")
public class SayHelloImpl implements SayHello {

    @Override
    public String sayHello(String hello) {
        System.out.println(String.format("say {%s} to client", hello));
        return "i get message:" + hello;
    }
}
