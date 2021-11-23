package classe;

public class Carreta extends Caminhao {
private int quantidadeContainers;

public Carreta(String placa, String tipoCombustivel, String fabricante, String numeroChassis, String cor,
		String tipoVeiculo, String modelo, String anoFabricacao, String anoModelo, String tipoCaminhao,
		int quantidadeContainers) {
	super(placa, tipoCombustivel, fabricante, numeroChassis, cor, tipoVeiculo, modelo, anoFabricacao, anoModelo,
			tipoCaminhao);
	this.quantidadeContainers = quantidadeContainers;
}

public String mostrarDados() {
	return "\nTipo Veiculo: "+ this.tipoVeiculo +
			"\nTipo de Caminhão: "+ this.tipoCaminhao +
			"\nQuantidade de Containers" + this.quantidadeContainers+
			"\nFabricante: "+ this.fabricante +
			"\nPlaca: "+this.placa +
			"\nCombustivel: "+ this.tipoCombustivel +
			"\nAno Fabricação: "+ this.anoFabricacao +
			"\nModelo: " + this.modelo +
			"\nAno do Modelo: "+ this.anoModelo +
			"\n Cor: "+ this.cor +
			"\nNúmero de chassi: "+this.numeroChassis +
			"\n__________________________________________\n";
	}
}
