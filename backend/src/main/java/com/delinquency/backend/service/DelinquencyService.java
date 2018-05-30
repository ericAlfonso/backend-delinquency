package com.delinquency.backend.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.delinquency.backend.dao.DelinquencyDAO;
import com.delinquency.backend.entity.State;

@Service
public class DelinquencyService {

	@Autowired
	DelinquencyDAO delinquencyDAO;

	public State getState() {
		return delinquencyDAO.getState();
	}
}
