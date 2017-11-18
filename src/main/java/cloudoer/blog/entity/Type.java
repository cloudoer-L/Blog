package cloudoer.blog.entity;

import java.util.Set;

// default package



/**
 * Type entity. @author MyEclipse Persistence Tools
 */

public class Type  implements java.io.Serializable {


    // Fields    

     private String id;
     private String name;
     private String isType;
     private String isMenu;
     private String url;

     private Set<Article> articles;

    // Constructors

    /** default constructor */
    public Type() {
    }

	/** minimal constructor */
    public Type(String id) {
        this.id = id;
    }
    
    /** full constructor */
    public Type(String id, String name, String isType, String isMenu, String url) {
        this.id = id;
        this.name = name;
        this.isType = isType;
        this.isMenu = isMenu;
        this.url = url;
    }

   
    // Property accessors

    public String getId() {
        return this.id;
    }
    
    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return this.name;
    }
    
    public void setName(String name) {
        this.name = name;
    }

    public String getIsType() {
        return this.isType;
    }
    
    public void setIsType(String isType) {
        this.isType = isType;
    }

    public String getIsMenu() {
        return this.isMenu;
    }
    
    public void setIsMenu(String isMenu) {
        this.isMenu = isMenu;
    }

    public String getUrl() {
        return this.url;
    }
    
    public void setUrl(String url) {
        this.url = url;
    }

	public Set<Article> getArticles() {
		return articles;
	}

	public void setArticles(Set<Article> articles) {
		this.articles = articles;
	}

	@Override
	public String toString() {
		return "Type [id=" + id + ", isMenu=" + isMenu + ", isType=" + isType
				+ ", name=" + name + ", url=" + url + "]";
	}
   

}