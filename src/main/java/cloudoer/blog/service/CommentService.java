package cloudoer.blog.service;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import cloudoer.blog.dao.CommentDao;
import cloudoer.blog.entity.Comment;




@Service
public class CommentService {

	@Resource(name = "commentDao")
	private CommentDao commentDao;
	
	@Transactional
	public List<Comment> getAll(){
		return commentDao.getAll();
	}
	
	@Transactional
	public List<Comment> getUserPage(int pageNo, int pageSize){
		return commentDao.getUserPage(pageNo, pageSize);
	}
	
	@Transactional
	public Comment getUserById(String commentId){
		return commentDao.getUserById(commentId);
	}
	
	@Transactional
	public String add(Comment comment){
		return commentDao.add(comment);
	}
	
	@Transactional
	public void update(Comment comment){
		commentDao.update(comment);
	}
	
	@Transactional
	public void delete (String commentId){
		commentDao.delete(commentId);
	}
	
	@Transactional
	public int getCount(){
		return commentDao.getCount();
	}
}
