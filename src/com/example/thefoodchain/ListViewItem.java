package com.example.thefoodchain;

public class ListViewItem {

	private String orderID;
	private String customerPostCode;
	
	public String getOrderID() {
		return orderID;
	}

	public String getCustomerPostCode() {
		return customerPostCode;
	}

	public void setOrderID(String orderID) {
		this.orderID = orderID;
	}

	public void setCustomerPostCode(String customerPostCode) {
		this.customerPostCode = customerPostCode;
	}

	public ListViewItem(String orderID, String customerPostCode) {
		this.orderID = orderID;
		this.customerPostCode = customerPostCode;
	}
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return customerPostCode;
	}

}