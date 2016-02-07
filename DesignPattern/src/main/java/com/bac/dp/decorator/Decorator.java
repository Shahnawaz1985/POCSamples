package com.bac.dp.decorator;

public abstract class Decorator implements GraphicalComponent {
	
	private GraphicalComponent target;
	
	public Decorator(GraphicalComponent target){
		this.target = target;
	}

	public GraphicalComponent addComponent(String text) {
		return this;
	}

	public void paint() {
		this.target.paint();

	}

}
