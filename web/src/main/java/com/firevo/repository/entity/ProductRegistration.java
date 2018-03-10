package com.firevo.repository.entity;

import lombok.*;

import java.time.LocalDate;
import java.time.LocalDateTime;

@Data
@NoArgsConstructor
public class ProductRegistration {
    private String serialNumber;
    private String name;
    private LocalDate birthday;
    private String colorType;
    private LocalDateTime purchaseDate;
    private String shopType;
    private String shopName;
    private LocalDateTime registerDate;
}
