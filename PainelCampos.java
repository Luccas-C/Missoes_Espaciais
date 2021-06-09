import java.awt.GridLayout;

import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;

public class PainelCampos extends JPanel {

	private static final long serialVersionUID = 1L;
	
	private JTextField titulo = new JTextField();
	private JTextArea mainJob = new JTextArea();
	private String[] dronesName = {"Ingenuity", "DragonFly", "Fiap Drone"};
	private JComboBox<String> droneName = new JComboBox<String>(dronesName);
	
	public PainelCampos() {
		setLayout(new GridLayout(6, 1));
		setBorder(new EmptyBorder(20, 15, 20, 10));
		init();
	}

	private void init() {
		add(new JLabel("Título"));
		add(getTitulo());
		add(new JLabel("Main Job"));
		add(getMainJob());
		add(new JLabel("Nome Do Drone"));
		add(getDroneName());
	}

	public JTextField getTitulo() {
		return titulo;
	}

	public JTextArea getMainJob() {
		return mainJob;
	}

	public JComboBox<String> getDroneName() {
		return droneName;
	}	
	

}