package com.rebel.firstappdemo.controller;

import com.rebel.firstappdemo.domain.Product;
import com.rebel.firstappdemo.exception.ProductNotfoundException;
import com.rebel.firstappdemo.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.Map;

@RestController
public class ProductServiceController {
    /*
    private static Map<String, Product> productRepo = new HashMap<>();
    static {
        Product honey = new Product();
        honey.setId("1");
        honey.setName("Hello");
        productRepo.put(honey.getId(),honey);

        Product awesome = new Product();
        awesome.setId("2");
        awesome.setName("Awesome");
        productRepo.put(awesome.getId(),awesome);
    }

    @RequestMapping(value = "/products/{id}",method = RequestMethod.DELETE)
    public ResponseEntity<Object> delete(@PathVariable("id") String id) {
        productRepo.remove(id);
        return  new ResponseEntity<>("Products is delete successfully", HttpStatus.OK);
    }
    @RequestMapping(value = "/products/{id}",method = RequestMethod.PUT)
    public ResponseEntity<Object> updateProduct(@PathVariable("id") String id, @RequestBody Product product){
        if(!productRepo.containsKey(id)) throw new ProductNotfoundException();
        productRepo.remove(id);
        product.setId(id);
        productRepo.put(id,product);
        return new ResponseEntity<>("Product is updated successfully",HttpStatus.OK);
    }

    @RequestMapping(value = "/products",method = RequestMethod.POST)
    public ResponseEntity<Object> createProduct(@RequestBody Product product) {
        productRepo.put(product.getId(),product);
        return  new ResponseEntity<>("Products is creates successfully",HttpStatus.CREATED);
    }

    @RequestMapping(value = "/products")
    public  ResponseEntity<Object> getProduct() {
        return  new ResponseEntity<>(productRepo.values(),HttpStatus.OK);
    }
*/
    @Autowired
    ProductService productService;

    @RequestMapping(value = "/products")
            public ResponseEntity<Object> getProduct(){
        return new ResponseEntity<>(productService.getProducts(),HttpStatus.OK);
    }

    @RequestMapping(value = "/products/{id}",method = RequestMethod.PUT)
    public ResponseEntity<Object>
    updateProduyct(@PathVariable("id") String id,@RequestBody Product product){
        productService.updateProduct(id,product);
        return new ResponseEntity<>("Product is pudate successlly",HttpStatus.OK);
    }

    @RequestMapping(value = "products/{id}",method = RequestMethod.DELETE)
    public ResponseEntity<Object> delete(@PathVariable("id") String id){
        productService.deleteProduct(id);
        return new ResponseEntity<>("Products is deleted sucessfully!",HttpStatus.OK);
    }

    @RequestMapping(value = "/products" , method = RequestMethod.POST)
    public ResponseEntity<Object> createProduct(@RequestBody Product product){
        productService.createProduct(product);
        return new ResponseEntity<>("Products is created sucessfully!",HttpStatus.CREATED);
    }

    @RequestMapping(value = "/")
    public String hello() {
        return "Hello World";
    }

}
