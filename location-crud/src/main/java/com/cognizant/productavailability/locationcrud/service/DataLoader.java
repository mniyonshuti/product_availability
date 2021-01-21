package com.cognizant.productavailability.locationcrud.service;

import com.cognizant.productavailability.locationcrud.model.Address;
import com.cognizant.productavailability.locationcrud.model.Location;
import com.cognizant.productavailability.locationcrud.repository.AddressRepository;
import com.cognizant.productavailability.locationcrud.repository.LocationRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

//@Component
public class DataLoader implements CommandLineRunner {

    @Autowired
    LocationRepository locationRepository;

    @Autowired
    AddressRepository addressRepository;

    @Override
    public void run(String... args) throws Exception {
        List<Location> locations = new ArrayList<>();
        locations.add(new Location(1L, "Fairfield-A", 1L));
        locations.add(new Location(2L, "Cali Dept", 2L));
        locations.add(new Location(3L, "Texas-One", 3L));
        locations.add(new Location(4L, "Colorado Dept", 4L));
        locations.add(new Location(5L, "Texas-Five", 5L));
        locations.add(new Location(6L, "Texas-Two", 6L));
        locations.add(new Location(7L, "Texas-Three", 7L));
        locations.add(new Location(8L, "Texas-Four", 8L));
        locations.add(new Location(9L, "Fairfield-B", 1L));
        locations.add(new Location(10L, "Fairfield-C", 1L));
        locations.add(new Location(11L, "Fairfield-D", 1L));
        locations.add(new Location(12L, "Fairfield-E", 1L));

        List<Address> addresses = new ArrayList<>();
        addresses.add(new Address(1L, "1000 N", "Fairfield", "IA", "USA", "52557"));
        addresses.add(new Address(2L, "Fair Oaks", "Sacaramento", "CA", "USA", "95825"));
        addresses.add(new Address(3L, "Robbie Rd", "Plano", "TX", "USA", "78159"));
        addresses.add(new Address(4L, "Real Street", "Colorado", "CO", "USA", "80920"));
        addresses.add(new Address(5L, "2144 Argyle Dr", "Plano", "TX", "USA", "75023"));
        addresses.add(new Address(6L, "Ohio Dr", "Plano", "TX", "USA", "75093"));
        addresses.add(new Address(7L, "1902-1900 Antwerp Ave", "Plano", "TX", "USA", "75025"));
        addresses.add(new Address(8L, "2404 Evans Dr", "Plano", "TX", "USA", "75075"));
        addresses.add(new Address(9L, "1037-1099 IA-1", "Fairfield", "IA", "USA", "75023"));
        addresses.add(new Address(10L, "WXXG+W2 Libertyville", "Libertyville", "IA", "USA", "75093"));
        addresses.add(new Address(11L, "Polk", "Packwood", "IA", "USA", "75025"));
        addresses.add(new Address(12L, "Locust Grove", "Batavia", "IA", "USA", "75075"));

        locationRepository.saveAll(locations);
        addressRepository.saveAll(addresses);
    }
}
