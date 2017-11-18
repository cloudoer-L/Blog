package cloudoer.blog.dao;

import java.util.List;

import javax.annotation.Resource;

import org.hibernate.Query;
import org.hibernate.SessionFactory;
import org.springframework.stereotype.Repository;

import cloudoer.blog.entity.Comment;




@Repository
public class CommentDao {

	@Resource(name = "sessionFactory")
	private SessionFactory factory;
	
	public List<Comment> getAll(){
		String queryString = "from Comment";
		Query queryObject = factory.getCurrentSession().createQuery(queryString);
		return queryObject.list();
	}
	
	public List<Comment> getUserPage(int pageNo, int pageSize){
		String queryString = "from Comment";
		Query queryObject = factory.getCurrentSession().createQuery(queryString);
		queryObject.setFirstResult((pageNo - 1) * pageSize);  
		queryObject.setMaxResults(pageSize);
		return queryObject.list();
	}
	
	public Comment getUserById (String commentId){
		return (Comment) factory.getCurrentSession().get(Comment.class, commentId);
	}
	
	public String add(Comment comment){
		return factory.getCurrentSession().save(comment).toString();
	}
	
	public void update(Comment comment){
		factory.getCurrentSession().update(comment);
	}
	
	public void delete(String commentId){
		Comment comment = getUserById(commentId);
		factory.getCurrentSession().delete(comment);
	}
	
	public int getCount(){
		Query query = factory.getCurrentSession().createQuery("select count(id) from Comment");
		return ((Number)query.uniqueResult()).intValue();
	}
}
