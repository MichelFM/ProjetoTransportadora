package classe;

public class Caminhao extends Veiculos {
protected String tipoCaminhao;

public Caminhao(String placa, String tipoCombustivel, String fabricante, String numeroChassis, String cor,
		String tipoVeiculo, String modelo, String anoFabricacao, String anoModelo, String tipoCaminhao) {
	super(placa, tipoCombustivel, fabricante, numeroChassis, cor, tipoVeiculo, modelo, anoFabricacao, anoModelo);
	this.tipoCaminhao = tipoCaminhao;
}


}
