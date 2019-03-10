package com.mj.profile_web_api.profile.domain;

import lombok.Getter;

@Getter
public class Name {

    private String fullname;

    public Name(String fullname) {
        this.fullname = fullname;
    }
}
