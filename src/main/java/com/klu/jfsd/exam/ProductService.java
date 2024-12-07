package com.klu.jfsd.exam;


import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class ProductService {
    private final RestTemplate restTemplate;

    public ProductService(RestTemplate restTemplate) {
        this.restTemplate = restTemplate;
    }

    public Product[] getAllProducts() {
        String url = "https://fakestoreapi.com/products";
        return restTemplate.getForObject(url, Product[].class);
    }
}