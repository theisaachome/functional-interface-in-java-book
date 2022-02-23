package com.isaachome;


class SampleClass  implements SampleInterface{

	@Override
	public void method1(String s) {
		// TODO Auto-generated method stub
		System.out.println("Impleted interface method..");
		
	}

}

class B  implements SampleInterface{

	@Override
	public void method1(String s) {
		// TODO Auto-generated method stub
		
	}
	
}

class C implements StringProcessorUtils{

	@Override
	public String processString(String s) {
		// TODO Auto-generated method stub
		return s.toUpperCase();
	}
	
}