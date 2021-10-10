package com.dp.tree;

public class BubbleLights extends TreeDecorator {
	
	public BubbleLights(ChristmasTree tree) {
		super(tree) ;
	}
	
	@Override
	public String decorate() {
		return super.decorate() + bubbleLights();
	}
	
	private String bubbleLights() {
		return " with Bubble Lights";
	}	

}
