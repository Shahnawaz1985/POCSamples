package com.bac.dp.decorator;

/**
 * 
 * @author Shahnawaz
 *
 */
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
