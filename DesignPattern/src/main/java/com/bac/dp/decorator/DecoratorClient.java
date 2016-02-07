package com.bac.dp.decorator;

public class DecoratorClient {
	
	public static void main(String[] args) {
		GraphicalComponent component = createTextPoemVer1();
		component = new BorderDecorator(component);
		component.paint();
		System.out.println("------------------------------------");
		component = createTextPoemVer2();
		component = new BorderDecorator(component);
		component.paint();
	}
	
	
	private static GraphicalComponent createTextPoemVer1() {
		GraphicalComponent component = new TextBox();
		component = component.addComponent("First Line of Poem");
		component = component.addComponent("Second Line of Poem");			
		return component;
	}

	private static GraphicalComponent createTextPoemVer2() {
		GraphicalComponent component = new TextBox();
		component = component.addComponent("First Line of Poem");
		component = component.addComponent("Second Line of Poem");
		component = component.addComponent("Third Line of Poem");
		component = component.addComponent("Fourth Line of Poem");
		component = component.addComponent("Fifth Line of Poem");
		component = component.addComponent("Sixth Line of Poem");
		return component;
	}

}
