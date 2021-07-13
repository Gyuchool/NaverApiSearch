package com.springshop.naverapi.controller;

import com.springshop.naverapi.models.Product;
import com.springshop.naverapi.models.ProductMypriceRequestDto;
import com.springshop.naverapi.models.ProductRepository;
import com.springshop.naverapi.models.ProductRequestDto;
import com.springshop.naverapi.service.ProductService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RequiredArgsConstructor // final로 선언된 멤버 변수를 자동으로 생성합니다.
@RestController // JSON으로 데이터를 주고받음을 선언합니다.
public class ProductRestController {

    private final ProductRepository productRepository;
    private final ProductService productService;

    // 등록된 전체 상품 목록 조회
    @GetMapping("/api/products")
    public List<Product> getProducts() {
        return productRepository.findAll();
    }

    @PostMapping("/api/products")
    public Product createProduct(@RequestBody ProductRequestDto requestDto){
        Product product = new Product(requestDto);
        return productRepository.save(product);
    }

    @PutMapping("/api/product/{targetId}")
    public Long updateProduct(@PathVariable Long targetId, @RequestBody ProductMypriceRequestDto requestDto){
        return productService.update(targetId, requestDto);
    }
}