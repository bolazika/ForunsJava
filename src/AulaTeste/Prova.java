package AulaTeste;

public class Prova {
	
	public static double[] dobrarAlturas ( double[] valor) {
		double[] dobrar = new double[valor.length];
		for (int posicao = 0; posicao < dobrar.length; posicao++) {
			dobrar[posicao] = valor[posicao] * 2;
		}
		return dobrar;
	}
	
	public static double somarAlturas(double [] valor) {
		Double somar = 0.00;
		for (int posicao = 0; posicao < valor.length; posicao++) {
			somar+=valor[posicao];
		}
		return somar;
		
	}

}
