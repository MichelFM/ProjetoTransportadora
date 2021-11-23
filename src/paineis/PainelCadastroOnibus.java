package paineis;

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

import classe.Veiculos;
import classe.Onibus;
import classe.Veiculos;

public class PainelCadastroOnibus extends JPanel {
	
	private JLabel jlOnibus, jlFabricante, jlAnoFabricacao, jlAnoModelo, jlModelo, jlCor, jlNumeroPoltronas, jlChassi, jlPlaca, jlCombustivel;
	private JTextField jtfFabricante, jtfAnoModelo, jtfAnoFabricacao, jtfModelo, jtfCor, jtfChassi, jtfPlaca;
	private JRadioButton jrbPoltronas42, jrbPoltronas32, jrbPoltronas25 , jrbGasolina, jrbAlcool, jrbFlex, jrbDiesel;
	private ButtonGroup bgNumeroPoltronas, bgCombustivel;
	private JButton jbCadastrar;
	private List<Veiculos> veiculos;
	
	public PainelCadastroOnibus(List<Veiculos> veiculos) {
		super();
		setSize(400,400);
		setLayout(null);
		setBackground(Color.yellow);
		this.veiculos = veiculos;
		iniciarEventos();
		criarEventos();
	}

	private void iniciarEventos() {
		jlOnibus = new JLabel("Ônibus");
		jlFabricante = new JLabel("Fabricante");
		jlAnoModelo = new JLabel("Ano/Modelo");
		jlAnoFabricacao = new JLabel("Ano/Fabricação");
		jlModelo = new JLabel("Modelo");
		jlCor = new JLabel("Cor");
		jlChassi = new JLabel("Chassi");
		jlPlaca = new JLabel("Placa");
		jlNumeroPoltronas = new JLabel("Nº de Poltronas");
		jlCombustivel = new JLabel("Combustível");

		jtfFabricante = new JTextField();
		jtfAnoFabricacao = new JTextField();
		jtfAnoModelo = new JTextField();
		jtfModelo = new JTextField();
		jtfCor = new JTextField();
		jtfChassi = new JTextField();
		jtfPlaca = new JTextField();


		jrbPoltronas42 = new JRadioButton("42", true);
		jrbPoltronas42.setOpaque(false);
		jrbPoltronas32 = new JRadioButton("32");
		jrbPoltronas32.setOpaque(false);
		jrbPoltronas25 = new JRadioButton("25");
		jrbPoltronas25.setOpaque(false);

		jrbGasolina = new JRadioButton("Gasolina", true);
		jrbGasolina.setOpaque(false);
		jrbAlcool = new JRadioButton("Alcool");
		jrbAlcool.setOpaque(false);
		jrbFlex = new JRadioButton("Flex");
		jrbFlex.setOpaque(false);
		jrbDiesel = new JRadioButton("Diesel");
		jrbDiesel.setOpaque(false);

		jbCadastrar = new JButton("Cadastrar");

		bgNumeroPoltronas = new ButtonGroup();
		bgCombustivel = new ButtonGroup();

		add(jlFabricante);
		add(jlAnoModelo);
		add(jlOnibus);
		add(jlAnoFabricacao);
		add(jlModelo);
		add(jlCor);
		add(jlChassi);
		add(jlPlaca);
		add(jlNumeroPoltronas);
		add(jlCombustivel);

		add(jtfAnoFabricacao);
		add(jtfAnoModelo);
		add(jtfFabricante);
		add(jtfModelo);
		add(jtfCor);
		add(jtfChassi);
		add(jtfPlaca);

		add(jrbPoltronas42);
		add(jrbPoltronas32);
		add(jrbPoltronas25);
		add(jrbGasolina);
		add(jrbFlex);
		add(jrbAlcool);
		add(jrbDiesel);
		add(jbCadastrar);


		bgNumeroPoltronas.add(jrbPoltronas42);
		bgNumeroPoltronas.add(jrbPoltronas32);
		bgNumeroPoltronas.add(jrbPoltronas25);

		bgCombustivel.add(jrbAlcool);
		bgCombustivel.add(jrbGasolina);
		bgCombustivel.add(jrbFlex);
		bgCombustivel.add(jrbDiesel);


		jlOnibus.setBounds(170, 10, 60, 20);

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

		jlNumeroPoltronas.setBounds(280, 90, 110, 20);
		jrbPoltronas42.setBounds(280, 110, 100, 20);
		jrbPoltronas32.setBounds(280, 130, 100, 20);
		jrbPoltronas25.setBounds(280, 150, 100, 20);

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
						int quantidadePoltronas = 0;
						
						fabricante = jtfFabricante.getText();
						anoModelo = jtfAnoModelo.getText();
						anoFabricacao = jtfAnoFabricacao.getText();
						modelo = jtfModelo.getText();
						cor = jtfCor.getText();
						numeroChassi = jtfChassi.getText();
						placa = jtfPlaca.getText();
						tipoVeiculo = jlOnibus.getText();
					     
						if(jrbPoltronas42.isSelected()) quantidadePoltronas = 42;
						if(jrbPoltronas32.isSelected()) quantidadePoltronas = 32;
						if(jrbPoltronas25.isSelected()) quantidadePoltronas = 25;
						
						if(jrbGasolina.isSelected()) tipoCombustivel = "Gasolina";
						if(jrbAlcool.isSelected()) tipoCombustivel = "Álcool";
						if(jrbFlex.isSelected()) tipoCombustivel = "Flex";
						if(jrbDiesel.isSelected()) tipoCombustivel = "Diesel";
						
						veiculos.add( new Onibus(placa, tipoCombustivel, fabricante, numeroChassi, cor, tipoVeiculo, modelo, anoFabricacao, anoModelo, quantidadePoltronas));
						
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
	