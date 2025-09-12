package com.akula.ecommerce.controller;


import com.akula.ecommerce.model.Product;
import com.akula.ecommerce.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api")
public class ProductController {

        @Autowired
        private ProductService service;

        @GetMapping("/products")
        public ResponseEntity<List<Product>> getAllProducts(){
            return new ResponseEntity<>(service.getAllProducts(), HttpStatus.OK);
        }
        @GetMapping("/product/{id}")
        public ResponseEntity<Product> getProduct(@PathVariable int id){

            Product product = service.getProductById(id);

            if(product != null)
                return new ResponseEntity<>(service.getProductById(id), HttpStatus.OK);
            else
                return new ResponseEntity<>(HttpStatus.NOT_FOUND);


    }
}
