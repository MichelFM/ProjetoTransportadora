package paineis;

import java.awt.Button;
import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.List;

import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JTextField;

import classe.Carro;
import classe.Veiculos;

public class PainelCadastroCarro extends JPanel {
	private JLabel jlCarro, jlFabricante, jlAnoFabricacao, jlAnoModelo, jlModelo, jlCor, jlNumeroLugares, jlChassi, jlPlaca, jlCombustivel;
	private JTextField jtfFabricante, jtfAnoModelo, jtfAnoFabricacao, jtfModelo, jtfCor, jtfChassi, jtfPlaca;
	private JRadioButton jrbGrande, jrbMedio, jrbPequeno , jrbGasolina, jrbAlcool, jrbFlex, jrbDiesel;
	private ButtonGroup bgNumeroLugares, bgCombustivel;
	private JButton jbCadastrar;
	private List<Veiculos> veiculos;

	public PainelCadastroCarro(List<Veiculos> veiculos) {
		super();

		setSize(400,400);
		setLayout(null);
		setBackground(Color.yellow);
		this.veiculos = veiculos;
		iniciarEventos();
		criarEventos();
	}

	private void iniciarEventos() {
		jlCarro = new JLabel("Carro");
		jlFabricante = new JLabel("Fabricante");
		jlAnoModelo = new JLabel("Ano/Modelo");
		jlAnoFabricacao = new JLabel("Ano/Fabricação");
		jlModelo = new JLabel("Modelo");
		jlCor = new JLabel("Cor");
		jlChassi = new JLabel("Chassi");
		jlPlaca = new JLabel("Placa");
		jlNumeroLugares = new JLabel("Nº Lugares");
		jlCombustivel = new JLabel("Combustível");

		jtfFabricante = new JTextField();
		jtfAnoFabricacao = new JTextField();
		jtfAnoModelo = new JTextField();
		jtfModelo = new JTextField();
		jtfCor = new JTextField();
		jtfChassi = new JTextField();
		jtfPlaca = new JTextField();


		jrbGrande = new JRadioButton("7", true);
		jrbGrande.setOpaque(false);
		jrbMedio = new JRadioButton("5");
		jrbMedio.setOpaque(false);
		jrbPequeno = new JRadioButton("4");
		jrbPequeno.setOpaque(false);

		jrbGasolina = new JRadioButton("Gasolina", true);
		jrbGasolina.setOpaque(false);
		jrbAlcool = new JRadioButton("Alcool");
		jrbAlcool.setOpaque(false);
		jrbFlex = new JRadioButton("Flex");
		jrbFlex.setOpaque(false);
		jrbDiesel = new JRadioButton("Diesel");
		jrbDiesel.setOpaque(false);

		jbCadastrar = new JButton("Cadastrar");

		bgNumeroLugares = new ButtonGroup();
		bgCombustivel = new ButtonGroup();

		add(jlFabricante);
		add(jlAnoModelo);
		add(jlCarro);
		add(jlAnoFabricacao);
		add(jlModelo);
		add(jlCor);
		add(jlChassi);
		add(jlPlaca);
		add(jlNumeroLugares);
		add(jlCombustivel);

		add(jtfAnoFabricacao);
		add(jtfAnoModelo);
		add(jtfFabricante);
		add(jtfModelo);
		add(jtfCor);
		add(jtfChassi);
		add(jtfPlaca);

		add(jrbGrande);
		add(jrbMedio);
		add(jrbPequeno);
		add(jrbGasolina);
		add(jrbFlex);
		add(jrbAlcool);
		add(jrbDiesel);
		add(jbCadastrar);


		bgNumeroLugares.add(jrbGrande);
		bgNumeroLugares.add(jrbMedio);
		bgNumeroLugares.add(jrbPequeno);

		bgCombustivel.add(jrbAlcool);
		bgCombustivel.add(jrbGasolina);
		bgCombustivel.add(jrbFlex);
		bgCombustivel.add(jrbDiesel);


		jlCarro.setBounds(170, 10, 60, 20);

		jlFabricante.setBounds(20, 40, 100, 20);
		jtfFabricante.setBounds(20, 60, 100, 20);

		jlAnoModelo.setBounds(170, 40, 100, 20);
		jtfAnoModelo.setBounds(180, 60, 50, 20);

		jlAnoFabricacao.setBounds(280, 40, 100,20);
		jtfAnoFabricacao.setBounds(290, 60, 50, 20);

		jlModelo.setBounds(20, 90, 100, 20);
		jtfModelo.setBounds(20,110, 100, 20);

		jlCor.setBounds(150, 90, 50 , 20);
		jtfCor.setBounds(150, 110, 100 , 20);

		jlNumeroLugares.setBounds(280, 90, 110, 20);
		jrbGrande.setBounds(280, 110, 100, 20);
		jrbMedio.setBounds(280, 130, 100, 20);
		jrbPequeno.setBounds(280, 150, 100, 20);

		jlChassi.setBounds(20, 130, 100, 20);
		jtfChassi.setBounds(20, 150, 100, 20);

		jlPlaca.setBounds(150, 130, 100, 20);
		jtfPlaca.setBounds(150, 150, 100, 20);

		jlCombustivel.setBounds(20, 190, 100, 20);
		jrbGasolina.setBounds(20, 210 , 100, 20);
		jrbFlex.setBounds(20, 230 , 100, 20);
		jrbAlcool.setBounds(120, 210 , 100, 20);	
		jrbDiesel.setBounds(120, 230 , 100, 20);

		jbCadastrar.setBounds(250, 210, 100, 40);



	}

