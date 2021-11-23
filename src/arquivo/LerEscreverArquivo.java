package arquivo;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.List;
import java.util.Random;

import javax.swing.JOptionPane;
import classe.Veiculos;

public class LerEscreverArquivo {

	public void escreverArquivos(List<Veiculos> veiculos) {
    FileOutputStream saida;
    
    try {
		saida = new FileOutputStream("Veiculos.bin");
		ObjectOutputStream objeto = new ObjectOutputStream(saida);
		objeto.writeObject(veiculos);
		objeto.close();
		JOptionPane.showMessageDialog(null, "Arquivo gravado com sucesso");
	} catch (FileNotFoundException e) {
		JOptionPane.showMessageDialog(null, "Arquivo não Encontrado", "Arquivo", JOptionPane.ERROR_MESSAGE);
		
	} catch (IOException e) {
		
		e.printStackTrace();
	}
    
	}
	public List<Veiculos> lerArquivo() {
	     List<Veiculos> veiculos = null;
	 try {
		FileInputStream entrada = new FileInputStream("Veiculos.bin");
		ObjectInputStream objeto = new ObjectInputStream(entrada);
		veiculos = (List<Veiculos>) objeto.readObject();
		objeto.close();
		
	} catch (FileNotFoundException e) {
		JOptionPane.showMessageDialog(null, "Arquivo não Encontrado", "Arquivo", JOptionPane.ERROR_MESSAGE);
		
	} catch (IOException e) {
		JOptionPane.showMessageDialog(null, "Arquivo Corrompido", "Arquivo", JOptionPane.ERROR_MESSAGE);
		
	} catch (ClassNotFoundException e) {
		JOptionPane.showMessageDialog(null, "Classe não encontrada", "Arquivo", JOptionPane.ERROR_MESSAGE);
	}
	return veiculos;
		
	}
}

