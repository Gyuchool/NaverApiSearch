package com.springshop.naverapi.controller;

import com.springshop.naverapi.dto.ProductMypriceRequestDto;
import com.springshop.naverapi.dto.ProductRequestDto;
import com.springshop.naverapi.models.Product;
import com.springshop.naverapi.repository.ProductRepository;
import com.springshop.naverapi.security.UserDetailsImpl;
import com.springshop.naverapi.service.ProductService;
import lombok.RequiredArgsConstructor;
import org.springframework.security.core.annotation.AuthenticationPrincipal;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RequiredArgsConstructor
@RestController
public class ProductController {

    private final ProductRepository productRepository;
    private final ProductService productService;

    // 로그인한 회원이 등록한 상품들 조회
    @GetMapping("/api/products")
    public List<Product> getProducts(@AuthenticationPrincipal UserDetailsImpl userDetails) {
        Long userId = userDetails.getUser().getId();
        return productService.getProducts(userId);
    }

    // 신규 상품 등록
    @PostMapping("/api/products")
    public Product createProduct(@RequestBody ProductRequestDto requestDto, @AuthenticationPrincipal UserDetailsImpl userDetails) {
        // 로그인 되어 있는 ID
        Long userId = userDetails.getUser().getId();

        Product product = productService.createProduct(requestDto, userId);
        // 응답 보내기
        return product;
    }

    // 설정 가격 변경
    @PutMapping("/api/product/{targetId}")
    public Long updateProduct(@PathVariable Long targetId, @RequestBody ProductMypriceRequestDto requestDto){
        return productService.update(targetId, requestDto);
    }

    // (관리자용) 등록된 모든 상품 목록 조회
    @GetMapping("/api/admin/products")
    public List<Product> getAllProducts() {
        return productService.getAllProducts();
    }
}
