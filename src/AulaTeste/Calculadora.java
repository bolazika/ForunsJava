package AulaTeste;

public class Calculadora {
	public static int somar(int valor1, int valor2) {
		 valor1 = 100;
		 valor2 = 200;
		int total = valor1+valor2;
		return total;
	}

	public static double percentual(double todo, double parte) {
		return (parte/todo)*100;
	}

	public static int ContarCaracteres(String[] caracteres) {
		int totalDeCaracteres = 0;
		for (int posicao = 0; posicao < caracteres.length; posicao++) {
			totalDeCaracteres += caracteres[posicao].length();
		}

		return totalDeCaracteres;
	}
   
}
