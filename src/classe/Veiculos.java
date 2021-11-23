package classe;

import java.io.Serializable;

public class Veiculos implements Serializable {
	protected String placa;  
	protected String tipoCombustivel;
	protected String fabricante;
	protected String numeroChassis;
	protected String cor;
	protected String tipoVeiculo;
	protected String modelo;
	protected String anoFabricacao;
	protected String anoModelo;
	//construtor
	public Veiculos(String placa, String tipoCombustivel, String fabricante, String numeroChassis, String cor,
			String tipoVeiculo, String modelo, String anoFabricacao, String anoModelo) {
		super();
		this.placa = placa;
		this.tipoCombustivel = tipoCombustivel;
		this.fabricante = fabricante;
		this.numeroChassis = numeroChassis;
		this.cor = cor;
		this.tipoVeiculo = tipoVeiculo;
		this.modelo = modelo;
		this.anoFabricacao = anoFabricacao;
		this.anoModelo = anoModelo;
	}
	public String mostrarDados() {
		return null;
		
	}
	public String getPlaca() {
		return placa;
	}
}
