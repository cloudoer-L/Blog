package cloudoer.blog.action;

import javax.annotation.Resource;

import org.apache.struts2.ServletActionContext;
import org.springframework.stereotype.Controller;

import cloudoer.blog.entity.User;
import cloudoer.blog.service.UserService;


@Controller
public class LoginAction {

	@Resource(name = "userService")
	private UserService userService;
	
	private User user;

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}
	
	public String view(){
		return "success";
	}
	
	public String login(){
		//User user0 = userService.login(user);
		System.out.println(user);
		return "admin";
		/*if (user0 != null){
			ServletActionContext.getRequest().getSession().setAttribute("user", user0);
			if ("0".equals(user0.getIsAdmin())){
				return "admin";
			}else {
				return "visitor";
			}
		}else{
			return "view";
		}*/
	}
}
