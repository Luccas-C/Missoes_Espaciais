import javax.swing.ImageIcon;
import javax.swing.JLabel;

public class Poster extends JLabel{

	private static final long serialVersionUID = 1L;
	
	private ImageIcon imagem = new ImageIcon("src/imagens/gif.gif");
	
	public Poster() {
		setIcon(imagem);
	}

}