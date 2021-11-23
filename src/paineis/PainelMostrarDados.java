package paineis;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Iterator;
import java.util.List;

import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;

import classe.Carro;
import classe.Onibus;
import classe.Veiculos;
import classe.Basculante;
import classe.Bau;
import classe.Carreta;

public class PainelMostrarDados extends JPanel {

	private JButton jbCarro, jbOnibus, jbCaminhao;
	private JCheckBox jckBau, jckBasculante, jckCarreta;
	private JTextArea jtaMostrar;
	private JScrollPane jsMostrar;
	private List<Veiculos> veiculos = null;

	public PainelMostrarDados(List<Veiculos> veiculos) {
		super();
		setSize(400,400);
		setLayout(null);
		setBackground(Color.yellow);
		this.veiculos = veiculos;
		iniciarEventos();
		criarEventos();
	}

	private void iniciarEventos() {
		jbCarro = new JButton("Carro");
		jbOnibus = new JButton("Onibus");
		jbCaminhao = new JButton("Caminhão");
		jckBasculante = new JCheckBox("Basculante");
		jckBasculante.setOpaque(false);
		jckBau = new JCheckBox("Bau");
		jckBau.setOpaque(false);
		jckCarreta = new JCheckBox("Carreta");
		jckCarreta.setOpaque(false);
		jtaMostrar = new JTextArea();
		jsMostrar = new JScrollPane(jtaMostrar);

		add(jbCarro);
		add(jbOnibus);
		add(jbCaminhao);
		add(jckBasculante);
		add(jckBau);
		add(jckCarreta);
		add(jsMostrar);

		jbCarro.setBounds(20, 20, 100, 20);
		jbOnibus.setBounds(20, 60, 100, 20);
		jbCaminhao.setBounds(220, 20, 100, 20);
		jckBau.setBounds(220, 40, 100, 20);
		jckCarreta.setBounds(220, 60, 100, 20);
		jckBasculante.setBounds(220, 80, 100, 20);
		jsMostrar.setBounds(30, 120, 320, 200);

	}

	private void criarEventos() {
		jbCarro.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				jtaMostrar.setText("***********************CADASTROS**********************");

				for (Veiculos veiculo : veiculos) {
					if(veiculo instanceof Carro) {
						jtaMostrar.append(veiculo.mostrarDados());	
					}
				}
			}  

		});
        jbOnibus.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				jtaMostrar.setText("***********************CADASTROS**********************");

				for (Veiculos veiculo : veiculos) {
					if(veiculo instanceof Onibus) {
						jtaMostrar.append(veiculo.mostrarDados());	
				
					}
				}
			}
      });
        jbCaminhao.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				jtaMostrar.setText("***********************CADASTROS**********************");
				jtaMostrar.setCaretPosition(0);
				
				for (Veiculos veiculo: veiculos) {
					if(jckBasculante.isSelected()){
						if (veiculo instanceof Basculante) {
							jtaMostrar.append(veiculo.mostrarDados());
						}
					}
					if(jckBau.isSelected()){
						if (veiculo instanceof Bau) {
							jtaMostrar.append(veiculo.mostrarDados());
						}
					}
					if(jckCarreta.isSelected()){
						if (veiculo instanceof Carreta) {
							jtaMostrar.append(veiculo.mostrarDados());
						}
					}
				
				
				}
				
				
			}
		});
	}
	
}

