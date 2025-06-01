/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

import java.util.Date;

/**
 *
 * @author QuangAnh
 */
public class Order {

    private int orderId;
    private int accId;
    private Date orderDate;
    private String orderStatus;
    private String customerName;
    private String customerEmail;
    private String customerPhone;
    private String customerAddress;
    private int shipperId;
    private String paymentMethod;
    private String paymantStatus;
    
    // Getters và setters

    public Order() {
    }

    public Order(int orderId, int accId, Date orderDate, String orderStatus, String customerName, String customerEmail, String customerPhone, String customerAddress, int shipperId, String paymentMethod, String paymantStatus) {
        this.orderId = orderId;
        this.accId = accId;
        this.orderDate = orderDate;
        this.orderStatus = orderStatus;
        this.customerName = customerName;
        this.customerEmail = customerEmail;
        this.customerPhone = customerPhone;
        this.customerAddress = customerAddress;
        this.shipperId = shipperId;
        this.paymentMethod = paymentMethod;
        this.paymantStatus = paymantStatus;
    }

    public int getOrderId() {
        return orderId;
    }

    public void setOrderId(int orderId) {
        this.orderId = orderId;
    }

    public int getAccId() {
        return accId;
    }

    public void setAccId(int accId) {
        this.accId = accId;
    }

    public Date getOrderDate() {
        return orderDate;
    }

    public void setOrderDate(Date orderDate) {
        this.orderDate = orderDate;
    }

    public String getOrderStatus() {
        return orderStatus;
    }

    public void setOrderStatus(String orderStatus) {
        this.orderStatus = orderStatus;
    }

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public String getCustomerEmail() {
        return customerEmail;
    }

    public void setCustomerEmail(String customerEmail) {
        this.customerEmail = customerEmail;
    }

    public String getCustomerPhone() {
        return customerPhone;
    }

    public void setCustomerPhone(String customerPhone) {
        this.customerPhone = customerPhone;
    }

    public String getCustomerAddress() {
        return customerAddress;
    }

    public void setCustomerAddress(String customerAddress) {
        this.customerAddress = customerAddress;
    }

    public int getShipperId() {
        return shipperId;
    }

    public void setShipperId(int shipperId) {
        this.shipperId = shipperId;
    }

    public String getPaymentMethod() {
        return paymentMethod;
    }

    public void setPaymentMethod(String paymentMethod) {
        this.paymentMethod = paymentMethod;
    }

    public String getPaymantStatus() {
        return paymantStatus;
    }

    public void setPaymantStatus(String paymantStatus) {
        this.paymantStatus = paymantStatus;
    }

    @Override
    public String toString() {
        return "Order{" + "orderId=" + orderId + ", accId=" + accId + ", orderDate=" + orderDate + ", orderStatus=" + orderStatus + ", customerName=" + customerName + ", customerEmail=" + customerEmail + ", customerPhone=" + customerPhone + ", customerAddress=" + customerAddress + ", shipperId=" + shipperId + ", paymentMethod=" + paymentMethod + ", paymantStatus=" + paymantStatus + '}';
    }

    

    

    
    
}

