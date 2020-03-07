package com.jaydot2.security.secureapp.controller;


import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.springframework.http.MediaType;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

class SecureControllerTest {

    private SecureController controller;
    private MockMvc mockMvc;

    @BeforeEach
    void setUp() {
        controller = new SecureController();
        mockMvc = MockMvcBuilders.standaloneSetup(controller).build();
    }

    @Test
    @DisplayName("Given the root endpoint, when a GET request is made, then should return status Ok")
    void shouldReturnStatusOkFromDefaultEndpoint() throws Exception {
        // Given
        String endpoint = "/";

        // When
        mockMvc.perform(get(endpoint).contentType(MediaType.APPLICATION_JSON)).andExpect(status().isOk());
    }
}