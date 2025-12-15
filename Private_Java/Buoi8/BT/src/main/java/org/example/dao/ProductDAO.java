package org.example.dao;

import org.example.dto.ProductDTO;
import org.example.model.Product;
import org.example.utils.JdbcUtils;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

public class ProductDAO {
    public void insert(Product product){
        String sql = "insert into product(name, price, categoryId) values (?, ?, ?)";

        Connection conn = null;
        PreparedStatement stmt = null;

        try{
            conn = JdbcUtils.getConnection();
            stmt = conn.prepareStatement(sql);

            stmt.setString(1, product.getName());
            stmt.setDouble(2, product.getPrice());
            stmt.setInt(3, product.getCategoryId());

            stmt.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            try {
                if (stmt != null) stmt.close();
                JdbcUtils.close(conn);
            } catch (SQLException e){
                e.printStackTrace();
            }
        }
    }

    public List<ProductDTO> findAllWithCategoryName(){
        List<ProductDTO> listDTO = new ArrayList<>();

        String sql = "select p.id , p.name , p.price , p.categoryId from product p " +
                "join category c on p.categoryId = c.id";

        Connection conn = null;
        PreparedStatement stmt = null;
        ResultSet rs = null;

        try {
            conn = JdbcUtils.getConnection();
            stmt = conn.prepareStatement(sql);
            rs = stmt.executeQuery();

            while (rs.next()){
                ProductDTO dto = new ProductDTO();

                dto.setId(rs.getInt("id"));
                dto.setName(rs.getString("name"));
                dto.setPrice(rs.getDouble("price"));
                dto.setCategoryId(rs.getInt("categoryId"));
                dto.setCategoryName(rs.getString("category_name"));

                listDTO.add(dto);
            }
        } catch (SQLException e){
            e.printStackTrace();
        } finally {
            try {
                if (rs != null) rs.close();
                if (stmt != null) stmt.close();
                JdbcUtils.close(conn);
            } catch (SQLException e){
                e.printStackTrace();
            }
        }

        return listDTO;
    }
}
