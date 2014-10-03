import java.lang.Math;

public class Circulo {

 

	public double area (double radio)   {

		double result = 0;
		result = 3.1416 * Math.pow(radio,2);
        	return result;
		
	} 

	public double circunferencia (double radio)   {

		double result = 0;
		result = 6.28 * radio;
        	return result;
		
	} 
	
}
