package com.mj.profile_web_api.profile.domain;

import lombok.Getter;

@Getter
public class Resource {

    private ResourceType type;
    private String url;

    public Resource(ResourceType type, String url) {
        this.type = type;
        this.url = url;
    }

    public enum ResourceType{
        GITHUB,
        LINKEDIN

    }

}
