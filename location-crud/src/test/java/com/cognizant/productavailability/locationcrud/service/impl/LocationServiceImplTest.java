package com.cognizant.productavailability.locationcrud.service.impl;

import com.cognizant.productavailability.locationcrud.model.Address;
import com.cognizant.productavailability.locationcrud.model.Location;
import com.cognizant.productavailability.locationcrud.model.LocationDTO;
import com.cognizant.productavailability.locationcrud.repository.AddressRepository;
import com.cognizant.productavailability.locationcrud.repository.LocationRepository;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;
import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;
import java.util.List;

import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;


@ExtendWith(MockitoExtension.class)
class LocationServiceImplTest {

    Address address;
    Location location;
    LocationDTO locationDTO;
    List<Location> locations;
    List<LocationDTO> locationDTOS;

    @InjectMocks
    LocationServiceImpl locationService = new LocationServiceImpl();

    @Mock
    private LocationRepository locationRepository;

    @Mock
    private AddressRepository addressRepository;


    @BeforeEach
    void setUp() {
        locations = new ArrayList<>();
        locationDTOS = new ArrayList<>();
        address = new Address(1L, "1000 N", "Fairfield", "IA", "USA", "54220");
        location = new Location(1L, "Fairfield Dept", 1L);
        locationDTO = new LocationDTO(1L,"Fairfield Dept",address);
        locationDTOS.add(locationDTO);
        locations.add(location);
    }

    @Test
    void getLocationById() {
        when(addressRepository.findById(1L).get()).thenReturn(address);
        when(locationRepository.findById(1L).get()).thenReturn(location);
        assertNotNull(locationService.getLocationById(1L));
        assertEquals(locationDTO, locationService.getLocationById(1L));
        verify(locationService).getLocationById(1L);
    }

    @Test
    void getAllLocations() {
        when(locationRepository.findAll()).thenReturn(locations);
        assertNotNull(locationService.getAllLocations());
        assertEquals(1, locationService.getAllLocations().size());
        verify(locationService).getAllLocations();
    }
}
