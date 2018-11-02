import java.util.Scanner;

public class TestCalculadora {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		CalculadoraMetodos numero = new CalculadoraMetodos(0,0,0); //constructor parametrizado con sus valores por defecto
		numero.setValorA();
		numero.setValorB(); //metodos para pedir al usuario los valores, llamados set pues se coportan como mutadores aunque no lo sean
		
		
		boolean salir = false; 
								//variable para salir del switch que actua de menu
		while(!salir){
				
			System.out.println ("Pulse 1 para sumar");
			System.out.println ("Pulse 2 para restar");
			System.out.println ("Pulse 3 para multiplicar");
			System.out.println ("Pulse 4 para dividir");
			System.out.println ("Pulse 5 para cambiar valores");
			System.out.println ("Pulse 6 para resolver la ecuacion ax+b=0 ");
			System.out.println ("Pulse 7 resolver la ecuacion ax^2+bx+c=0 ");
			System.out.println ("Pulse 8 para salir del la calculadora");
			
				
			int opcion = sc.nextInt();
				
		switch(opcion){
		
		case 1:
			System.out.println(numero.suma());
			break;
		case 2:
			System.out.println(numero.resta());
			break;
		case 3:
			System.out.println(numero.multiplicar());
			break;
		case 4:
			System.out.println(numero.division());
			break;
		case 5:
			numero.setValorA();
			numero.setValorB();
			break;
		case 6:
			
			numero.resolverEcuacionPrimerGrado(numero.getValorA(), numero.getValorB());
			break;
		case 7:
			numero.setValorC();
			numero.resolverEcuacionSegundoGrado(numero.getValorA(), numero.getValorB(), numero.getValorC());
			break;
		case 8:
			salir = true;
			break;
			
				}
		
			}
		sc.close();
		}

	}


