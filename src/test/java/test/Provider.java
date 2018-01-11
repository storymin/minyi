package test;

import java.io.IOException;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Provider
{
    public static void main(String[] args) throws IOException
    {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(
                new String[]{"spring.xml"});
        context.start();
        
        System.in.read();
    }
}
