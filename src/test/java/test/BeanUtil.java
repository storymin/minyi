package test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class BeanUtil
{
    public static <T> T getBean(String beanName)
    {
        ApplicationContext context = new ClassPathXmlApplicationContext(
                "spring.xml");
        Object object = context.getBean(beanName);
        return (T) object;
    }
}
