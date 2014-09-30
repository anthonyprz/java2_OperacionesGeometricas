import java.lang.Math;

public class Rectangulo {

//	public double altura;
//	public double base;
//	public double perimetro;
//	public double area;

  	   
	    private double base = 0;
	    private double altura = 0; 
	

 	public void setAltura (double alt) {
		this.altura = alt;
	}
	
	public void setBase (double bas) {
		this.base = bas;
	}

	public double getAltura ()   {

		
        	return this.altura;
		
	} 

	public double getBase ()   {

		
        	return this.base;
		
	}
	public double perimetro ()   {


		double perimetro = 2*(base+altura); 
        	return perimetro;

		} 
	public double area ()   {

		double area = base*altura;
        	return area;
		
	} 
	
}
