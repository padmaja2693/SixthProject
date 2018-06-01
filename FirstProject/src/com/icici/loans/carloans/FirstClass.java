package com.icici.loans.carloans;

public class FirstClass implements SecondClass
{
	

	int a=10,b=20,c=0;
	public void addition() 
	{
		c=a+b;
		System.out.println("addition of a&b are:"+c);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		FirstClass obj=new FirstClass();
		obj.addition();
		obj.multiplication();
	}

	@Override
	public void multiplication() {
		// TODO Auto-generated method stub
		System.out.println("multiplication override method in SecondClass");
		
	}
}
	


