package com.springshop.naverapi.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public class ProductRequestDto {
    private String title;
    private String image;
    private String link;
    private int lprice; //최저가
}