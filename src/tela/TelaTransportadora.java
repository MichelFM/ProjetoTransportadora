package tela;
import java.awt.Color;
import java.awt.Container;
import java.awt.Desktop.Action;
import java.awt.HeadlessException;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;
import javax.swing.KeyStroke;

import arquivo.LerEscreverArquivo;
import classe.Carro;
import classe.Veiculos;
import paineis.PainelCadastroBasculante;
import paineis.PainelCadastroBau;
import paineis.PainelCadastroCarreta;
import paineis.PainelCadastroCarro;
import paineis.PainelCadastroOnibus;
import paineis.PainelDeletar;
import paineis.PainelMostrarDados;
import paineis.PainelPesquisar;

public class TelaTransportadora extends JFrame {
	private Container contentPane;
	private JMenuBar jmbBarra;
	private JMenu jmArquivo , jmCadastro, jmSobre, jmCaminhao, jmExibir;
	private JMenuItem jmiSair , jmiCarro, jmiOnibus, jmiBasculante, jmiCarreta, jmiBau, jmiMostrarDados, jmiPesquisa, jmiDeletar;
	private List<Veiculos> veiculos = new ArrayList<>();
    LerEscreverArquivo arquivo = new LerEscreverArquivo();


	public TelaTransportadora(String title) throws HeadlessException {
		super(title);
		setSize(400, 400);
		getContentPane().setBackground(Color.blue);
		abrirArquivo();
		iniciarComponentes();
		criarEventos();
		setLocationRelativeTo(getContentPane());
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);

	}

	private void abrirArquivo() {
	if(!(arquivo.lerArquivo() == null)) {
		veiculos = arquivo.lerArquivo(); 
	}
		
	}

	private void iniciarComponentes() {

		contentPane = getContentPane();
		jmbBarra = new JMenuBar();
		setJMenuBar(jmbBarra);
		
		jmArquivo = new JMenu("Arquivo");
		jmArquivo.setMnemonic('A');
		jmCadastro = new JMenu("Cadastro");
		jmCadastro.setMnemonic('C');
		jmExibir = new JMenu("Exibir");
		jmExibir.setMnemonic('E');
		jmSobre = new JMenu("Sobre");
		jmSobre.setMnemonic('S');
		jmCaminhao = new JMenu("Caminhao");
		jmiPesquisa = new JMenuItem("Pesquisar");
		jmiDeletar = new JMenuItem("Excluir");
		jmiSair = new JMenuItem("Sair");
		jmiSair.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_S,ActionEvent.ALT_MASK));
		jmiCarro = new JMenuItem("Carro");
		jmiOnibus = new JMenuItem("Ônibus");
		jmiBasculante = new JMenuItem("Basculante");
		jmiBau = new JMenuItem("Báu");
		jmiCarreta = new JMenuItem("Carreta");
		jmiMostrarDados = new JMenuItem("Mostrar Dados");

		jmCadastro.add(jmiCarro);
		jmCadastro.add(jmiOnibus);
		jmCadastro.add(jmCaminhao);

		jmCaminhao.add(jmiBasculante);
		jmCaminhao.add(jmiBau);
		jmCaminhao.add(jmiCarreta);
		jmExibir.add(jmiMostrarDados);
		jmExibir.add(jmiPesquisa);
		jmExibir.add(jmiDeletar);

		jmbBarra.add(jmArquivo);
		jmbBarra.add(jmCadastro);
		jmbBarra.add(jmExibir);
		jmbBarra.add(jmSobre);

		jmArquivo.add(jmiSair);

	}

	private void criarEventos() {
		jmiSair.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				
				int resposta = JOptionPane.showConfirmDialog(null, "Deseja Salvar e sair do Formulário?");
				if(resposta == 0) {
					arquivo.escreverArquivos(veiculos);   
				}
                System.exit(0);
                
				
			}
		});

		jmiCarro.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				PainelCadastroCarro carro = new PainelCadastroCarro(veiculos);
                contentPane.removeAll();
                contentPane.add(carro);
                contentPane.validate();

			}
		});
		
		jmiMostrarDados.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
			 PainelMostrarDados dados = new PainelMostrarDados(veiculos);
			 contentPane.removeAll();
             contentPane.add(dados);
             contentPane.validate();
				
			}
		});
		jmiOnibus.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				PainelCadastroOnibus onibus = new PainelCadastroOnibus(veiculos);
				 contentPane.removeAll();
	             contentPane.add(onibus);
	             contentPane.validate();
				
			}
		});
	   jmiBasculante.addActionListener(new ActionListener() {
		
		@Override
		public void actionPerformed(ActionEvent e) {
			PainelCadastroBasculante basculante = new PainelCadastroBasculante(veiculos);
			contentPane.removeAll();
            contentPane.add(basculante);
            contentPane.validate();
			
		
			
		}
	});
	   jmiBau.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				PainelCadastroBau bau = new PainelCadastroBau(veiculos);
				contentPane.removeAll();
	            contentPane.add(bau);
	            contentPane.validate();
				
			
				
			}
		});
	   jmiCarreta.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				PainelCadastroCarreta carreta = new PainelCadastroCarreta(veiculos);
				contentPane.removeAll();
	            contentPane.add(carreta);
	            contentPane.validate();
				
			
				
			}
		});
	   jmiPesquisa.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				PainelPesquisar pesquisar = new PainelPesquisar(veiculos);
				contentPane.removeAll();
	            contentPane.add(pesquisar);
	            contentPane.validate();
				
			
				
			}
		});
	   jmiPesquisa.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				PainelPesquisar pesquisar = new PainelPesquisar(veiculos);
				contentPane.removeAll();
	            contentPane.add(pesquisar);
	            contentPane.validate();
				
			
				
			}
		}); jmiDeletar.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				PainelDeletar deletar = new PainelDeletar(veiculos);
				contentPane.removeAll();
	            contentPane.add(deletar);
	            contentPane.validate();
				
			
				
			}
		});
	   
	}
		
}
