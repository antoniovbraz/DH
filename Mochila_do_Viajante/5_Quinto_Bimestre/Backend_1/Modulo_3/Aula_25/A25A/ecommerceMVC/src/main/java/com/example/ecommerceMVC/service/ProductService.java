package com.example.ecommerceMVC.service;

import com.example.ecommerceMVC.DAO.IDao;
import com.example.ecommerceMVC.model.Product;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.sql.SQLException;
import java.util.List;
import java.util.Optional;

@Service
public class ProductService {
    @Autowired
    // Save block
    IDao<Product> productDaoH2;

    public Product save(Product product) throws SQLException {
        return productDaoH2.save(product);
    };

    // List all block
    public List<Product> listAll() throws SQLException {
        return  productDaoH2.listAll();
    }

    // Find by id block
    public Optional<Product> findById(int id) throws SQLException {
        return productDaoH2.findById(id);
    }

    // Update block
    public void update(Product product) throws SQLException {
        productDaoH2.update(product);
    }

    // Delete block
    public void delete(int id) throws SQLException {
        productDaoH2.delete(id);
    }
}
