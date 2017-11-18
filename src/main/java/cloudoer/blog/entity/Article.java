package cloudoer.blog.entity;

import java.util.Set;

// default package



/**
 * Article entity. @author MyEclipse Persistence Tools
 */

public class Article  implements java.io.Serializable {


    // Fields    

     private String id;
     private String titile;
     private String contents;
     private String date;
     private String image;
     private String source;
     private Integer praise;
     private Integer tease;
     
     private Type type;
     private Set<Comment> comments;


    // Constructors

    /** default constructor */
    public Article() {
    }

	/** minimal constructor */
    public Article(String id) {
        this.id = id;
    }
    
    /** full constructor */
    public Article(String id, String titile, String contents, String date, String image, String source, Integer praise, Integer tease) {
        this.id = id;
        this.titile = titile;
        this.contents = contents;
        this.date = date;
        this.image = image;
        this.source = source;
        this.praise = praise;
        this.tease = tease;
    }

   
    // Property accessors

    public String getId() {
        return this.id;
    }
    
    public void setId(String id) {
        this.id = id;
    }

    public String getTitile() {
        return this.titile;
    }
    
    public void setTitile(String titile) {
        this.titile = titile;
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

    public String getImage() {
        return this.image;
    }
    
    public void setImage(String image) {
        this.image = image;
    }

    public String getSource() {
        return this.source;
    }
    
    public void setSource(String source) {
        this.source = source;
    }

    public Integer getPraise() {
        return this.praise;
    }
    
    public void setPraise(Integer praise) {
        this.praise = praise;
    }

    public Integer getTease() {
        return this.tease;
    }
    
    public void setTease(Integer tease) {
        this.tease = tease;
    }

	public Type getType() {
		return type;
	}

	public void setType(Type type) {
		this.type = type;
	}

	public Set<Comment> getComments() {
		return comments;
	}

	public void setComments(Set<Comment> comments) {
		this.comments = comments;
	}

	@Override
	public String toString() {
		return "Article [contents=" + contents + ", date=" + date + ", id="
				+ id + ", image=" + image + ", praise=" + praise + ", source="
				+ source + ", tease=" + tease + ", titile=" + titile
				+ ", type=" + type + "]";
	}
   








}