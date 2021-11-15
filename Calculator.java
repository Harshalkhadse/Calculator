import java.util.*;

class Calculator{

	Calculator(){
		System.out.println("Enter the two enters numbers");
	}
	
	public double Addition(double num1,double num2){
		double result = num1 + num2;								//double Addition//
		return result;
	}

	public double Subtract(double num1,double num2){
		double result = num1 - num2;								//double subtraction//
		return result;
	}

	public double Multiplication(double num1,double num2){
		double result = num1 * num2;							    //double Multiplication//
		return result;
	}

	public double Division(double num1,double num2){
		double result = num1 / num2;								//double Division//
		return result;
	}


	public static void main(String[] args) {
		Calculator obj = new Calculator();							// constructor invoked
		Scanner scan = new Scanner(System.in);						// scanner contructor

		double num1 = scan.nextDouble();							
		double num2 = scan.nextDouble();
		double num3;

		
		System.out.println(" Which operation you want to perform\n Addition--> A\n Substract --> S\n Multipliy--> M\n Division --> D:");
		
		String input = scan.next();
		if(input.toLowerCase().equals("a")){
			num3 = obj.Addition(num1,num2);
		}else if(input.toLowerCase().equals("s")){
			num3 = obj.Subtract(num1,num2);
		}else if(input.toLowerCase().equals("m")){
			num3 = obj.Multiplication(num1,num2);
		}else{
			num3 = obj.Division(num1,num2);
		}

		System.out.println(num3);
		
	}
}	