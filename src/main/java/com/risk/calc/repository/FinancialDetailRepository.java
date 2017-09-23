package com.risk.calc.repository;

import org.springframework.data.repository.CrudRepository;

import com.risk.calc.model.FinancialDetails;

public interface FinancialDetailRepository extends
		CrudRepository<FinancialDetails, Integer> {

}
