//This class contains methods that do the calculations to determines the shape of a quadratic function.
//@author JasonJi
//version 10/5/2018

public class Quadratic {
	public static String quadrDescriber (double a, double b, double c) {
		double discriminant = Calculate.discriminant(a,b,c);
		String opens;
		if (a>0) {
			opens =  "Up" ;
		}
		else {
			opens =  "Down";
		}
		double symmetryLine = -b/2*a;
		double vertexX = symmetryLine;
		double vertexY = a*symmetryLine*symmetryLine+b*symmetryLine+c;
		double yIntercept = c;
		String xIntercept = Calculate.quadForm(a, b, c);
		return "Opens:" + opens +"\n" + "Axis of Symmetry:" + symmetryLine + "\n" + "Vertex:(" + vertexX + ", " + vertexY + ")" + "\n" + "x-intercept(s):" + xIntercept + "\n" + "y-intercept:" + yIntercept;
		

		
	}
}