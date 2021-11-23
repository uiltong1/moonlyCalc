package br.com.moonlyCalc.services;

import org.springframework.stereotype.Service;

import br.com.moonlyCalc.exception.UnsuportedMathOperationException;
import br.com.moonlyCalc.helpers.NumberHelper;

@Service
public class MathService {

	public Double sum(String numberOne, String numberTwo) {

		if (!NumberHelper.isNumeric(numberOne) || !NumberHelper.isNumeric(numberTwo)) {
			throw new UnsupportedOperationException("Please set is numeric!");
		}

		Double sum = NumberHelper.convertToNumber(numberOne) + NumberHelper.convertToNumber(numberTwo);

		return sum;
	}

	public Double subtract(String numberOne, String numberTwo) {

		if (!NumberHelper.isNumeric(numberOne) || !NumberHelper.isNumeric(numberTwo)) {
			throw new UnsuportedMathOperationException("Please set is numeric!");
		}

		Double subtract = NumberHelper.convertToNumber(numberOne) - NumberHelper.convertToNumber(numberTwo);

		return subtract;
	}

	public Double multiple(String numberOne, String numberTwo) {

		if (!NumberHelper.isNumeric(numberOne) || !NumberHelper.isNumeric(numberTwo)) {
			throw new UnsuportedMathOperationException("Please set is numeric!");
		}

		Double multiple = NumberHelper.convertToNumber(numberOne) * NumberHelper.convertToNumber(numberTwo);

		return multiple;
	}

	public Double split(String numberOne, String numberTwo) {
		if (!NumberHelper.isNumeric(numberOne) || !NumberHelper.isNumeric(numberTwo)) {
			throw new UnsuportedMathOperationException("Please set is numeric!");
		}

		Double split = NumberHelper.convertToNumber(numberOne) / NumberHelper.convertToNumber(numberTwo);

		return split;
	}

	public Double squareRoot(String number) {

		if (!NumberHelper.isNumeric(number)) {
			throw new UnsuportedMathOperationException("Please is set number!");
		}

		Double squareroot = Math.sqrt(NumberHelper.convertToNumber(number));

		return squareroot;
	}

	public Double mean(String numberOne, String numberTwo) {
		if (!NumberHelper.isNumeric(numberOne) || !NumberHelper.isNumeric(numberTwo)) {
			throw new UnsuportedMathOperationException("Please set is numeric!");
		}

		Double split = (NumberHelper.convertToNumber(numberOne) + NumberHelper.convertToNumber(numberTwo)) / 2;

		return split;
	}

}
