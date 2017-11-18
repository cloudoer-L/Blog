package cloudoer.blog.dao;

import java.util.List;

import javax.annotation.Resource;

import org.hibernate.Query;
import org.hibernate.SessionFactory;
import org.springframework.stereotype.Repository;

import cloudoer.blog.entity.Article;



@Repository
public class ArticleDao {

	@Resource(name = "sessionFactory")
	private SessionFactory factory;
	
	public List<Article> getAll(){
		String queryString = "from Article";
		Query queryObject = factory.getCurrentSession().createQuery(queryString);
		return queryObject.list();
	}
	
	public List<Article> getUserPage(int pageNo, int pageSize){
		String queryString = "from Article";
		Query queryObject = factory.getCurrentSession().createQuery(queryString);
		queryObject.setFirstResult((pageNo - 1) * pageSize);  
		queryObject.setMaxResults(pageSize);
		return queryObject.list();
	}
	
	public Article getUserById (String articleId){
		return (Article) factory.getCurrentSession().get(Article.class, articleId);
	}
	
	public String add(Article article){
		return factory.getCurrentSession().save(article).toString();
	}
	
	public void update(Article article){
		factory.getCurrentSession().update(article);
	}
	
	public void delete(String articleId){
		Article article = getUserById(articleId);
		factory.getCurrentSession().delete(article);
	}
	
	public int getCount(){
		Query query = factory.getCurrentSession().createQuery("select count(id) from Article");
		return ((Number)query.uniqueResult()).intValue();
	}
}
