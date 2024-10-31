package com.teamProject.tripPlan.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.util.ArrayList;
import java.util.List;

@Entity
@Getter
@Setter
@ToString
public class Users {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long userNo;
    @Column(nullable = false, length = 30)
    private String userId;
    @Column(nullable = false, length = 255)
    private String userPassword;
    @Column(nullable = false, length = 30)
    private String userName;
    private String userNickname;
    @Column(nullable = false, length = 30)
    private String userEmail;
    @Enumerated(EnumType.STRING)
    private UserRole role;

    @OneToMany(fetch = FetchType.LAZY,
            mappedBy = "users",
            cascade = CascadeType.PERSIST)
    private List<Post> posts = new ArrayList<>();

    @OneToMany(fetch = FetchType.LAZY,
            mappedBy = "users",
            cascade = CascadeType.PERSIST)
    private List<Suggestion> suggestions = new ArrayList<>();

    @OneToMany(mappedBy = "users",
            cascade = {CascadeType.PERSIST, CascadeType.REMOVE},
            fetch = FetchType.LAZY)
    private List<UsersMbtiAnswer> usersMbtiAnswer = new ArrayList<>();

    @Enumerated(EnumType.STRING)
    private ResultType resultType;

}
