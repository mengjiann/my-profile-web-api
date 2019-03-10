package com.mj.profile_web_api.profile.web;

import com.mj.profile_web_api.config.constant.RestDocConstants;
import org.junit.Before;
import org.junit.Rule;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;
import org.springframework.restdocs.JUnitRestDocumentation;
import org.springframework.restdocs.mockmvc.RestDocumentationRequestBuilders;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;

import static org.assertj.core.api.Assertions.assertThat;
import static org.mockito.BDDMockito.given;
import static org.mockito.Matchers.any;
import static org.mockito.Mockito.mock;
import static org.springframework.restdocs.mockmvc.MockMvcRestDocumentation.document;
import static org.springframework.restdocs.mockmvc.MockMvcRestDocumentation.documentationConfiguration;
import static org.springframework.restdocs.operation.preprocess.Preprocessors.prettyPrint;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.content;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

@RunWith(SpringJUnit4ClassRunner.class)
public class MyProfileRestControllerTest {

    private MockMvc mockMvc;

    private MyProfileRestController myProfileRestController;

    @Rule
    public JUnitRestDocumentation restDocumentation = new JUnitRestDocumentation();

    @Before
    public void setUp() throws Exception {

        myProfileRestController = new MyProfileRestController();

        mockMvc = MockMvcBuilders.standaloneSetup(myProfileRestController)
                .apply(documentationConfiguration(this.restDocumentation)
                        .operationPreprocessors().withResponseDefaults(prettyPrint())
                        .and()
                        .uris().withScheme(RestDocConstants.REST_DOCS_SCHEME).withHost(RestDocConstants.REST_DOCS_HOST).withPort(RestDocConstants.REST_DOCS_PORT))
                .build();

    }

    @Test
    public void myProfile() throws Exception {

        this.mockMvc.perform(RestDocumentationRequestBuilders.get("/me"))
                .andExpect(status().isOk())
                .andExpect(content().contentType("application/json;charset=UTF-8"))
                .andDo(document("me"));

    }
}