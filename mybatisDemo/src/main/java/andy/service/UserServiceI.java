package andy.service;

import andy.model.User;

public interface UserServiceI {
	/**
	 * ����û�
	 * 
	 * @param user
	 */
	void addUser(User user);

	/**
	 * �����û�id��ȡ�û�
	 * 
	 * @param userId
	 * @return
	 */
	User getUserById(String userId);
}
