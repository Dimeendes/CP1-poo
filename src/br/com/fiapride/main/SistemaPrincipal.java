package br.com.fiapride.main;

import br.com.fiapride.model.Veiculos;

 public class SistemaPrincipal {
    
	 public static void main(String[] args) {

		 System.out.println("<---Iniciando sistema de cadastro--->");
		 
		 //cadastro 1 (Teste com combustível negativo)
		 System.out.println("\nVeículo 1: ");
		 Veiculos Veiculo1 = new Veiculos("Carlos", "ABC-1234", 30);
		 System.out.println("Adicionando gasolina: ");
		 Veiculo1.adicionarGasolina(50);
		 System.out.println("Gastando gasolina: ");
		 Veiculo1.diminuirGasolina(100);
		 
		 //cadastro 2 (Teste com combustível negativo)
		 System.out.println("\nVeículo 2: ");
		 Veiculos Veiculo2 = new Veiculos("Joao", "DEF-5678", -10);
		 System.out.println("Adicionando gasolina: ");
		 Veiculo2.adicionarGasolina(43.4);
		 System.out.println("Gastando gasolina: ");
		 Veiculo2.diminuirGasolina(15.7);
		 
		 //cadastro 3 (Teste com adicionar excedendo 100 negativo)
		 System.out.println("\nVeículo 3: ");
		 Veiculos Veiculo3 = new Veiculos("Livia", "GHI-5348", 70);
		 System.out.println("Adicionando gasolina: ");
		 Veiculo3.adicionarGasolina(40);
		 System.out.println("Gastando gasolina: ");
		 Veiculo3.diminuirGasolina(27.8);
		 
		 System.out.println("\n<---Dados do cadastro--->");
		
		 System.out.println("Veiculo 1: \nDono: " + Veiculo1.getIndividuo() + " | Placa: " + Veiculo1.getPlaca() + " | Gasolina: " + Veiculo1.getGasolina() + "L");
		 System.out.println("\nVeiculo 2: \nDono: " + Veiculo2.getIndividuo() + " | Placa: " + Veiculo2.getPlaca() + " | Gasolina: " + Veiculo2.getGasolina() + "L");
		 System.out.println("\nVeiculo 3: \nDono: " + Veiculo3.getIndividuo() + " | Placa: " + Veiculo3.getPlaca() + " | Gasolina: " + Veiculo3.getGasolina() + "L");
		 
		 //teste de encapsulamento(remova o comentario para testar)
		 //Veiculo1.individuo = "Rosa";
		 //Veiculo1.placa = "GHQ-1278";
		 //Veiculo1.gasolina = 23;
	 }
 }
