package entidades;

public class Pagamento {
private Double basicopagamento;
private Double taxa;
public Pagamento() {
	
}
public Pagamento(double basicopagamento, double taxa) {
	this.basicopagamento = basicopagamento;
	this.taxa = taxa;
}
public double getBasicopagamento() {
	return basicopagamento;
}
public void setBasicopagamento(double basicopagamento) {
	this.basicopagamento = basicopagamento;
}
public double getTaxa() {
	return taxa;
}
public void setTaxa(double taxa) {
	this.taxa = taxa;
}
public double getTotalPagamento() {
	return getBasicopagamento()+getTaxa();
}
}
