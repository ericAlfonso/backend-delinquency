package com.delinquency.backend.dao.impl;

import org.springframework.stereotype.Repository;

import com.delinquency.backend.dao.DelinquencyDAO;
import com.delinquency.backend.entity.State;

@Repository
public class DelinquencyDAOImpl implements DelinquencyDAO{

	@Override
	public State getState() {

		return new State("Guadalajara", "200", 3);
	}

}
