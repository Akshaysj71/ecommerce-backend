package org.ecommerce.model;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

import lombok.Data;

@Data
@Entity
public class OrderedProductInfo
{
	public OrderedProductInfo() {
		super();
		// TODO Auto-generated constructor stub
	}

	public OrderedProductInfo(int orderinfoId, int productId, String productName, double productPrice,
			int productQuantity, double totalPrice, Order order) {
		super();
		this.orderinfoId = orderinfoId;
		this.productId = productId;
		this.productName = productName;
		this.productPrice = productPrice;
		this.productQuantity = productQuantity;
		this.totalPrice = totalPrice;
		this.order = order;
	}

	@Override
	public String toString() {
		return "OrderedProductInfo [orderinfoId=" + orderinfoId + ", productId=" + productId + ", productName="
				+ productName + ", productPrice=" + productPrice + ", productQuantity=" + productQuantity
				+ ", totalPrice=" + totalPrice + ", order=" + order + "]";
	}

	public int getOrderinfoId() {
		return orderinfoId;
	}

	public void setOrderinfoId(int orderinfoId) {
		this.orderinfoId = orderinfoId;
	}

	public int getProductId() {
		return productId;
	}

	public void setProductId(int productId) {
		this.productId = productId;
	}

	public String getProductName() {
		return productName;
	}

	public void setProductName(String productName) {
		this.productName = productName;
	}

	public double getProductPrice() {
		return productPrice;
	}

	public void setProductPrice(double productPrice) {
		this.productPrice = productPrice;
	}

	public int getProductQuantity() {
		return productQuantity;
	}

	public void setProductQuantity(int productQuantity) {
		this.productQuantity = productQuantity;
	}

	public double getTotalPrice() {
		return totalPrice;
	}

	public void setTotalPrice(double totalPrice) {
		this.totalPrice = totalPrice;
	}

	public Order getOrder() {
		return order;
	}

	public void setOrder(Order order) {
		this.order = order;
	}

	@Id
	@GeneratedValue
	private int orderinfoId;
	private int productId;
	private String productName;
	private double productPrice;
	private int productQuantity;
	private double totalPrice;
	
	@ManyToOne(fetch = FetchType.EAGER)
	private Order order;
}