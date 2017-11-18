package cloudoer.blog.dao;

import java.util.List;

import javax.annotation.Resource;

import org.hibernate.Query;
import org.hibernate.SessionFactory;
import org.springframework.stereotype.Repository;

import cloudoer.blog.entity.Type;


@Repository
public class TypeDao {

	@Resource(name = "sessionFactory")
	private SessionFactory factory;
	
	public List<Type> getAll(){
		String queryString = "from Type";
		Query queryObject = factory.getCurrentSession().createQuery(queryString);
		return queryObject.list();
	}
	
	public List<Type> getUserPage(int pageNo, int pageSize){
		String queryString = "from Type";
		Query queryObject = factory.getCurrentSession().createQuery(queryString);
		queryObject.setFirstResult((pageNo - 1) * pageSize);  
		queryObject.setMaxResults(pageSize);
		return queryObject.list();
	}
	
	public Type getUserById (String typeId){
		return (Type) factory.getCurrentSession().get(Type.class, typeId);
	}
	
	public String add(Type type){
		return factory.getCurrentSession().save(type).toString();
	}
	
	public void update(Type type){
		factory.getCurrentSession().update(type);
	}
	
	public void delete(String typeId){
		Type type = getUserById(typeId);
		factory.getCurrentSession().delete(type);
	}
	
	public int getCount(){
		Query query = factory.getCurrentSession().createQuery("select count(id) from Type");
		return ((Number)query.uniqueResult()).intValue();
	}
}
