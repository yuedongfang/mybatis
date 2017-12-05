package andy.test;
 

import java.util.Date;
import java.util.UUID;
import andy.model.User;
import andy.service.UserServiceI;
//import me.gacl.service.UserServiceI;
import org.junit.Before;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MyBatisTest {

    private UserServiceI userService;
    
    /**
     * ���before���������еĲ��Է���֮ǰִ�У�����ִֻ��һ��
     * ������Junit��Ԫ����ʱһЩ��ʼ��������������������������
     * ������before���������ʼ��ApplicationContext��userService
     */
    @Before
    public void before(){
        //ʹ��"spring.xml"��"spring-mybatis.xml"�����������ļ�����Spring������
        ApplicationContext ac = new ClassPathXmlApplicationContext(new String[]{"spring.xml","spring-mybatis.xml"});
        //��Spring�����и���bean��idȡ������Ҫʹ�õ�userService����
        userService = (UserServiceI) ac.getBean("userService");
    }
    
    @Test
    public void testAddUser(){
        //ApplicationContext ac = new ClassPathXmlApplicationContext(new String[]{"spring.xml","spring-mybatis.xml"});
        //UserServiceI userService = (UserServiceI) ac.getBean("userService");
        User user = new User();
        user.setUserId(UUID.randomUUID().toString().replaceAll("-", ""));
        user.setUserName("�׻����xdp");
        user.setUserBirthday(new Date());
        user.setUserSalary(10000D);
        userService.addUser(user);
    }
    
}