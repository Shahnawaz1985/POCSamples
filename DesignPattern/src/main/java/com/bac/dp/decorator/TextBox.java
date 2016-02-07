package com.bac.dp.decorator;

import java.util.LinkedList;
import java.util.List;

public class TextBox implements GraphicalComponent {
	
	private List<String> lines = new LinkedList<String>();

	public GraphicalComponent addComponent(String text) {
		lines.add(text);
		if(lines.size() == 3){
			return new ScrollBarDecorator(this);
		}
		return this;
	}

	public void paint() {
		System.out.println("TextBox starts...");
		for(String str : lines){
			System.out.println(str);
		}
		System.out.println("TextBox ends...");
	}

}
