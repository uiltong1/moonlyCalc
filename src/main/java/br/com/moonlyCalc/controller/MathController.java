package br.com.moonlyCalc.controller;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import br.com.moonlyCalc.exception.UnsuportedMathOperationException;

@RestController
public class MathController {

	@RequestMapping(value = "/sum/{numberOne}/{numberTwo}", method = RequestMethod.GET)
	public Double sum(@PathVariable("numberOne") String numberOne, @PathVariable("numberTwo") String numberTwo)
			throws Exception {
		if (!isNumeric(numberOne) || !isNumeric(numberTwo)) {
			throw new UnsupportedOperationException("Please set is numeric!");
		}

		Double sum = convertToNumber(numberOne) + convertToNumber(numberTwo);

		return sum;
	}

	@RequestMapping(value = "/subtract/{numberOne}/{numberTwo}", method = RequestMethod.GET)
	public Double subtract(@PathVariable("numberOne") String numberOne, @PathVariable("numberTwo") String numberTwo) {

		if (!isNumeric(numberOne) || !isNumeric(numberTwo)) {
			throw new UnsuportedMathOperationException("Please set is numeric!");
		}

		Double subtract = convertToNumber(numberOne) - convertToNumber(numberTwo);

		return subtract;
	}

	@RequestMapping(value = "/multiple/{numberOne}/{numberTwo}", method = RequestMethod.GET)
	public Double multiple(@PathVariable("numberOne") String numberOne, @PathVariable("numberTwo") String numberTwo) {
		if (!isNumeric(numberOne) || !isNumeric(numberTwo)) {
			throw new UnsuportedMathOperationException("Please set is numeric!");
		}

		Double multiple = convertToNumber(numberOne) * convertToNumber(numberTwo);

		return multiple;
	}

	@RequestMapping(value = "/split/{numberOne}/{numberTwo}", method = RequestMethod.GET)
	public Double split(@PathVariable("numberOne") String numberOne, @PathVariable("numberTwo") String numberTwo) {
		if (!isNumeric(numberOne) || !isNumeric(numberTwo)) {
			throw new UnsuportedMathOperationException("Please set is numeric!");
		}

		Double split = convertToNumber(numberOne) / convertToNumber(numberTwo);

		return split;
	}

	@RequestMapping(value = "squareroot/{number}", method = RequestMethod.GET)
	public Double squareroot(@PathVariable("number") String number) {
		if (!isNumeric(number)) {
			throw new UnsuportedMathOperationException("Please is set number!");
		}

		Double squareroot = Math.sqrt(convertToNumber(number));

		return squareroot;
	}

	private Double convertToNumber(String strNumber) {
		if (strNumber == null)
			return 0D;
		String number = strNumber.replace(",", ".");
		if (isNumeric(number))
			return Double.parseDouble(number);
		return 0D;
	}

	private boolean isNumeric(String strNumber) {
		if (strNumber == null)
			return false;
		String number = strNumber.replace(",", ".");
		return number.matches("[-+]?[0-9]*\\.?[0-9]+");
	}
}
