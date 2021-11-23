package classe;

public class Onibus extends Veiculos {
private int QuantidadePoltronas;

public Onibus(String placa, String tipoCombustivel, String fabricante, String numeroChassis, String cor,
		String tipoVeiculo, String modelo, String anoFabricacao, String anoModelo, int quantidadePoltronas) {
	super(placa, tipoCombustivel, fabricante, numeroChassis, cor, tipoVeiculo, modelo, anoFabricacao, anoModelo);
	QuantidadePoltronas = quantidadePoltronas;
}
public String mostrarDados() {
	return "\nTipo Veiculo: "+ this.tipoVeiculo +
			"\nQuantidade de Poltronas: "+ this.QuantidadePoltronas +
			"\nFabricante: "+ this.fabricante +
			"\nPlaca: "+this.placa +
			"\nCombustivel: "+ this.tipoCombustivel +
			"\nAno Fabricação: "+ this.anoFabricacao +
			"\nModelo: " + this.modelo +
			"\nAno do Modelo: "+ this.anoModelo +
			"\n Cor: "+ this.cor +
			"\nNúmero de chassi: "+this.numeroChassis +
			"\n___________________________________________\n";
	}
}
