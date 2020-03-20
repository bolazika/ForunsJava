package AulaTeste;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class TesteAula {

	@Test
	void testarSoma() {
		
		int valor1 = 100;
		int valor2 = 200;
		int total = valor1+valor2;
		
		assertEquals(300, total);
	}
	
	@Test
	void testarSomaCalculadora() {
		int total = Calculadora.somar(100, 200);
		
		assertEquals(300, total);
	}
	
	@Test
	void dobrarValorDoArray() {
		double[] alturas = {2.00, 1.50, 2.00, 1.50, 1.00, 0.75};
		double[] alturasDobradas = Prova.dobrarAlturas(alturas);
		double alturasSomadas = Prova.somarAlturas(alturasDobradas);
		
		
		assertEquals(17.50, alturasSomadas);
	}
	
	@Test
	void testarPercentualDoSalario() {
		double salario = 2000.0;
		double horasExtras = 100.00;
		double percentualDeHorasExtras = Calculadora.percentual(salario, horasExtras);
		assertEquals(5.00, percentualDeHorasExtras);
		
		double valorAtual = 200.00;
		double valorReajustado = 270.00;
		double percentualReajustado = Calculadora.percentual(valorAtual, valorReajustado);
		assertEquals(135.00, percentualReajustado);
	}
	
	@Test
	void testerTotalDeCaracteres() {
		//String teste = teste;
		//int tamanhoTeste = teste.length();
		
		
		String[] nomes = {"Ana", "Joana", "Mariana"};
		int totalDeCaracteresNosNomes = Calculadora.ContarCaracteres(nomes);
		assertEquals(15, totalDeCaracteresNosNomes);
		
		String[] paises = {"Brasil", "Canada", "Uruguai"};
		int totalDeCaracteresNosPaises = Calculadora.ContarCaracteres(paises);
		assertEquals(19, totalDeCaracteresNosPaises);
		
	
	}

}
