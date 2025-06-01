/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dao;


import util.DBContext;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import model.Order;
import java.sql.Timestamp;

/**
 *
 * @author QuangAnh
 */
public class OrderDAO extends DBContext{
    public List<Order> getAllOrdersByUserId(int userId){
        List<Order> list = new ArrayList<>();
        String sql = "SELECT * FROM ordersWHERE user_id = ?";
        try(PreparedStatement stm = c.prepareStatement(sql)){
            stm.setInt(1, userId);
            ResultSet rs = stm.executeQuery();
            while (rs.next()){
                Order order = new Order();
                order.setId(rs.getInt("id"));
                order.setUserId(rs.getInt("user_id"));
                order.setOrderDate(rs.getTimestamp("order_date"));
                order.setTotal(rs.getDouble("total"));
            list.add(order);
            }
        } catch(SQLException e){
            e.printStackTrace();
        }
        return list;
    }
    
    
    public void insertOrder(int id, int userId, Date orderDate, double total, String status){
        String sql = "INSERT INTO Orders(userId, order_date, total, status) VALUES (?, ?, ?, ?)";
        try (PreparedStatement stm = c.prepareStatement(sql)){
            stm.setInt(1, id);
            stm.setInt(2, userId);
            stm.setTimestamp(3, new Timestamp(orderDate.getTime()));
            stm.setDouble(4, total);
            stm.setString(5, status);
            stm.executeUpdate();
            
        }catch (SQLException e){
            e.printStackTrace();
        }
        
    }
    // Lấy danh sách đơn hàng theo user_id
    public List<Order> getOderByUserId(int userId){
        List<Order> list = new ArrayList<>();
        String sql = "SELECT * FROM Orders WHERE userId = ? ORDER BY order_date DESC";
        
        try(PreparedStatement stm = c.prepareStatement(sql)){
            stm.setInt(1, userId);
            ResultSet rs = stm.executeQuery();
            while (rs.next()){
                Order order = new Order();
                order.setId(rs.getInt("id"));
                order.setUserId(rs.getInt("userId"));
                order.setOrderDate(rs.getTimestamp("order_date"));
                order.setTotal(rs.getDouble("total"));
                order.setStatus(rs.getString("status"));
                list.add(order);
            }
        }catch (SQLException e){
            e.printStackTrace();
        }return list;
    }
    
     // Lấy toàn bộ đơn hàng
    public List<Order> getAllOrders() {
        List<Order> list = new ArrayList<>();
        String sql = "SELECT * FROM Orders ORDER BY order_date DESC";

        try (PreparedStatement stm = c.prepareStatement(sql)) {

            ResultSet rs = stm.executeQuery();
            while (rs.next()) {
                Order order = new Order();
                order.setId(rs.getInt("id"));
                order.setUserId(rs.getInt("user_id"));
                order.setOrderDate(rs.getTimestamp("order_date"));
                order.setTotal(rs.getDouble("total_amount"));
                list.add(order);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return list;
    }
} 
