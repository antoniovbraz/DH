package com.example.EcommerceClient;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/client")
public class ProductClientController {
    private ProductClient productClient = new ProductClient();

    @PostMapping("/save")

    public Product save(@RequestBody Product product)
    {

        return productClient.save(product);
    }

    @GetMapping("/listAll")

    public Product findAll(@RequestBody Integer id)
    {

        return productClient.findById(id);
    }

    @GetMapping("/update")

    public Product update(@RequestBody  Product product)
    {

        return productClient.update(product);
    }

    @GetMapping("/delete")

    public String delete(@PathVariable Integer id)
    {
        return productClient.delete(id);
    }
}
