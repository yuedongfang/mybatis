package andy.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import andy.dao.UserMapper;
import andy.model.User;
import andy.service.UserServiceI;

@Service("userService")
public class UserServiceImpl implements UserServiceI {

    /**
     * 使用@Autowired注解标注userMapper变量，
     * 当需要使用UserMapper时，Spring就会自动注入UserMapper
     */
    @Autowired
    private UserMapper userMapper;//注入dao

	public void addUser(User user) {
		userMapper.insert(user); 
	} 
	public User getUserById(String userId) {
		 return userMapper.selectByPrimaryKey(userId);
	}

 
}
