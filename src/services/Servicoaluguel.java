package services;

import entidades.Aluguelcarro;
import entidades.Pagamento;

public class Servicoaluguel {
private Double precopordia;
private Double precoporhora;
private Taxaservico taxa;
public Servicoaluguel() {
	
}
public Servicoaluguel(Double precopordia, Double precoporhora, Taxaservico taxa) {
	this.precopordia = precopordia;
	this.precoporhora = precoporhora;
	this.taxa = taxa;
}
public void processoPagamento(Aluguelcarro aluguelcarro) {
	long t1 = aluguelcarro.getEntrada().getTime();
	long t2 = aluguelcarro.getSaida().getTime();
	double hours = (double)(t2-t1)/1000/60/60;
	double basicopagamento;
	if(hours<=12.0) {
		basicopagamento = Math.ceil(hours)* precoporhora;
	}
	else {
		basicopagamento = Math.ceil(hours/24)*precopordia;
	}
	double tax = taxa.tax(basicopagamento);
	aluguelcarro.setPagamento(new Pagamento(basicopagamento, tax));
	
}
}
