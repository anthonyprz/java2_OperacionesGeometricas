import java.util.Scanner;

import com.zubiri.geometria.Circulo;
import com.zubiri.geometria.Rectangulo;
// http://www.sc.ehu.es/sbweb/fisica/cursoJava/fundamentos/clase1/string.html

public class OperacionesGeometricas {

	public static void main(String[] args) {

		string opcion;
		

		Scanner sc = new Scanner(System.in);
		System.out.print("\nIngresa la opcion rectangulo o circulo");
		opcion = sc.next();
// la opcion eqalsinorecase sirve para comparar las dos ociones si elijes una entonces if si no else
	if (opcion.eqaulsInoreCase(circulo)==1) {
    
		double radio, result; 
		Circulo circulo = new Circulo();
		 System.out.print("\ningresa el radio: ");
      		 radio = sc.nextDouble();
		
		 circulo.setRadio(radio);

	  result =  circulo.circunferencia();
	  System.out.println("La circunferencia es: " + result); 
			
	  result =  circulo.area();
	  System.out.println("El area es: " + result); 
	
}
else  {
		double base, altura;
		Rectangulo operaciones = new Rectangulo();


		System.out.print("\ningresar la altura del rectángulo: ");
		altura = sc.nextDouble();
		
		
		
		System.out.print("\ningresar la base del rectángulo: ");
		base = sc.nextDouble();

		operaciones.setBase(base);
		operaciones.setAltura(altura);


		System.out.println("\neste es el perimetro de un rectangulo: " + operaciones.perimetro());

		System.out.println("\neste es el area de un rectangulo: " + operaciones.area());



}




 
	}
}


