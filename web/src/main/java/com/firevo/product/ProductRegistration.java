/**
 * ProductRegistration.java 2018.03.10.
 *
 * Copyright 2018 NAVER Corp. All rights Reserved.
 * NAVER PROPRIETARY/CONFIDENTIAL. Use is subject to license terms.
 */
package com.firevo.product;

import java.time.LocalDate;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import org.hibernate.validator.constraints.NotBlank;

import lombok.Getter;
import lombok.Setter;

/**
 * ProductRegistration
 *
 * @author jk.yoon
 * @version 1.0.0
 * @since 2018. 03. 10.
 */
@Getter
@Setter
public class ProductRegistration {
	@NotBlank(message = "구매자 이름을 입력하세요.")
	@Size(max = 30, message = "구매자 이름은 30자 이내로 입력하세요.")
	private String name;

	@NotNull(message = "생년월일 값이 유효하지 않습니다.")
	private LocalDate birthday;

	@NotNull(message = "제품 색상 값이 유효하지 않습니다.")
	private ProductColorType colorType;

	@NotBlank(message = "제품 S/N을 입력하세요.")
	@Size(max = 30, message = "구매자 이름은 30자 이내로 입력하세요.")
	private String serialNumber;

	@NotNull(message = "제품 구매일이 유효하지 않습니다.")
	private LocalDate purchaseDate;

	@NotNull(message = "구매처 값이 유효하지 않습니다.")
	private ProductShopType shopType;

	@Size(max = 30, message = "구매처는 30자 이내로 입력하세요.")
	private String shopName;
}