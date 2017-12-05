package andy.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import andy.dao.UserMapper;
import andy.model.User;
import andy.service.UserServiceI;

@Service("userService")
public class UserServiceImpl implements UserServiceI {

    /**
     * ʹ��@Autowiredע���עuserMapper������
     * ����Ҫʹ��UserMapperʱ��Spring�ͻ��Զ�ע��UserMapper
     */
    @Autowired
    private UserMapper userMapper;//ע��dao

	public void addUser(User user) {
		userMapper.insert(user); 
	} 
	public User getUserById(String userId) {
		 return userMapper.selectByPrimaryKey(userId);
	}

 
}
