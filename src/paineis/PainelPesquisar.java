package paineis;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.List;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.JTextField;

import classe.Veiculos;

public class PainelPesquisar extends JPanel {
private List<Veiculos> veiculos;
private JButton jbPesquisa;
private JLabel jlPlaca;
private JTextField jtfPlaca;
private JTextArea jtaMostrar;
 	public PainelPesquisar(List<Veiculos> veiculos) {
		super();
	 setSize(400,400);
	 setLayout(null);
	 this.veiculos = veiculos;
	 setBackground(Color.yellow);
	 iniciarComponentes();
	 criarEventos();
	}

	private void iniciarComponentes() {
		jbPesquisa = new JButton("Pesquisa");
		jlPlaca = new JLabel("Placa");
		jtfPlaca = new JTextField();
		jtaMostrar = new JTextArea();
		
		add(jbPesquisa);
		add(jlPlaca);
		add(jtfPlaca);
		add(jtaMostrar);
		
		jbPesquisa.setBounds(140, 20, 100, 20);
		jlPlaca.setBounds(140, 60, 100, 20);
		jtfPlaca.setBounds(140, 80, 100, 20);
		jtaMostrar.setBounds(20, 120, 345, 170);
		
		
		
	}

	private void criarEventos() {
		jbPesquisa.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
			     for (Veiculos veiculo: veiculos) {
			    	if(veiculo.getPlaca().equalsIgnoreCase(jtfPlaca.getText())) {
			    		jtaMostrar.append((veiculos.indexOf(veiculo)+1)+ "-" + veiculo.mostrarDados());
			    		jtaMostrar.setCaretPosition(0);
			    	}
			     }
				
			}
		});
		
	}

}
