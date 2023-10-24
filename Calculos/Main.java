package Calculos;

public class Main {

	public static void main(String[] args) {
		
		Adicionar calculo = new Adicionar();
		Subtrair sub = new Subtrair();
		Calcular cal = new Calcular();
		Expo exp = new Expo();
		
		
		System.out.println(calculo.somar(1, 1));
		System.out.println("");
		
		System.out.println(sub.sub(4, 2));
		System.out.println("");
		
		System.out.println(cal.mult(2, 2));
		System.out.println("");
		
		System.out.println(cal.div(2, 2));
		System.out.println("");
		
		System.out.println(exp.exp(2, 2));
		System.out.println("");
		
		
	}

}
