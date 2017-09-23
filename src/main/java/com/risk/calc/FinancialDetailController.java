package com.risk.calc;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.risk.calc.model.PersonalData;
import com.risk.calc.repository.PersonalDetailRepository;

@RestController
public class FinancialDetailController {

	@Autowired
	private PersonalDetailRepository personalDetailRepository;

	@RequestMapping(method = RequestMethod.POST, value = "/savePersonalData")
	public void addPersonalDetail(@RequestBody PersonalData personalData) {
		personalDetailRepository.save(personalData);
	}
}
