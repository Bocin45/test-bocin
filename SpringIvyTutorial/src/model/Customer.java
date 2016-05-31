package src.model;

import javax.persistence.*;


@Entity
@Table(name = "CUSTOMER")
public class Customer implements java.io.Serializable {
	@Id
	@Column(name = "ID")
	private String id;
	
	@Column(name = "USER_NAME")
	private String Name;
	
	
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getName() {
		return Name;
	}
	public void setName(String name) {
		Name = name;
	}
	
	

}
