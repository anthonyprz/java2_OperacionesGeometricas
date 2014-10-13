import java.util.Scanner;
import com.zubiri.geometria.Circulo;
import com.zubiri.geometria.Rectangulo;

//CLASSPATH=:/home/zubiri/ProyectosJava; export CLASSPATH

public class OperacionesGeometricas {

	public static void main(String[] args) {

		char opcion;
		
		Scanner sc = new Scanner(System.in);
		System.out.print("\nque quieres realizar?:circulo / rectangulo / salir");
		opcion = sc.next();
// la opcion eqalsinorecase sirve para comparar las dos ociones si elijes una entonces if si no else
	
		
	while (opcion != salir)
	
	

	if (opcion == "circulo") 
//antes	if (opcion.equalsIgnoreCase("circulo")) {
    
		double radio, result; 
		Circulo circulo = new Circulo();
		 System.out.print("\ningresa el radio: ");
      		 radio = sc.nextDouble();

/*llamar constructor
	   Circulo circulo = new Circulo (radio);
*/		
/*sobra*/	circulo.setRadio(radio);

	  result =  circulo.circunferencia();
	  System.out.println("La circunferencia es: " + result); 
			
	  result =  circulo.area();
	  System.out.println("El area es: " + result); 
	
}

		else (opcion == "rectangulo")
//antes	else (opcion.equalsIgnoreCase("rectangulo"))  {
		double base, altura;
/* antes */	Rectangulo operaciones = new Rectangulo();


		System.out.print("\ningresar la altura del rectángulo: ");
		altura = sc.nextDouble();
		
		
		
		System.out.print("\ningresar la base del rectángulo: ");
		base = sc.nextDouble();

/* llamar constructor		
		Rectangulo operaciones = new Rectangulo(base, altura);
*/
/*sobra	por que la le estas llamando con el constructor*/	operaciones.setBase(base);
/*sobra							*/ 	operaciones.setAltura(altura);


		System.out.println("\neste es el perimetro de un rectangulo: " + operaciones.perimetro());

		System.out.println("\neste es el area de un rectangulo: " + operaciones.area());



}
}
}


