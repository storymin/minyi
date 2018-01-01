package test;

import com.min.entity.UserEntity;
import com.min.service.MinyiService;

public class SpringTest
{
    public static void main(String[] args)
    {
        MinyiService minyiService=BeanUtil.getBean("minyiService");
        UserEntity userEntity=minyiService.getAll();
        System.out.println("Spring+mybati+mysql配置运行成功！"+"姓名:"+userEntity.getUserName()+":学校"+userEntity.getSchool());
    }
}
