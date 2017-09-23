package com.risk.calc;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.risk.calc.model.InvestmentObjectives;
import com.risk.calc.repository.InvestmentObjectiveRepository;

@RestController
public class InvestmentObjectivesController {

	@Autowired
	private InvestmentObjectiveRepository investmentObjectiveRepository;

	@RequestMapping(method = RequestMethod.POST, value = "/savePersonalData")
	public void addPersonalDetail(
			@RequestBody InvestmentObjectives investmentObjectives) {
		investmentObjectiveRepository.save(investmentObjectives);
	}
}
