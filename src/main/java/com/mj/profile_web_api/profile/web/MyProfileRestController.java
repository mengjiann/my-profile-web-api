package com.mj.profile_web_api.profile.web;

import com.mj.profile_web_api.profile.domain.*;
import com.mj.profile_web_api.profile.domain.Resource.ResourceType;
import com.mj.profile_web_api.profile.domain.SpokenLanguage.Language;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;

@Slf4j
@RestController
public class MyProfileRestController {

    @GetMapping("/me")
    Profile myProfile(){
        return Profile.builder()
                .name(new Name("Lee Meng Jiann"))
                .email(new Email("mengjiannlee@gmail.com"))
                .resources(Arrays.asList(
                        new Resource(ResourceType.GITHUB,"https://github.com/mengjiann"),
                            new Resource(ResourceType.LINKEDIN, "https://sg.linkedin.com/in/meng-jiann-lee-b6758071")
                ))
                .spokenLanguages(Arrays.asList(
                    new SpokenLanguage(Language.MANDARIN,SpokenLanguage.Proficiency.FLUENT),
                        new SpokenLanguage(Language.ENGLISH,SpokenLanguage.Proficiency.FLUENT)
                ))
                .build();
    }


}
