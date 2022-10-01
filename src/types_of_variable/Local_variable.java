package types_of_variable;

public class Local_variable 
{
	
	int a=50;               // the variable which is outside the method is call as global variable 
	int b=60;
public void m1()
{
	int a=10;               // the variable which is inside method is call as local variable 
	int b=30;
	{System.out.println(a+b);}
}
}
