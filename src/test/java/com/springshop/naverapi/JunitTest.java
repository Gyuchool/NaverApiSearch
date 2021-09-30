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


    @Test
    @DisplayName("타임아웃 준수")
    void timeOutNotExceed(){
        assertTimeout(ofMinutes(2), ()->Thread.sleep(10));
    }
    @Test
    @DisplayName("타임아웃 초과")
    public void timeOut(){
        assertTimeout(ofMillis(10), () -> Thread.sleep(100));
    }

}
