package com.risk.calc.repository;

import org.springframework.data.repository.CrudRepository;

import com.risk.calc.model.InvestmentObjectives;

public interface InvestmentObjectiveRepository extends
		CrudRepository<InvestmentObjectives, Integer> {

}
