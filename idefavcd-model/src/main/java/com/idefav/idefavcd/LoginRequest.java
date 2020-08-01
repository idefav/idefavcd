package com.idefav.idefavcd;

import lombok.Data;
import lombok.experimental.Accessors;

@Data
@Accessors(chain = true)
public class LoginRequest {

    private String userName;
    private String password;
}
