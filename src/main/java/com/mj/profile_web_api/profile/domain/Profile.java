package com.mj.profile_web_api.profile.domain;

import lombok.Builder;
import lombok.Data;

import java.util.List;

@Data
@Builder
public class Profile {

    private Name name;
    private Email email;
    private List<Resource> resources;
    private List<SpokenLanguage> spokenLanguages;

}
