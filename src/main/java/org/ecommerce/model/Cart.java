package org.ecommerce.model;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

import lombok.Data;

@Data
@Entity
public class Cart {

	public Cart() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Cart(int cartId, int productId, double price, int quantity, String email) {
		super();
		this.cartId = cartId;
		this.productId = productId;
		this.price = price;
		this.quantity = quantity;
		this.email = email;
	}
	@Override
	public String toString() {
		return "Cart [cartId=" + cartId + ", productId=" + productId + ", price=" + price + ", quantity=" + quantity
				+ ", email=" + email + "]";
	}
	public int getCartId() {
		return cartId;
	}
	public void setCartId(int cartId) {
		this.cartId = cartId;
	}
	public int getProductId() {
		return productId;
	}
	public void setProductId(int productId) {
		this.productId = productId;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	public int getQuantity() {
		return quantity;
	}
	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	@Id
	@GeneratedValue
	private int cartId;
	private int productId;
	private double price;
	private int quantity;
	private String email;
	
	
		
}
