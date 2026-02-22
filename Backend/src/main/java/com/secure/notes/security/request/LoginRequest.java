package com.secure.notes.security.request;

import lombok.Getter;
import lombok.Setter;

// DTO's (response)

@Setter
@Getter
public class LoginRequest {
    private String username;

    private String password;

}