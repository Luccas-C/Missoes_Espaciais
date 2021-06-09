import java.awt.GridLayout;

import javax.swing.JCheckBox;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class PainelComponentes extends JPanel {

	private static final long serialVersionUID = 1L;
	
	private PainelInstituicao institucao = new PainelInstituicao();
	private JCheckBox lancamento = new JCheckBox("Lançamento do Drone Iniciado");
	
	public PainelComponentes() {
		setLayout(new GridLayout(4,1));
		init();
	}

	private void init() {
		add(institucao);		
		add(lancamento);			
	}

	public PainelInstituicao getInstituicao() {
		return institucao;
	}

	public JCheckBox getLancamento() {
		return lancamento;
	}
	
}