package com.teamProject.tripPlan.repository;

import com.teamProject.tripPlan.entity.Users;
import org.springframework.data.jpa.repository.JpaRepository;

public interface JoinRepository extends JpaRepository<Users, String> {
    // 기존 아이디와 비교
    Boolean existsByUserId(String userId);

    // userId로 사용자 찾기
    Users findByUserId(String userId);
}
