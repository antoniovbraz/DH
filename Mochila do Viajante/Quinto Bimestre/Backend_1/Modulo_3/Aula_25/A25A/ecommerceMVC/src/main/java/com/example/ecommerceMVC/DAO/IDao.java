package com.example.ecommerceMVC.DAO;

import com.example.ecommerceMVC.model.Product;

import java.sql.SQLException;
import java.util.List;
import java.util.Optional;

public interface IDao<T> {
    Product save(Product product) throws SQLException;
    public List<T> listAll() throws SQLException;
    public void update(T t) throws SQLException;
    public Optional<T> findById(int id) throws SQLException;
    public void delete(int id) throws  SQLException;
}
