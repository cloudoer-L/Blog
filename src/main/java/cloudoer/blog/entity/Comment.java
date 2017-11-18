package cloudoer.blog.entity;
// default package



/**
 * Comment entity. @author MyEclipse Persistence Tools
 */

public class Comment  implements java.io.Serializable {


    // Fields    

     private String id;
     private String contents;
     private String date;
     private String idOpen;
     
     private User user;
     private Article article;


    // Constructors

    /** default constructor */
    public Comment() {
    }

	/** minimal constructor */
    public Comment(String id) {
        this.id = id;
    }
    
    /** full constructor */
    public Comment(String id, String contents, String date, String idOpen) {
        this.id = id;
        this.contents = contents;
        this.date = date;
        this.idOpen = idOpen;
    }

   
    // Property accessors

    public String getId() {
        return this.id;
    }
    
    public void setId(String id) {
        this.id = id;
    }

    public String getContents() {
        return this.contents;
    }
    
    public void setContents(String contents) {
        this.contents = contents;
    }

    public String getDate() {
        return this.date;
    }
    
    public void setDate(String date) {
        this.date = date;
    }

    public String getIdOpen() {
        return this.idOpen;
    }
    
    public void setIdOpen(String idOpen) {
        this.idOpen = idOpen;
    }

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}

	public Article getArticle() {
		return article;
	}

	public void setArticle(Article article) {
		this.article = article;
	}

	@Override
	public String toString() {
		return "Comment [article=" + article + ", contents=" + contents
				+ ", date=" + date + ", id=" + id + ", idOpen=" + idOpen
				+ ", user=" + user + "]";
	}
   








}