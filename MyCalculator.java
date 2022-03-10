package week1.day2;

public class MyCalculator {

	public static void main(String[] args) {
		Calculator calObj = new Calculator();
		
		//Addition
		System.out.println("Addition of 10,20,80 is "+calObj.add(10, 20, 80));
		
		//Subtraction
		System.out.println("Substraction of 25, 10 is "+calObj.sub(25, 10));
		
		//Multiplication
		System.out.println("Multiplication of 25.1, 25.25 is "+calObj.mul(25.1, 25.25));
		
		//Division
		System.out.println("Division of 122, 11 is "+calObj.divide(122, 11));
	}

}
