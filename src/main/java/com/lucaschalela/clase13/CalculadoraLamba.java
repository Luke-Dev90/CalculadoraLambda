package com.lucaschalela.clase13;

import java.util.Scanner;

public class CalculadoraLamba {
	
	static  Scanner parametro;
	static  String operacion;
	static  double a , b ;
	static String respuesta;
	public static void main(String[] args) {
		
		parametro = new Scanner(System.in);
		
		System.out.println("Seleccione una operación matematica");
		
		operacion = parametro.nextLine();
		
		if(operacion.equals("/")) 
		{
			System.out.println("Ingrese un valor para el dividendo > 0");
			a = parametro.nextDouble();	
			while(a <=0)
			{
				System.out.println("recuerde que el N° tiene que ser mayor a 0");
				a = parametro.nextDouble();	
			}
		}
		else 
		{
			System.out.println("Ingrese un valor para A");
			a = parametro.nextDouble();
		}
		System.out.println("Ingrese un valor para B");
		b = parametro.nextDouble();
		
		calcular(operacion,a,b);
		 
	}
	
	public static void calcular(String x, double z, double y) {
		switch (operacion) {
		case "sumar":
		case "suma":
		case "+":
			Calculadora S = (uno, dos) -> uno + dos;
			System.out.println(S.operacion(a, b));
			break;
		case "restar":
		case "resta":
		case "-":
			S = (uno, dos) -> uno - dos;
			System.out.println(S.operacion(a, b));
			break;
		case "multiplicar":
		case "multiplica:":
		case "*":
			S = (uno, dos) -> uno * dos;
			System.out.println(S.operacion(a, b));
			break;
		case "dividir":
		case "dividi":
		case "/":
			S = (uno, dos) -> uno / dos;
			System.out.println(S.operacion(a, b));
			break;
 		default:
 			System.out.println("Usted no ingreso ningun tipo de operacion");
 			System.out.println(" elija entre + , - ,  * , /");
 			System.out.println("Calculadora simple usando expresiones lambda");
 			
			break;
			
		}
	}
}
	

