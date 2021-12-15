package gr0102.projectecommercewaa.dto;

import gr0102.projectecommercewaa.domain.ProductCategory;
import gr0102.projectecommercewaa.domain.ProductStatus;
import gr0102.projectecommercewaa.domain.User;
import lombok.Data;

import java.time.LocalDateTime;

@Data
public class ProductDto {
    private Integer id;
    private ProductCategory productCategory;
    private String name;
    private LocalDateTime addedDate;
    private double price;
    private ProductStatus productStatus;
    private User user;
}