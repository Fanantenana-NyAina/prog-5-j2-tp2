package com.project.configuration;

import com.project.entity.children.Bicycle;
import com.project.entity.children.Car;
import com.project.entity.children.House;
import com.project.repository.RentalItemRepository;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class Data {

    @Bean
    public RentalItemRepository rentalItemData(RentalItemRepository data) {
        data.save(new Car(100_000d, "car", "Ford Raptor - Luxury 4x4"));
        data.save(new House(1_000_000d, "house", "white house - Luxury house that with many room"));
        data.save(new Bicycle(50_000d, "bicycle", "VTT mountain bicycle"));

        return data;
    }
}
