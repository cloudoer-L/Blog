package cloudoer.blog.service;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import cloudoer.blog.dao.TypeDao;
import cloudoer.blog.entity.Type;


@Service
public class TypeService {

	@Resource(name = "typeDao")
	private TypeDao typeDao;
	
	@Transactional
	public List<Type> getAll(){
		return typeDao.getAll();
	}
	
	@Transactional
	public List<Type> getUserPage(int pageNo, int pageSize){
		return typeDao.getUserPage(pageNo, pageSize);
	}
	
	@Transactional
	public Type getUserById(String typeId){
		return typeDao.getUserById(typeId);
	}
	
	@Transactional
	public String add(Type type){
		return typeDao.add(type);
	}
	
	@Transactional
	public void update(Type type){
		typeDao.update(type);
	}
	
	@Transactional
	public void delete (String typeId){
		typeDao.delete(typeId);
	}
	
	@Transactional
	public int getCount(){
		return typeDao.getCount();
	}
}
