package com.example.ecommerceMVC.controller;

import com.example.ecommerceMVC.model.Product;
import com.example.ecommerceMVC.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.PushBuilder;
import java.sql.SQLException;
import java.util.List;

@RestController
@RequestMapping("/product")
public class ProductController {
    @Autowired
    ProductService service;

    @PostMapping("/save")
    public Product saveProduct(@RequestBody Product product) throws SQLException {
        return service.save(product);
    }

    @GetMapping
    public List<Product> listAll() throws SQLException{
        return service.listAll();
    }

    @RequestMapping(value = "/findbyid")
    public Product findById(@RequestParam("id") int id) throws SQLException{
        return service.findById(id).isEmpty() ? new Product() : service.findById(id).get();
    }
    /*
    @PatchMapping
    public void update(@RequestBody Product product) throws SQLException{
        System.out.println();
        service.update(product);
    }*/

    @PutMapping
    public ResponseEntity<Product> update(@RequestBody Product product) throws SQLException
    {
        ResponseEntity responseEntity = null;
        if (service.findById(product.getId()) == null)
        {
            responseEntity = new ResponseEntity(HttpStatus.NOT_FOUND);
        }
        return responseEntity;
    };

    @DeleteMapping
    /*public void delete(@RequestParam("id") int id) throws SQLException{
        service.delete(id);
    }*/
    public ResponseEntity delete(@PathVariable Integer id) throws SQLException
    {
        ResponseEntity responseEntity = null;
        if (service.findById(id) == null)
        {
            responseEntity = new ResponseEntity<>(HttpStatus.NOT_FOUND);
        } else
        {
            responseEntity = new ResponseEntity<>(HttpStatus.NO_CONTENT);
        }
        return responseEntity;
    }
}
