package com.olive.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/vendor")
public class VendorRestController {
	
	@Value("${eureka.instance.instance-id}")
	private String id;

	@RequestMapping("/msg")
	public ResponseEntity<String> data(){

		return new ResponseEntity<String>("WELCOME Producer With Vendor APP  Instance Id ::=>  " + id, HttpStatus.OK);
	}
}
