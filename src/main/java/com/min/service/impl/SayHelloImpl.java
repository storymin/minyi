package com.min.service.impl;

import org.springframework.stereotype.Service;

import com.min.server.SayHello;

@Service("sayHello")
public class SayHelloImpl implements SayHello
{

    public void hello(String msg)
    {
        System.out.println("Hello "+msg);
    }

}
