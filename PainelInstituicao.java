import java.awt.GridLayout;

import javax.swing.ButtonGroup;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JRadioButton;

public class PainelInstituicao extends JPanel {

	private static final long serialVersionUID = 1L;
	
	private JRadioButton nasa = new JRadioButton("NASA");
	private JRadioButton spacex = new JRadioButton("SpaceX");
	private JRadioButton fiap = new JRadioButton("FIAP");
	private ButtonGroup grupo = new ButtonGroup();
	
	public PainelInstituicao() {
		setLayout(new GridLayout(4,1));
		init();
	}

	private void init() {
		add(new JLabel("Instituição do Lançamento"));
		
		getGrupo().add(nasa);
		getGrupo().add(spacex);
		getGrupo().add(fiap);
		
		add(nasa);
		add(spacex);
		add(fiap);
		
		nasa.setActionCommand("NASA");
		spacex.setActionCommand("SpaceX");
		fiap.setActionCommand("FIAP");
	}

	public ButtonGroup getGrupo() {
		return grupo;
	}
	

}