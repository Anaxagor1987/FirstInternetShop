package ua.lviv.anax.fis.domain;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="Users bucket")
public class Bucket {
	@Id
	@Column(name="id")
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int id;
	@Column(name="user")
	private User user;
	@Column(name="OrderList")
	private List<Product>productList;
	
	public Bucket() {
		
	}

	public Bucket(User user, List<Product> productList) {
		this.user = user;
		this.productList = productList;
	}

	public Bucket(int id, User user, List<Product> productList) {
		this.id = id;
		this.user = user;
		this.productList = productList;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}

	public List<Product> getProductList() {
		return productList;
	}

	public void setProductList(List<Product> productList) {
		this.productList = productList;
	}
	
}
