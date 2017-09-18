package com.risk.calc.repository;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.risk.calc.model.RiskInfo;

public interface RiskCalcRepository extends MongoRepository<RiskInfo, Integer> {

}
