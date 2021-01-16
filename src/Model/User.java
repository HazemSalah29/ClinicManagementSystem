package Model;

import java.util.Date;

public class User {

	private String Id;
	private String name;
	private String type;
	private Date createdAt = new Date();
	private String email;
	private String password;
        private int age;
	
	
	public User() {
		super();
	}
	
	
	public User(String id, String name, String type, Date createdAt, String email, String password) {
		super();
		Id = id;
		this.name = name;
		this.type = type;
		this.createdAt = new Date();
		this.email = email;
		this.password = password;
	}

    public void setAge(int age) {
        this.age = age;
    }

    public int getAge() {
        return age;
    }
        


	public String getId() {
		return Id;
	}
	public void setId(String id) {
		Id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public Date getCreatedAt() {
		return createdAt;
	}
	public void setCreatedAt(Date createdAt) {
		this.createdAt = createdAt;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	
	
	
}
