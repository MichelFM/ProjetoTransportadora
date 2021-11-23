package classe;

public class Basculante extends Caminhao {

	public Basculante(String placa, String tipoCombustivel, String fabricante, String numeroChassis, String cor,
			String tipoVeiculo, String modelo, String anoFabricacao, String anoModelo, String tipoCaminhao) {
		super(placa, tipoCombustivel, fabricante, numeroChassis, cor, tipoVeiculo, modelo, anoFabricacao, anoModelo,
				tipoCaminhao);
	
	}
	public String mostrarDados() {
		return "\nTipo Veiculo: "+ this.tipoVeiculo +
				"\nTipo de Caminhão: "+ this.tipoCaminhao +
				"\nFabricante: "+ this.fabricante +
				"\nPlaca: "+this.placa +
				"\nCombustivel: "+ this.tipoCombustivel +
				"\nAno Fabricação: "+ this.anoFabricacao +
				"\nModelo: " + this.modelo +
				"\nAno do Modelo: "+ this.anoModelo +
				"\n Cor: "+ this.cor +
				"\nNúmero de chassi: "+this.numeroChassis +
				"\n__________________________________\n";
		}
}
