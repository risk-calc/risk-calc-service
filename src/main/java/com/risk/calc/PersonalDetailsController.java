package com.risk.calc;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.risk.calc.model.FinancialDetails;
import com.risk.calc.repository.FinancialDetailRepository;

@RestController
public class PersonalDetailsController {

	@Autowired
	private FinancialDetailRepository financialDetailRepository;

	@RequestMapping(method = RequestMethod.POST, value = "/saveFinancialDetail")
	public void addPersonalDetail(@RequestBody FinancialDetails financialDetails) {
		financialDetailRepository.save(financialDetails);
	}
}
