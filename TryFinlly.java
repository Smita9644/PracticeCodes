package unchecked_exception;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.InputMismatchException;
import java.util.Scanner;

public class TryFinlly {

	public void PrintNumber()
	{
		try
		{
			int a;
			Scanner sc=new Scanner(System.in);
			System.out.println("Enter the value of a");
		     a=sc.nextInt();
			System.out.println(a);
			
		}
		catch(InputMismatchException ex)
		{
			System.out.println("InputMismatchException");
		}
	}
	
	public void PrintNumber1()
	{
		try
		{
			int a;
			Scanner sc=new Scanner(System.in);
			System.out.println("Enter the value of a");
		     a=sc.nextInt();
			System.out.println(a);
			
		}
		finally
		{
			System.out.println("inside finally block");
		}
	}
	public void PrintNumber2() throws FileNotFoundException
	{
		try
		{
			FileReader file=new FileReader("C:\\Users\\smita.patil\\Desktop\\test.txt");
			//file.read();
			
		}
		finally
		{
			System.out.println("inside finally block");
		}
	}
	public static void main(String[] args)
	{
		TryFinlly t=new TryFinlly();
		try
		{
		
		t.PrintNumber2();
		}
		catch(IOException ex)
		{
			System.out.println("inside Io exception");
		}
		t.PrintNumber();
		t.PrintNumber1();
	
	}
}
