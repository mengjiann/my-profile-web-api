package com.mj.profile_web_api.profile.domain;

import lombok.Getter;

@Getter
public class SpokenLanguage {

    private Language language;
    private Proficiency proficiency;

    public SpokenLanguage(Language language, Proficiency proficiency) {
        this.language = language;
        this.proficiency = proficiency;
    }

    public enum Language {
        ENGLISH,
        MANDARIN
    }

    public enum Proficiency {
        BASIC,
        INTERMEDIATE,
        FLUENT
    }


}
