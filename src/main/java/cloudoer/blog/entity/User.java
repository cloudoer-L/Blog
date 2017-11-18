package cloudoer.blog.entity;

import java.util.Set;

// default package



/**
 * User entity. @author MyEclipse Persistence Tools
 */

public class User  implements java.io.Serializable {


    // Fields    

     private String id;
     private String userName;
     private String password;
     private String name;
     private String phone;
     private String email;
     private Integer age;
     private String sex;
     private String hobby;
     private String isAdmin;

     private Set<Comment> comments;

    // Constructors

    /** default constructor */
    public User() {
    }

	/** minimal constructor */
    public User(String id) {
        this.id = id;
    }
    
    /** full constructor */
    public User(String id, String userName, String password, String name, String phone, String email, Integer age, String sex, String hobby) {
        this.id = id;
        this.userName = userName;
        this.password = password;
        this.name = name;
        this.phone = phone;
        this.email = email;
        this.age = age;
        this.sex = sex;
        this.hobby = hobby;
    }

   
    // Property accessors

    public String getId() {
        return this.id;
    }
    
    public void setId(String id) {
        this.id = id;
    }

    public String getUserName() {
        return this.userName;
    }
    
    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPassword() {
        return this.password;
    }
    
    public void setPassword(String password) {
        this.password = password;
    }

    public String getName() {
        return this.name;
    }
    
    public void setName(String name) {
        this.name = name;
    }

    public String getPhone() {
        return this.phone;
    }
    
    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getEmail() {
        return this.email;
    }
    
    public void setEmail(String email) {
        this.email = email;
    }

    public Integer getAge() {
        return this.age;
    }
    
    public void setAge(Integer age) {
        this.age = age;
    }

    public String getSex() {
        return this.sex;
    }
    
    public void setSex(String sex) {
        this.sex = sex;
    }

    public String getHobby() {
        return this.hobby;
    }
    
    public void setHobby(String hobby) {
        this.hobby = hobby;
    }

	public Set<Comment> getComments() {
		return comments;
	}

	public void setComments(Set<Comment> comments) {
		this.comments = comments;
	}

	public String getIsAdmin() {
		return isAdmin;
	}

	public void setIsAdmin(String isAdmin) {
		this.isAdmin = isAdmin;
	}

	@Override
	public String toString() {
		return "User [id=" + id + ", userName=" + userName + ", password="
				+ password + ", name=" + name + ", phone=" + phone + ", email="
				+ email + ", age=" + age + ", sex=" + sex + ", hobby=" + hobby
				+ ", isAdmin=" + isAdmin + "]";
	}
}