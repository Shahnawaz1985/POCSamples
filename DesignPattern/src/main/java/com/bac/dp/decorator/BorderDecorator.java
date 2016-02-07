package com.bac.dp.decorator;

public class BorderDecorator extends Decorator {

	public BorderDecorator(GraphicalComponent target) {
		super(target);		
	}
	
	public void paint(){
		System.out.println("Border starts here...");
		super.paint();
		System.out.println("Border ends here...");
	}

}
