package unchecked_exception;

import java.io.IOException;

public class NestedTry 
{
	
	public int DivisionOfTwoNumber()
	{
		
		try {
			int num1=10;
			int num2=0;
			//int result=num1/num2;
				try
				{
					int num11=10;
					int num22=0;
					int result1=num11/num22;
			    }
				finally
				{
					System.out.println("inside inner finally block");
				}
				
			}
		catch(ArithmeticException ex)
		{
			System.out.println("inside outer catch block");
			
		}
		return 0;	
	}
   
	public int DivisionOfTwoNumbers()
	{
		
		try {
			int num1=10;
			int num2=0;
			//int result=num1/num2;
				try
				{
					int num11=10;
					int num22=0;
					int result1=num11/num22;
			    }
				catch(NumberFormatException ex)
				{
					System.out.println("insid inner catch block");
				}
				
			}
		catch(ArithmeticException ex)
		{
			System.out.println("inside outer catch block");
			
		}
		return 0;	
	}
   
	public int DivisionOfTwoNumbers1()
	{
		
		try {
			int num1=10;
			int num2=0;
			//int result=num1/num2;
				try
				{
					int num11=10;
					int num22=0;
					int result1=num11/num22;
			    }
				catch(NumberFormatException ex)
				{
					System.out.println("insid inner catch block");
				}
				
			}
		catch(NumberFormatException ex)
		{
			System.out.println("inside outer catch block");
			
		}
		return 0;	
	}
   
	
	public int DivisionOfTwoNumbers2()
	{
		
		try {
			int num1=10;
			int num2=0;
			//int result=num1/num2;
				try
				{
					int num11=10;
					int num22=0;
					int result1=num11/num22;
			    }
				catch(ArithmeticException ex)
				{
					System.out.println("inside inner catch block");
					int r=num1/num2;
				}
				
			}
		catch(ArithmeticException ex)
		{
			System.out.println("inside outer catch block");
			
		}
		return 0;	
	}
	
	public int DivisionOfTwoNumbers3()
	{
		
		try {
			int num1=10;
			int num2=0;
			//int result=num1/num2;
				try
				{
					int num11=10;
					int num22=0;
					int result1=num11/num22;
			    }
				catch(NumberFormatException ex)
				{
					System.out.println("inside inner catch block");
					int r=num1/num2;
				}
				
			}
		catch(NumberFormatException ex)
		{
			System.out.println("inside outer catch block");
			
		}
		return 0;	
	}
	public int DivisionOfTwoNumbers4()
	{
		
		try {
			int num1=10;
			int num2=0;
			//int result=num1/num2;
				try
				{
					int num11=10;
					int num22=0;
					int result1=num11/num22;
			    }
				catch(ArithmeticException ex)
				{
					System.out.println("inside inner catch block");
					int r=num1/num2;
				}
				
			}
		catch(NumberFormatException ex)
		{
			System.out.println("inside outer catch block");
			
		}
		return 0;	
	}
   public static void main(String[] args) {
	NestedTry t=new NestedTry();
	//t.DivisionOfTwoNumber();
	//t.DivisionOfTwoNumbers();
	//t.DivisionOfTwoNumbers1();
	//t.DivisionOfTwoNumbers2();
	//t.DivisionOfTwoNumbers3();
	t.DivisionOfTwoNumbers4();
}
}
