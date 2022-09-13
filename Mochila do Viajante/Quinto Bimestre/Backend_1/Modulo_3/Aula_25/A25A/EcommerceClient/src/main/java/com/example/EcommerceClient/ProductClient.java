package com.example.EcommerceClient;


import com.mashape.unirest.http.HttpResponse;
import com.mashape.unirest.http.Unirest;

public class ProductClient {
    public Product save(Product product) {
        HttpResponse<String> response = null;
        Product product1 = null;

        try {
            response = Unirest.post("http//localhost:8080/product/save")
                    .header("Content-Type", "application/json")
                    .body(JSonUtil.asJsonString(product)).asString();
            product1 = JSonUtil.objectFromString(Product.class, response.getBody());
        } catch (Exception e) {
            e.printStackTrace();
        }
        return product1;
    }

    public Product findById(Integer id) {
        HttpResponse<String> response = null;
        Product product1 = null;

        try {
            response = Unirest.get("http//localhost:8080/product/listAll")
                    .asString();
            product1 = JSonUtil.objectFromString(Product.class, response.getBody());
        } catch (Exception e) {
            e.printStackTrace();
        }
        return product1;
    }

    public Product update(Product product){
        HttpResponse<String> response = null;
        Product product1 = null;

        try {
            response = Unirest.put("http//localhost:8080/product/update")
                    .header("Content-Type", "application/json")
                    .body(JSonUtil.asJsonString(product)).asString();
            product1 = JSonUtil.objectFromString(Product.class, response.getBody());
        } catch (Exception e) {
            e.printStackTrace();
        }
        return product1;
    }


    public String delete(Integer id){
        HttpResponse<String> response = null;
        Product product1 = null;

        try {
            response = Unirest.get("http//localhost:8080/product/" + id)
                    .asString();

        } catch (Exception e) {
            e.printStackTrace();
        }
        return response != null ? String.valueOf(response.getStatus()) : null;
    }
}
