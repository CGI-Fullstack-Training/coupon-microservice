package com.example.demo.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.model.Coupon;
import com.example.demo.repository.CouponRepository;

@Service
public class CouponServiceImpl implements CouponService {

	@Autowired
	private CouponRepository couponRepository;

	@Override
	public Coupon createCoupon(Coupon coupon) {
		return couponRepository.save(coupon);
	}

	@Override
	public Coupon getCouponByCode(int code) {
		Optional<Coupon> coupon = couponRepository.findById(code);
		if (coupon.isPresent()) {
			return coupon.get();
		}
		return null;
	}

}
