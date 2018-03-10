package com.firevo.repository.mapper;

import com.firevo.repository.entity.ProductRegistration;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

@Mapper
@Repository
public interface ProductRegistrationMapper {
    void insert(ProductRegistration productRegistration);
    ProductRegistration selectOne(@Param("serialNumber") String serialNumber);
}
