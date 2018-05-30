package com.delinquency.backend.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.delinquency.backend.entity.State;
import com.delinquency.backend.service.DelinquencyService;

@RestController
public class DelinquencyController {

	@Autowired
	DelinquencyService delinquencyService;

	@GetMapping(value="/hola", produces = MediaType.APPLICATION_JSON_VALUE)
	public @ResponseBody State index() {
		return delinquencyService.getState();
	}

}
