package com.springshop.naverapi.repository;

import com.springshop.naverapi.models.User;
import com.springshop.naverapi.models.UserTime;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserTimeRepository extends JpaRepository<UserTime, Long> {
    UserTime findByUser(User user);
}