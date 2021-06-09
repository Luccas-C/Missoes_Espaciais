import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class BotaoListener implements ActionListener {

	private PainelCadastro painelCadastro;
	private Dao dao = new Dao();

	public BotaoListener(PainelCadastro painelCadastro) {
		this.painelCadastro = painelCadastro;
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		Drone drone = new Drone();
		drone.setTitulo(painelCadastro.getCampos().getTitulo().getText());
		drone.setMainJob(painelCadastro.getCampos().getMainJob().getText());
		drone.setDronesName(String.valueOf(painelCadastro.getCampos().getDroneName().getSelectedItem()));
		drone.setInstituicao(painelCadastro.getComponentes().getInstituicao().getGrupo().getSelection().getActionCommand());
		drone.setLancamento(painelCadastro.getComponentes().getLancamento().isSelected());
		
		System.out.println(drone);	
		
		dao.create(drone);

	}

}
