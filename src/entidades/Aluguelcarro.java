package entidades;

import java.util.Date;

public class Aluguelcarro {
private Date entrada;
private Date saida;
private Veiculo veiculo;
private Pagamento pagamento;

public Aluguelcarro(Date entrada, Date saida, Veiculo veiculo) {
	this.entrada = entrada;
	this.saida = saida;
	this.veiculo = veiculo;
}
public Date getEntrada() {
	return entrada;
}
public void setEntrada(Date entrada) {
	this.entrada = entrada;
}
public Date getSaida() {
	return saida;
}
public void setSaida(Date saida) {
	this.saida = saida;
}
public Veiculo getVeiculo() {
	return veiculo;
}
public void setVeiculo(Veiculo veiculo) {
	this.veiculo = veiculo;
}
public Pagamento getPagamento() {
	return pagamento;
}
public void setPagamento(Pagamento pagamento) {
	this.pagamento = pagamento;
}

}
