//contains various methods that do math calculations
//@author JasonJi
//@version 9/12/18

//Part 1
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
	public static double discriminant(double number1,double number2,double number3) {
		double answer = (number2*number2)-(4*number1*number3);
		return answer;
	}
	//return Improper Fraction(String) when input three mixed numbers
	public static String toImproperfrac(int wholenumber,int numerator,int denominator) {
		int fraction = denominator * wholenumber + numerator;
		return fraction + "/" + denominator;
	}
	//return mixed number(String) when input numerator and denominator
	public static String toMixedNum(int numerator, int denominator) {
		int wholeNum = numerator / denominator;
		int newNumber = numerator % denominator;
		return wholeNum + "_" + newNumber + "/" + denominator;
	}
	public static String foil(int a, int b, int c, int d, String x) {
		int f = a * c;
		int o = a * d;
		int i = b * c;
		int l = b * d;
		int oi = o + i;
		return f + x + "^2" + "+" + oi + x + "+" + l;
	}

// Part 2
	public static String isDivisibleBy(int number1,int number2) {
		int a = number1 % number2;
		int b = number1 % number2;
		if (a == 0 && b == 0) {
			return "Both of them can be divided by the other.";
		}
		else {
			return "It can't be divided.";
		}	
	}
	public static double absValue(double number) {
		if (number>=0) {
			double answer = number;
			return answer;
		}
		else {
			double answer = number-2*number;
			return answer;
		}
	}
	public static double max(double number1,double number2,double number3) {
		if (number1>number2 && number1>number3) {
			return number1;
		}
		else if (number2>number1 && number2>number3) {
			return number2;
		}
		else {
			return number3;
		}
	}
	public static int min(int a ,int b) {
		if (a>=b) {
			return b;
		}
		else {
			return a;
		}
	}
	public static double round2(double a) {
		double b = 100*a;
		a= (int) b;
		double c= b-a;
		if (c>=0.5) {
			return (a+1)/100;
		}
		else {
			return a/100;
		}
		}
	}
	
	

 