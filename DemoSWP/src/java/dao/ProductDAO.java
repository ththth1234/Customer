/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dao;


import model.Product;
import util.DBContext;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;


public class ProductDAO extends DBContext{
    
    
    public List<Product> getAllProducts(){
        String sql = "SELECT * FROM Products";
        List<Product> list = new ArrayList<>();
        try{
            PreparedStatement stm = c.prepareStatement(sql);
            ResultSet rs = stm.executeQuery();
            while (rs.next()){
               Product p = new Product(rs.getInt("Id"), rs.getString("name"), rs.getDouble("price"), rs.getString("image"), rs.getString("description"), rs.getInt("quantity"), rs.getString("category"));
               list.add(p);
            }
        }catch(Exception e){
            e.printStackTrace();
        }
        return list;
    }
    
    public boolean removeProduct(int id){
        String sql = "SELECT * FROM Products WHERE id = ?";
        try (PreparedStatement stm = c.prepareStatement(sql)){
            stm.setInt(1, id);
            int rowAffected = stm.executeUpdate();
            return rowAffected > 0;
        } catch (SQLException e){
            e.printStackTrace();
        }
        return false;
    }
    
    public Product getProductById(int id) throws SQLException{
        String sql = "SELECT * FROM Products WHERE id = ?";
        try (PreparedStatement stm = c.prepareStatement(sql)){
            stm.setInt(1, id);
            try (ResultSet re = stm.executeQuery()){
                if(re.next()){
                    String name = re.getString("name");
                    double price = re.getDouble("price");
                    String image = re.getString("image");
                    String description = re.getString("description");
                    int quantity = re.getInt("quantity");
                    String category = re.getString("category");
                    return new Product(id, name, price, image, description, quantity, category);
                    
                }
            } catch (SQLException e){
                e.printStackTrace();
            }
            return null;
        }
    }
    
    public void insertProduct(int id, String name, double price, String image, String description, int quantity, String category){
        String sql = "INSERT INTO Products(id, name, price, image, description, quantity, category) VALUE(?, ?, ?, ?, ?, ? ?)";
        try (PreparedStatement stm = c.prepareStatement(sql)){
            stm.setInt(1, id);
            stm.setString(2, name);
            stm.setDouble(3, price);
            stm.setString(4, image);
            stm.setString(5, description);
            stm.setInt(6, quantity);
            stm.setString(7, category);
            stm.executeUpdate();
        } catch (SQLException e){
            e.printStackTrace();
        }
    }
    
    public static void main(String[] args){
        ProductDAO  p = new ProductDAO();
        var list = p.getAllProducts();
        for (Product product : list){
            System.out.println(product.toString());
        }
    }
}       
    
   



