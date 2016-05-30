package src.model;

import javax.persistence.*;


@Entity
@Table(name = "CUSTOMER")
public class Customer {
	@Id
	@Column(name = "Id")
	private String id;
	
	@Column(name = "user_name")
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
