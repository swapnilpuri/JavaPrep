package com.dp.proxy;

interface ExpensiveObject {
   void process();
}

class ExpensiveObjectImpl implements ExpensiveObject{
	
	public ExpensiveObjectImpl() {
		
	}
	
	@Override
	public void process() {
		System.out.println("ExpensiveObjectImpl process implementation..");
	}
	
	private void heavyProcessing() {
		System.out.println("Inside heavy processing..");
	}
}

class ExpensiveObjectProxy implements ExpensiveObject {
	private static ExpensiveObject object; 

	@Override
	public void process() {
		if (object == null) {
			object = new ExpensiveObjectImpl();
		}
		object.process();
	}
	
}

class TestProxy{
	public static void main(String[] args) {
		ExpensiveObject object = new ExpensiveObjectProxy();
		object.process();
	}
}
