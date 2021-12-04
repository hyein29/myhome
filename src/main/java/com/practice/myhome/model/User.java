package com.practice.myhome.model;

import lombok.Data;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
@Data
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String username;
    private String password;
    private Boolean enabled;

    @ManyToMany
    @JoinTable(
            name = "user_role", // 조인 테이블 명
            joinColumns = @JoinColumn(name = "user_id"), // 현재 엔티티(user)를 참조하는 외래키 (user_role 테이블의 user_id)
            inverseJoinColumns = @JoinColumn(name = "role_id")) // 반대 엔티티(role)를 참조하는 외래키 (user_role 테이블의 role_id)
    private List<Role> roles = new ArrayList<>();
}
