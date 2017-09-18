package com.risk.calc;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.risk.calc.model.RiskInfo;
import com.risk.calc.repository.RiskCalcRepository;

@RestController
@RequestMapping("/riskcalc")
public class RiskCalcController {

	@Autowired
	private RiskCalcRepository riskCalcRepository;
	
	@RequestMapping(value = "/save", method = RequestMethod.POST, consumes = MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<RiskInfo> save(@RequestBody RiskInfo riskinfo) {
		riskCalcRepository.save(riskinfo);

		return new ResponseEntity<RiskInfo>(riskinfo, HttpStatus.CREATED);
	}
	
}
