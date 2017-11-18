package cloudoer.blog.service;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import cloudoer.blog.dao.ArticleDao;
import cloudoer.blog.entity.Article;



@Service
public class ArticleService {

	@Resource(name = "articleDao")
	private ArticleDao articleDao;
	
	@Transactional
	public List<Article> getAll(){
		return articleDao.getAll();
	}
	
	@Transactional
	public List<Article> getUserPage(int pageNo, int pageSize){
		return articleDao.getUserPage(pageNo, pageSize);
	}
	
	@Transactional
	public Article getUserById(String articleId){
		return articleDao.getUserById(articleId);
	}
	
	@Transactional
	public String add(Article article){
		return articleDao.add(article);
	}
	
	@Transactional
	public void update(Article article){
		articleDao.update(article);
	}
	
	@Transactional
	public void delete (String articleId){
		articleDao.delete(articleId);
	}
	
	@Transactional
	public int getCount(){
		return articleDao.getCount();
	}
}
