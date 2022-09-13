package com.example.ecommerceMVC.DAO.impl;

import com.example.ecommerceMVC.DAO.ConfigJDBC;
import com.example.ecommerceMVC.DAO.IDao;
import com.example.ecommerceMVC.model.Product;
import org.apache.logging.log4j.Logger;
import org.springframework.context.annotation.Configuration;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import static org.apache.logging.log4j.LogManager.getLogger;

@Configuration
public class ProductDAOH2 implements IDao<Product> {
    private ConfigJDBC configJDBC;

    final static Logger log = getLogger(ProductDAOH2.class);


    // Start save product block
    @Override
    public Product save(Product product) throws SQLException {
        log.info("Opening DB connection");
        String SQLInsert = String.format("INSERT INTO product (productName, price)" +
                "VALUES ('%s', '%s')", product.getProductName(),product.getPrice());
        Connection connection = null;
        try {
            log.info("Saving product; " + product.getProductName());
            configJDBC = new ConfigJDBC("org.h2.Driver", "jdbc:h2:~/ecommerce;" +
                    "INIT=RUNSCRIPT FROM 'create.sql'", "sa","");
            connection = configJDBC.getConnection();
            Statement statement = connection.createStatement();
            statement.execute(SQLInsert,Statement.RETURN_GENERATED_KEYS);
            ResultSet resultSet = statement.getGeneratedKeys();

            if(resultSet.next()){
                product.setId(resultSet.getInt(1));
            }
        } catch (Exception e){
            e.printStackTrace();
            log.error("Failed to insert product into the database");
        } finally {
            log.info("Closing connection");
            connection.close();
        }
        return product;
    }
    // End save product block

    // Start List All product block
    @Override
    public List<Product> listAll() throws SQLException{
        log.debug("Opening connection to the database");
        Connection connection = null;
        Statement statement = null;
        String query = "SELECT * FROM product";
        List<Product> products = new ArrayList<>();
        try {
            log.info("Connecting to the database to List products");
            configJDBC = new ConfigJDBC("org.h2.Driver", "jdbc:h2:~/ecommerce;" +
                    "INIT=RUNSCRIPT FROM 'create.sql'", "sa","");
            connection = configJDBC.getConnection();
            statement = connection.createStatement();
            ResultSet result = statement.executeQuery(query);
            log.debug("Listing products; ");

            while (result.next()){
                products.add(createObjectProduct(result));
            }
        } catch (SQLException throwable){
            throwable.printStackTrace();
        }finally {
            log.debug("Closing database connection");
            statement.close();
        }
        return products;
    }
    // End List All product block

    // Start Update product by id block
    @Override
    public void update(Product product) throws SQLException{
        String SQLUpdate = String.format("UPDATE product SET id = '%s' WHERE id = '%s';",
                product.getPrice(), product.getId());
        Connection connection = null;
        try {
            log.info("Updating product price:" + product.getId());
            configJDBC = new ConfigJDBC("org.h2.Driver","jdbc:h2:~/ecommerce;" +
                    "INIT=RUNSCRIPT FROM 'create.sql'","sa","");
            connection = configJDBC.getConnection();
            Statement statement = connection.createStatement();
            statement.execute(SQLUpdate);
        } catch(Exception e){
            e.printStackTrace();
            log.error("Failed to update the product: " + e.getMessage());

        } finally {
            log.info("Closing connection");
            connection.close();
        }
    }
    // End Update product by id block


    // Start find product by id block
    @Override
    public Optional<Product> findById(int id)throws SQLException{
        log.debug("Opening connection to the database");
        Connection connection = null;
        Statement statement = null;
        String query = String.format("SELECT * FROM product where id= %s",id );
        Product product = null;
        try{
            configJDBC = new ConfigJDBC("org.h2.Driver","jdbc:h2:~/ecommerce;" +
                    "INIT=RUNSCRIPT FROM 'create.sql'","sa","");
            connection = configJDBC.getConnection();
            log.debug("Find product by id: " + id);
            statement = connection.createStatement();
            ResultSet result = statement.executeQuery(query);

            while(result.next()){
                product = createObjectProduct(result);
            }
        }catch (SQLException throwable){
            throwable.printStackTrace();
        }finally {
            log.debug("Closing DB connection");
            statement.close();
        }
        return product != null ? Optional.of(product) : Optional.empty();
    }
    // End find product by id block

    // Start Delete product by id block
    @Override
    public void delete(int id) throws SQLException{
        log.info("Opening DB Connection");
        Connection connection = null;
        Statement statement = null;
        String SQLDelete = String.format("DELETE FROM product where id = %s",id);
        try{

            configJDBC = new ConfigJDBC("org.h2.Driver","jdbc:h2:~/ecommerce;INIT=RUNSCRIPT FROM 'create.sql'","sa","");
            connection = configJDBC.getConnection();
            log.debug("Deleting product by id:: " + id);
            statement = connection.createStatement();
            statement.execute(SQLDelete);
        }catch(SQLException throwable){
            throwable.printStackTrace();
        }finally {
            log.debug("Closing DB connection");
            connection.close();
        }
    }
    // End Delete product by id block

    // Start create product block
    private Product createObjectProduct(ResultSet resultSet) throws SQLException{
        Integer id = resultSet.getInt("id");
        String productName = resultSet.getString("productName");
        double price = resultSet.getDouble("price");
        return new Product(id,productName,price);
    }
    // End create product block
}
