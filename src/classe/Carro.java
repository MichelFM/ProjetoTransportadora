package classe;

public class Carro extends Veiculos {
private int quantidadeLugares;
//construtor

public Carro(String placa, String tipoCombustivel, String fabricante, String numeroChassis, String cor,
		String tipoVeiculo, String modelo, String anoFabricacao, String anoModelo, int quantidadeLugares) {
	super(placa, tipoCombustivel, fabricante, numeroChassis, cor, tipoVeiculo, modelo, anoFabricacao, anoModelo);
	this.quantidadeLugares = quantidadeLugares;
}
public String mostrarDados() {
	return "\nTipo Veiculo: "+ this.tipoVeiculo +
			"\nFabricante: "+ this.fabricante +
			"\nPlaca: "+this.placa +
			"\nCombustivel: "+ this.tipoCombustivel +
			"\nAno Fabricação: "+ this.anoFabricacao +
			"\nModelo: " + this.modelo +
			"\nAno do Modelo: "+ this.anoModelo +
			"\n Cor: "+ this.cor +
			"\nQuantidade de Lugares: " + this.quantidadeLugares+
			"\nNúmero de chassi: "+this.numeroChassis +
			"\n____________________________________________\n";
	}

}
