package com.vincent.design.behavioral_pattern.visitor_pattern;

public class Keyboard implements ComputerPart {

	public Keyboard() {
		// TODO Auto-generated constructor stub
	}

	@Override
	public void accept(ComputerPartVisitor computerPartVisitor) {
		// TODO Auto-generated method stub
		computerPartVisitor.visit(this);
	}

}
