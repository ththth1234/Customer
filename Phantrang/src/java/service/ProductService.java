/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package service;

/**
 *
 * @author QuangAnh
 */

import dao.ProductDAO;
import model.Product;
import java.util.List;

public class ProductService {
    private ProductDAO productDAO = new ProductDAO();

    public int getTotalPages(int recordsPerPage) {
        int totalRecords = productDAO.getTotalRecords();
        return (int) Math.ceil((double) totalRecords / recordsPerPage);
    }

    public List<Product> getProducts(int page, int recordsPerPage) {
        int start = (page - 1) * recordsPerPage;
        return productDAO.getProducts(start, recordsPerPage);
    }
}

