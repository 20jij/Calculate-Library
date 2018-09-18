//This class contains methods to perform various mathematical topic
//@author JasonJi
//client code 
//@version 9/12/18
public class DoMath {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(Calculate.square(-3));
		System.out.println(Calculate.average(-3,-6));
		System.out.println(Calculate.average(3.7,8.8));
		System.out.println(Calculate.toDegrees(45));
		System.out.println(Calculate.discriminant(3,5,8));
		System.out.println(Calculate.toImproperfrac(3,4,5));
		System.out.println(Calculate.toMixedNum(7,2));
		System.out.println(Calculate.foil(1,1,1,1,"n"));
		//part 2
		System.out.println(Calculate.isDivisibleBy(2,2));
		System.out.println(Calculate.absValue(-2));
		System.out.println(Calculate.max(3.4, 4.5, 5.6));
		System.out.println(Calculate.min(5, 7));
		System.out.println(Calculate.round2(5.333333));
	}
}
