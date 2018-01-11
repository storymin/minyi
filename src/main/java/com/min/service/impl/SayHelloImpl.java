package com.min.service.impl;

import org.springframework.stereotype.Service;

import com.gzu.SayHello;

@Service("sayHello")
public class SayHelloImpl implements SayHello
{

    public void hello(String msg)
    {
        System.out.println("Hello "+msg);
    }

}
