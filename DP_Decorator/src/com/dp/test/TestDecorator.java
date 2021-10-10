package com.dp.test;

import com.dp.tree.BubbleLights;
import com.dp.tree.ChristmasTree;
import com.dp.tree.ChristmasTreeImpl;
import com.dp.tree.Garland;

public class TestDecorator {

	public static void main(String[] args) {
		ChristmasTree christmasTree = new Garland(new ChristmasTreeImpl());
		System.out.println(christmasTree.decorate());
		
		System.out.println(new BubbleLights(christmasTree).decorate());
		

	}

}
