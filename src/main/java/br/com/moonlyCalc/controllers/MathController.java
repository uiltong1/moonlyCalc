package br.com.moonlyCalc.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import br.com.moonlyCalc.exception.UnsuportedMathOperationException;
import br.com.moonlyCalc.helpers.NumberHelper;
import br.com.moonlyCalc.services.MathService;

@RestController
public class MathController {

	@Autowired
	private MathService mathService;

	@RequestMapping(value = "/sum/{numberOne}/{numberTwo}", method = RequestMethod.GET)
	public Double sum(@PathVariable("numberOne") String numberOne, @PathVariable("numberTwo") String numberTwo) {
		return mathService.sum(numberOne, numberTwo);
	}

	@RequestMapping(value = "/subtract/{numberOne}/{numberTwo}", method = RequestMethod.GET)
	public Double subtract(@PathVariable("numberOne") String numberOne, @PathVariable("numberTwo") String numberTwo) {
		return mathService.subtract(numberOne, numberTwo);
	}

	@RequestMapping(value = "/multiple/{numberOne}/{numberTwo}", method = RequestMethod.GET)
	public Double multiple(@PathVariable("numberOne") String numberOne, @PathVariable("numberTwo") String numberTwo) {
		return mathService.multiple(numberOne, numberTwo);
	}

	@RequestMapping(value = "/split/{numberOne}/{numberTwo}", method = RequestMethod.GET)
	public Double split(@PathVariable("numberOne") String numberOne, @PathVariable("numberTwo") String numberTwo) {
		return mathService.split(numberOne, numberTwo);
	}

	@RequestMapping(value = "squareroot/{number}", method = RequestMethod.GET)
	public Double squareroot(@PathVariable("number") String number) {
		return mathService.squareRoot(number);
	}

	@RequestMapping(value = "/mean/{numberOne}/{numberTwo}", method = RequestMethod.GET)
	public Double mean(@PathVariable("numberOne") String numberOne, @PathVariable("numberTwo") String numberTwo) {
		return mathService.mean(numberOne, numberTwo);
	}

}
