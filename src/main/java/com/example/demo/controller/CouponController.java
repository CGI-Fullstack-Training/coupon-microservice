package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.Coupon;
import com.example.demo.service.CouponService;

@RestController
@RequestMapping("/coupons")
public class CouponController {
	@Autowired
	private CouponService couponService;

	@PostMapping
	public ResponseEntity<?> createCoupon(@RequestBody Coupon coupon) {
		return ResponseEntity.status(HttpStatus.CREATED).body(couponService.createCoupon(coupon));
	}
	
	@GetMapping("/{code}")
	public ResponseEntity<?> getCouponByCode(@PathVariable("code") int code){
		return ResponseEntity.ok(couponService.getCouponByCode(code));
	}

}
