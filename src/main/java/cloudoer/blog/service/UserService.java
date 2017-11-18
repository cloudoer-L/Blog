package cloudoer.blog.service;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import cloudoer.blog.dao.UserDao;
import cloudoer.blog.entity.User;

@Service
public class UserService {

	@Resource(name = "userDao")
	private UserDao userDao;
	
	@Transactional
	public User login(User user){
		return userDao.login(user);
	}
	
	@Transactional
	public List<User> getAll(){
		return userDao.getAll();
	}
	
	@Transactional
	public List<User> getUserPage(int pageNo, int pageSize){
		return userDao.getUserPage(pageNo, pageSize);
	}
	
	@Transactional
	public User getUserById(String userId){
		return userDao.getUserById(userId);
	}
	
	@Transactional
	public String add(User user){
		return userDao.add(user);
	}
	
	@Transactional
	public void update(User user){
		userDao.update(user);
	}
	
	@Transactional
	public void delete (String userId){
		userDao.delete(userId);
	}
	
	@Transactional
	public int getCount(){
		return userDao.getCount();
	}
	
}
