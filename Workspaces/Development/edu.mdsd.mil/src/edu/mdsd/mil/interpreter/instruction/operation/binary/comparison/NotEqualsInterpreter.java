package edu.mdsd.mil.interpreter.instruction.operation.binary.comparison;

public class NotEqualsInterpreter extends ComparisonInterpreter {
	@Override
	protected boolean compare(int operand1, int operand2) {
		return operand1 != operand2;
	}
}
