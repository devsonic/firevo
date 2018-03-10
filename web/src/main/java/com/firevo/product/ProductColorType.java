/**
 * ProductColorType.java 2018.03.10.
 *
 * Copyright 2018 NAVER Corp. All rights Reserved.
 * NAVER PROPRIETARY/CONFIDENTIAL. Use is subject to license terms.
 */
package com.firevo.product;

import lombok.Getter;
import lombok.RequiredArgsConstructor;

/**
 * ProductColorType
 *
 * @author jk.yoon
 * @version 1.0.0
 * @since 2018. 03. 10.
 */
@Getter
@RequiredArgsConstructor
public enum ProductColorType {
	STANDARD_WHITE(0, "스탠다드화이트")
	,PINK_BLOSSOM(1, "핑크블로섬")
	,SPEARMINT(2, "스피아민트")
	,ANTIQUE_BROWN(3, "엔틱브라운")
	,RETRO_ORANGE(4, "레트로오렌지")
	,TOPAZ_YELLOW(5, "토파즈옐로우")
	,PINK_POP(6, "핑크팝");

	private final int code;
	private final String desc;

	public static ProductColorType find(int code) {
		for(ProductColorType type : values()) {
			if(type.getCode() == code) {
				return type;
			}
		}
		return null;
	}
}