package com.cognizant.productavailability.fems.controller;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.junit.jupiter.MockitoExtension;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
import org.springframework.test.web.servlet.result.MockMvcResultMatchers;

@ExtendWith(MockitoExtension.class)
class LocationControllerTestIt {
    @Autowired
    MockMvc mockMvc;

    @MockBean
    LocationController locationController;


    @BeforeEach
    void setUp() {
    }

    @AfterEach
    void tearDown() {
    }

    @Test
    void getLocationById() throws Exception {
        mockMvc.perform(
                MockMvcRequestBuilders.get("/location/1"))
                .andExpect(
                        MockMvcResultMatchers.status().isOk()
                ).andReturn();
    }

    @Test
    void getLocations() {
    }
}
