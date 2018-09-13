//contains various methods that do math calculations
//@author JasonJi
//@version 9/12/18

public class Calculate {
	//returns the square to input
	public static int square(int number) {
		int answer;
		answer = number*number;
		return answer;
		//return number*number;
	}
	public static int cube(int number) {
		int answer = number*number*number;
		return answer;
	}
	public static double average(double number1,double number2) {
		double answer = (number1 + number2)/2 ;
		return answer;
	}
	public static double average(double number1,double number2,double number3) {
		double answer = (number1 + number2 + number3)/3;
		return answer;
	}
	public static double toDegrees(double number) {
		double answer = (number/180)*3.14159;
		return answer;
	}
	public static double toRadians(double number) {
		double answer = (number/3.14159)*180;
		return answer;
	}
	public static double discreminant(double number1,double number2,double number3) {
		double answer = (number2*number2)-(4*number1*number3);
		return answer;
	}
}
