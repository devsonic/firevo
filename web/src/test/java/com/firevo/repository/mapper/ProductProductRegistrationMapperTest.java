package com.firevo.repository.mapper;
import com.firevo.repository.entity.ProductRegistration;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.transaction.annotation.Transactional;

import java.time.LocalDate;
import java.time.LocalDateTime;

@RunWith(SpringRunner.class)
@SpringBootTest
@Transactional
public class ProductProductRegistrationMapperTest {
    public static final String TEST_SERIAL_NUMBER = "374HD-314A4-43JQA-4384H";
    @Autowired
    private ProductRegistrationMapper mapper;

    @Test
    public void insert() {
        ProductRegistration productRegistration = new ProductRegistration();

        productRegistration.setSerialNumber(TEST_SERIAL_NUMBER);
        productRegistration.setName("kimsoso");
        productRegistration.setBirthday(LocalDate.of(1981,5,4));
        productRegistration.setColorType("DARK_BLUE");
        productRegistration.setShopType("FAMOUS_SHOP");
        productRegistration.setShopName("쏘샵");
        productRegistration.setPurchaseDate(LocalDateTime.now());
        productRegistration.setRegisterDate(LocalDateTime.now());

        mapper.insert(productRegistration);
        ProductRegistration product = mapper.selectOne(TEST_SERIAL_NUMBER);

        System.out.println(product);
    }
}