package com.teamProject.tripPlan.dto;

import com.teamProject.tripPlan.entity.Post;
import com.teamProject.tripPlan.entity.Users;
import jakarta.persistence.Column;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.ArrayList;
import java.util.List;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class UsersDTO {
    private Long userNo;
    private String userId;
    private String userPassword;
    private String userName;
    private String userNickname;
    private String userEmail;
    private List<Post> posts = new ArrayList<>();

    public static UsersDTO fromEntity(Users users) {
        return new UsersDTO(
                users.getUserNo(),
                users.getUserId(),
                users.getUserPassword(),
                users.getUserName(),
                users.getUserNickname(),
                users.getUserEmail(),
                users.getPosts()
        );
    }

    public static Users fromDTO(UsersDTO dto) {
        Users users = new Users();
        users.setUserNo(dto.getUserNo());
        users.setUserId(dto.getUserId());
        users.setUserPassword(dto.getUserPassword());
        users.setUserName(dto.getUserName());
        users.setUserNickname(dto.getUserNickname());
        users.setUserEmail(dto.getUserEmail());
        return users;
    }

}
