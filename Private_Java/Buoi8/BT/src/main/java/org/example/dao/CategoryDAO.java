package org.example.dao;

import org.example.model.Category;
import org.example.utils.JdbcUtils;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class CategoryDAO {
    public List<Category> findAll(){
        List<Category> listC = new ArrayList<>();

        String sql = "Select * from category";

        Connection conn = null;
        PreparedStatement stmt = null;
        ResultSet rs = null;

        try {
            conn = JdbcUtils.getConnection();
            stmt = conn.prepareStatement(sql);
            rs = stmt.executeQuery();

            while(rs.next()){
                Category category = new Category(rs.getString("name"));
                category.setId(rs.getInt("id"));

                listC.add(category);
            }

        } catch (SQLException e){
            e.printStackTrace();
        } finally {
            try {
                if (rs != null) rs.close();
                if (stmt != null) stmt.close();
                JdbcUtils.close(conn);
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }

        return listC;
    }

    void insert(Category category){
        String sql = "insert into category (id, name) values (?, ?)";

        Connection conn = null;
        PreparedStatement stmt = null;

        try {
            conn = JdbcUtils.getConnection();
            stmt = conn.prepareStatement(sql);

            stmt.setInt(1, category.getId());
            stmt.setString(2, category.getName());

            stmt.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            try {
                if (stmt != null) stmt.close();
                JdbcUtils.close(conn);
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
    }

    void update(Category category){
        String sql = "update category c " +
                "set c.name = ? " +
                "where c.id = ?";

        Connection conn = null;
        PreparedStatement stmt = null;

        try {
            conn = JdbcUtils.getConnection();
            stmt = conn.prepareStatement(sql);

            stmt.setString(1, category.getName());
            stmt.setInt(2, category.getId());

            stmt.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            try {
                if (stmt != null) stmt.close();
                JdbcUtils.close(conn);
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
    }

    void delete (int id){
        String sql = "delete from category c " +
                "where c.id = ?";

        Connection conn = null;
        PreparedStatement stmt = null;

        try {
            conn = JdbcUtils.getConnection();
            stmt = conn.prepareStatement(sql);

            stmt.setInt(1, id);

            stmt.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            try {
                if (stmt != null) stmt.close();
                JdbcUtils.close(conn);
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
    }
}
