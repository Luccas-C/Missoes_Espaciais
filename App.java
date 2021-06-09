
import javax.swing.JFrame;
import javax.swing.JTabbedPane;

public class App extends JFrame {
	
	private static final long serialVersionUID = 1L;
	
	private PainelCadastro abaCadastro = new PainelCadastro();
	private PainelLista abaLista = new PainelLista();
	private JTabbedPane abas = new JTabbedPane();
	
	public static void main(String[] args) {
		new App().init();
	}

	private void init() {
		abas.add("Cadastro", abaCadastro);
		abas.add("Lista", abaLista);
		
		add(abas);
		
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setSize(800, 600);
		setVisible(true);
		
	}
}