package com.example.demo.service;

import com.example.demo.model.Coupon;

public interface CouponService {
	public Coupon createCoupon(Coupon coupon);

	public Coupon getCouponByCode(int code);

}