	private void criarEventos() {
		jbCadastrar.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				if (!jtfFabricante.getText().isBlank() && 
					!jtfAnoModelo.getText().isBlank() && 
					!jtfAnoFabricacao.getText().isBlank() && 
					!jtfModelo.getText().isBlank() &&
					!jtfCor.getText().isBlank() &&
					!jtfChassi.getText().isBlank() &&
					!jtfPlaca.getText().isBlank()) {
					
					String fabricante, anoModelo, anoFabricacao, modelo, cor,  numeroChassi, tipoVeiculo, tipoCombustivel = null, placa;
					int quantidadeLugares = 0;
					
					fabricante = jtfFabricante.getText();
					anoModelo = jtfAnoModelo.getText();
					anoFabricacao = jtfAnoFabricacao.getText();
					modelo = jtfModelo.getText();
					cor = jtfCor.getText();
					numeroChassi = jtfChassi.getText();
					placa = jtfPlaca.getText();
					tipoVeiculo = jlCarro.getText();
				     
					if(jrbGrande.isSelected()) quantidadeLugares = 7;
					if(jrbMedio.isSelected()) quantidadeLugares = 5;
					if(jrbPequeno.isSelected()) quantidadeLugares = 4;
					
					if(jrbGasolina.isSelected()) tipoCombustivel = "Gasolina";
					if(jrbAlcool.isSelected()) tipoCombustivel = "Álcool";
					if(jrbFlex.isSelected()) tipoCombustivel = "Flex";
					if(jrbDiesel.isSelected()) tipoCombustivel = "Diesel";
					
					veiculos.add( new Carro(placa, tipoCombustivel, fabricante, numeroChassi, cor, tipoVeiculo, modelo, anoFabricacao, anoModelo, quantidadeLugares));
					
					jtfFabricante.setText("");
					jtfAnoModelo.setText("");
					jtfAnoFabricacao.setText("");
					jtfModelo.setText("");
					jtfCor.setText("");
					jtfChassi.setText("");
					jtfPlaca.setText("");
					

				} else {
					
					JOptionPane.showMessageDialog(null, "Preencha todos os campos", "Transportadora", JOptionPane.ERROR_MESSAGE);
					

				}

			}
		});


	}

}
