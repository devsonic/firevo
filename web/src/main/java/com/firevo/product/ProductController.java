/**
 * ProductController.java 2018.03.10.
 *
 * Copyright 2018 NAVER Corp. All rights Reserved.
 * NAVER PROPRIETARY/CONFIDENTIAL. Use is subject to license terms.
 */
package com.firevo.product;

import java.beans.PropertyEditorSupport;
import java.time.LocalDate;

import javax.validation.Valid;

import org.apache.commons.lang3.StringUtils;
import org.springframework.validation.BindException;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * ProductController
 *
 * @author jk.yoon
 * @version 1.0.0
 * @since 2018. 03. 10.
 */
@RestController
@RequestMapping("/product/*")
public class ProductController {
	@InitBinder
	public void initBinder(WebDataBinder binder) {
		binder.registerCustomEditor(ProductColorType.class, new PropertyEditorSupport() {
			@Override
			public void setAsText(String text) throws IllegalArgumentException {
				setValue(ProductColorType.find(Integer.valueOf(text)));
			}
		});

		binder.registerCustomEditor(ProductShopType.class, new PropertyEditorSupport() {
			@Override
			public void setAsText(String text) throws IllegalArgumentException {
				setValue(ProductShopType.find(Integer.valueOf(text)));
			}
		});

		binder.registerCustomEditor(LocalDate.class, new PropertyEditorSupport() {
			@Override
			public void setAsText(String text) throws IllegalArgumentException {
				try {
					String[] split = text.split(",");
					setValue(LocalDate.of(Integer.valueOf(split[0]), Integer.valueOf(split[1]), Integer.valueOf(split[2])));
				} catch (Exception ex) {
					setValue(null);
				}
			}
		});
	}

	@PostMapping("/registration")
	public Object register(@Valid @ModelAttribute ProductRegistration product) {
		//validator 만들기 귀찮아.
		if(product.getShopType() == ProductShopType.ELSE) {
			if(StringUtils.isEmpty(product.getShopName())) {
				return "기타 구매처를 입력하세요.";
			}
		}
		return "success";
	}

	@ExceptionHandler(BindException.class)
	public Object handleBindException(BindException bindException) {
		return bindException.getFieldError().getDefaultMessage();
	}
}