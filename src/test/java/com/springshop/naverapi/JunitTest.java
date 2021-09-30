package com.springshop.naverapi;

import com.springshop.naverapi.models.Product;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.RepeatedTest;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

import java.time.Duration;

import static java.time.Duration.ofMillis;
import static java.time.Duration.ofMinutes;
import static org.junit.jupiter.api.Assertions.*;


public class JunitTest {
    @RepeatedTest(10)
    @DisplayName("반복 테스트")
    void repeatedTest() {

    }

    @RepeatedTest(value = 10, name = "{displayName} 중 {currentRepetition}")
    @DisplayName("반복 테스트2")
    void repeatedTest2(){

    }
}