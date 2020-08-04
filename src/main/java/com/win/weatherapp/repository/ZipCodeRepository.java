package com.win.weatherapp.repository;

import com.win.weatherapp.model.ZipCode;

import org.springframework.data.jpa.repository.JpaRepository;

public interface ZipCodeRepository extends JpaRepository<ZipCode, Long> {
    
    public ZipCode findByZip(String zipcode);

}