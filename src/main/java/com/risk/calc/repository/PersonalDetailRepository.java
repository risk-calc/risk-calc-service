package com.risk.calc.repository;

import org.springframework.data.repository.CrudRepository;

import com.risk.calc.model.PersonalData;

public interface PersonalDetailRepository extends
		CrudRepository<PersonalData, Integer> {

}
