package com.cognizant.productavailability.locationcrud.controller;

import com.cognizant.productavailability.locationcrud.model.Address;
import com.cognizant.productavailability.locationcrud.model.Location;
import com.cognizant.productavailability.locationcrud.model.LocationDTO;
import com.cognizant.productavailability.locationcrud.service.impl.LocationServiceImpl;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;
import org.reactivestreams.Publisher;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

@ExtendWith(MockitoExtension.class)
class LocationControllerTest {

    Address address;
    LocationDTO locationDTO;
    List<LocationDTO> locationDTOS;
    @Mock
    private LocationServiceImpl locationService;

    @InjectMocks
    private LocationController locationController;

    @BeforeEach
    void setUp() {
        locationDTOS = new ArrayList<>();
        address = new Address(1L, "1000 N", "Fairfield", "IA", "USA", "54220");
        locationDTO = new LocationDTO(1L,"Fairfield Dept",address);
        locationDTOS.add(locationDTO);
    }

    @Test
    void getLocationById() {
        when(locationService.getLocationById(1L)).thenReturn(locationDTO);
        assertNotNull(locationController.getLocationById(1L));
        assertEquals(locationDTO, locationController.getLocationById(1L));
        verify(locationController.getLocationById(1L));
    }

    @Test
    void getLocations() {
        when(locationService.getAllLocations()).thenReturn(locationDTOS);
        assertNotNull(locationController.getLocations());
        assertEquals(1, locationController.getLocations().size());
        verify(locationController.getLocations());
    }
}
