import java.util.Scanner;

public class CalculadoraMetodos {
	
	static Scanner sc = new Scanner(System.in);
	
	
	private double valorA;
	private double valorB;
	private double valorC;
	
	public CalculadoraMetodos(double a, double b, double c) {
		valorA = a;
		valorB = b;
		valorC = c;
		
	}
	
	public double getValorA() {
		return valorA;
	}
	
	
	public double getValorB() {
		return valorB;
	}
	
	public double getValorC() {
		return valorC;
	}
	
	public void setValorA() {
		System.out.println("Introduzca el valor del numero a: ");
		double _valor = sc.nextDouble();
		this.valorA=_valor;
	}
	
	public void setValorB() {
		System.out.println("Introduzca el valor del numero b: ");
		double _valor = sc.nextDouble();
		this.valorB=_valor;
	}
	
	public void setValorC() {
		System.out.println("Introduzca el valor del numero c para la ecuacion de segundo grado: ");
		double _valor = sc.nextDouble();
		this.valorC=_valor;
	}
	

	public double suma() {
		return valorA+valorB;
	}
	
	public double resta() {
		return valorA-valorB;
	}
	
	public double multiplicar() {
		return valorA*valorB;
	}
		
	public double division() {
		do {
			System.out.println("No se puede dividir entre 0, cambielo");
			setValorB();
		}while(valorB==0);

		return valorA/valorB;
		
	}
	
	public void resolverEcuacionPrimerGrado(double a, double b){
		if(a==0){
			System.out.println("La ecuacion no tiene solucion, cambie el valor de las variables");
			setValorA();
		}else{
		System.out.println("El resultado de la ecuacion: " + a + "x + " + b  +"=0 X es igual a: " + -b/a);
	}
}
	
	public void resolverEcuacionSegundoGrado(double a, double b, double c){
		
		if(a==0){
			System.out.println("el valor a es 0, asi que se realizara la ecuacion de primer grado si es posible");
			resolverEcuacionPrimerGrado(b,c);
		}else{
			
		
		System.out.println("Los resultados son: " + ((-b + Math.sqrt(Math.pow(b,2) - 4 * a * c) / 2*a)));
		System.out.println("Y: " + ((-b - Math.sqrt(Math.pow(b,2) - 4 * a * c ) / 2*a)));
	}
}

}
