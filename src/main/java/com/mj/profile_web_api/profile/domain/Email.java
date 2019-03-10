package com.mj.profile_web_api.profile.domain;

import lombok.Getter;

@Getter
public class Email {
    private String email;

    public Email(String email) {
        this.email = email;
    }
}
