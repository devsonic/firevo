/**
 * ProductShopType.java 2018.03.10.
 *
 * Copyright 2018 NAVER Corp. All rights Reserved.
 * NAVER PROPRIETARY/CONFIDENTIAL. Use is subject to license terms.
 */
package com.firevo.product;

import lombok.Getter;
import lombok.RequiredArgsConstructor;

/**
 * ProductShopType
 *
 * @author jk.yoon
 * @version 1.0.0
 * @since 2018. 03. 10.
 */
@Getter
@RequiredArgsConstructor
public enum ProductShopType {
	HOMEPAGE(0, "닥터파이어 홈페이지")
	,NAVER_STOREFARM(1, "네이버 스토어팜")
	,AUCTION(2, "옥션")
	,STREET_11(3, "11번가")
	,G_MARKET(4, "지마켓")
	,WE_MAKE_PRICE(5, "위메프")
	,INTERPARK(6, "인터파크")
	,HYUNDAI_MALL(7, "현대몰")
	,EL_LOTTE(8, "엘롯데")
	,ELSE(9, "기타 - 직접입력");

	private final int code;
	private final String desc;

	public static ProductShopType find(int code) {
		for(ProductShopType type : values()) {
			if(type.getCode() == code) {
				return type;
			}
		}
		return null;
	}
}