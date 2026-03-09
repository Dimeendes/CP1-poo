package br.com.fiapride.model;

 public class Veiculos {

    private String individuo;
    private String placa;
    private double gasolina;
    
    public String getIndividuo() {
    	return this.individuo;
    }

    private void setIndividuo(String individuo) {
    	this.individuo = individuo;
    }
    
    public String getPlaca() {
    	return this.placa;
    }
    
    private void setPlaca(String placa) {
    	this.placa = placa;
    }
    
    public double getGasolina() {
    	return this.gasolina;
    }
    
    private void setGasolina(double combustivel) {
    	if(combustivel >= 0 && combustivel <100) {
    		this.gasolina += combustivel;
    	}else {
    		System.out.println("Erro: o valor da gasolina não pode ser negativo nem maior que 100! Definindo valor como 0");
    		this.gasolina = 0;
    	}
    }
    
    public Veiculos(String individuo, String pl, double gas) {
    	this.setIndividuo(individuo);
    	this.setPlaca(pl);
    	this.setGasolina(gas);
    }
    
    
    public void adicionarGasolina(double combustivel) {
	    if(combustivel <= 0 || (this.gasolina + combustivel) > 100) {
	    	System.out.println("Erro: o valor deve ser maior que 0 e nao se pode ultrapassar do limite total de 100 litros!");
	    	return;
	    }else {
		    this.gasolina += combustivel;
		    System.out.println("Recarga feita com sucesso! Gasolina atual: " + this.gasolina + "L");
	    }}

    public void diminuirGasolina(double combustivel) {
    	if(combustivel > gasolina || combustivel <= 0) {
    	 System.out.println("Atenção: o veiculo esta gastando mais combustivel do que possui ou o gasto esta sendo um numero negativo!");
    	 return;
}
    	this.gasolina -= combustivel;
    	System.out.println("Seu veiculo gastou " + combustivel + "L de Gasolina. Gasolina atual: " + this.gasolina + "L");
 }
    
    }
