<%-- 
    Document   : home
    Created on : May 29, 2025, 1:00:32 PM
    Author     : QuangAnh
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@ page import="java.util.*, model.Product, dao.ProductDAO" %>
<%
    List<Product> products = new ProductDAO().getAll();
%>
<h2>Danh sách sản phẩm</h2>
<% for(Product p : product) { %>
    <div>
        <img src="images/<%=p.getImage()%>" width="100"/>
        <h3><%=p.getName()%></h3>
        <p><%=p.getPrice()%> VNĐ</p>
        <form action="add-to-cart" method="post">
            <input type="hidden" name="id" value="<%=p.getId()%>" />
            <button>Mua</button>
        </form>
    </div>
<% } %>

