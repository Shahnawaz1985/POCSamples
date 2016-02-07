package com.bac.dp.decorator;

/**
 * 
 * @author Shahnawaz
 *
 */
public class ScrollBarDecorator extends Decorator {

	public ScrollBarDecorator(GraphicalComponent target) {
		super(target);		
	}
	
	public void paint(){
		System.out.println("ScrollBar goes here...");
		super.paint();
		System.out.println("ScrollBar ends here...");
	}

}
