package cloudoer.blog.dao;

import java.util.List;

import javax.annotation.Resource;

import org.hibernate.Query;
import org.hibernate.SessionFactory;
import org.springframework.stereotype.Repository;

import cloudoer.blog.entity.User;

@Repository
public class UserDao {

	@Resource(name = "sessionFactory")
	private SessionFactory factory;
	
	public User login(User user){
		String queryString = "from User where userName=? and password=?";
		User user0 = null;
		Query queryObject = factory.getCurrentSession().createQuery(queryString);
		queryObject.setString(0, user.getUserName());
		queryObject.setString(1, user.getPassword());
		List<User> list = queryObject.list();
		if(list != null && list.size() > 0){
			user0 = list.get(0);
		}
		return user0;
	}
	
	public List<User> getAll(){
		String queryString = "from User";
		Query queryObject = factory.getCurrentSession().createQuery(queryString);
		return queryObject.list();
	}
	
	public List<User> getUserPage(int pageNo, int pageSize){
		String queryString = "from User";
		Query queryObject = factory.getCurrentSession().createQuery(queryString);
		queryObject.setFirstResult((pageNo - 1) * pageSize);  
		queryObject.setMaxResults(pageSize);
		return queryObject.list();
	}
	
	public User getUserById (String userId){
		return (User) factory.getCurrentSession().get(User.class, userId);
	}
	
	public String add(User user){
		return factory.getCurrentSession().save(user).toString();
	}
	
	public void update(User user){
		factory.getCurrentSession().update(user);
	}
	
	public void delete(String userId){
		User user = getUserById(userId);
		factory.getCurrentSession().delete(user);
	}
	
	public int getCount(){
		Query query = factory.getCurrentSession().createQuery("select count(id) from User");
		return ((Number)query.uniqueResult()).intValue();
	}
}
