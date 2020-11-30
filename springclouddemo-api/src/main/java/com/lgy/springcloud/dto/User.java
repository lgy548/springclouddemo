package com.lgy.springcloud.dto;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class User {
    private String userid;

    private String password;

    private String openid;
}
