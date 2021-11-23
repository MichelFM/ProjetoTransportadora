package paineis;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.List;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;

import classe.Veiculos;

public class PainelDeletar extends JPanel {
private List<Veiculos> veiculos;
private JLabel jlIndice;
private JTextField  jtfIndice;
private JButton jbDeletar;



	public PainelDeletar(List<Veiculos> veiculos) {
		super();	
		setSize(400,400);
		setLayout(null);
		setBackground(Color.yellow);
		this.veiculos = veiculos;
		iniciarComponentes();
		criarEventos();
		
		
		
	}
	
   private void iniciarComponentes() {
   jlIndice = new JLabel("Indice");
   jtfIndice = new JTextField();
   jbDeletar = new JButton("Excluir");
   
   add(jlIndice);
   add(jtfIndice);
   add(jbDeletar);
   
	jlIndice.setBounds(40, 40, 160, 20);
	jtfIndice.setBounds(40, 60, 40, 20);
	jbDeletar.setBounds(40, 120, 100, 40);
	}


	private void criarEventos() {
	jbDeletar.addActionListener(new ActionListener() {
		
		@Override
		public void actionPerformed(ActionEvent e) {
			try {int indice = Integer.parseInt(jtfIndice.getText());
			int resposta = JOptionPane.showConfirmDialog(null, "Deseja Excluir o Veiculo?", "DELETAR",JOptionPane.YES_NO_OPTION );
			if(resposta == 0) {
				veiculos.remove(indice - 1);
				JOptionPane.showMessageDialog(null, "Veiculo Deletado com Sucesso");
			}
				
			} catch (NumberFormatException erro) {
				JOptionPane.showMessageDialog(null, "Use Apenas Numeros e preencha o campo!");
	
			} catch(IndexOutOfBoundsException erro2) {
				JOptionPane.showMessageDialog(null, "Indice Inexistente!");		
			}
		}
	});	
	}
}
