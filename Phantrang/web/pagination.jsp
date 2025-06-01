<%-- 
    Document   : pagination
    Created on : Mar 17, 2025, 9:23:24 PM
    Author     : QuangAnh
--%>

<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ page import="java.util.List" %>
<html>
<head>
    <title>Phân Trang</title>
</head>
<body>
    <h2>Danh sách sản phẩm</h2>
    <ul>
        <% 
            List<String> dataList = (List<String>) request.getAttribute("dataList");
            if (dataList != null) {
                for (String item : dataList) { 
        %>
            <li><%= item %></li>
        <% 
                }
            }
        %>
    </ul>

    <div>
        <% 
            int currentPage = (Integer) request.getAttribute("currentPage");
            int totalPages = (Integer) request.getAttribute("totalPages");

            if (currentPage > 1) { 
        %>
            <a href="pagination?page=<%= currentPage - 1 %>">Previous</a>
        <% } %>

        <span>Page <%= currentPage %> of <%= totalPages %></span>

        <% if (currentPage < totalPages) { %>
            <a href="pagination?page=<%= currentPage + 1 %>">Next</a>
        <% } %>
    </div>
</body>
</html>

