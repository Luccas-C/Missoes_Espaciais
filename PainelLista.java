import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.List;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

public class PainelLista extends JPanel implements ActionListener{

	private static final long serialVersionUID = 1L;
	private DefaultTableModel modelo = new DefaultTableModel();
	private JButton carregar = new JButton("carregar");
	private JButton apagar = new JButton("apagar");
	private JButton editar = new JButton("editar");
	private JTable tabela = new JTable(modelo); 
	private JLabel lista = new JLabel("Lista de Drone");
	
	public PainelLista() {
		init();
	}

	private void init() {
		add(lista);
		
		modelo.addColumn("ID");
		modelo.addColumn("Titulo");
		modelo.addColumn("Objetivo da Missão");
		modelo.addColumn("Nome do Drone");
		modelo.addColumn("Instituição");
		modelo.addColumn("Já Lançado");
		
		carregarDados();
		
		add(new JScrollPane(tabela));
		
		JPanel botoes = new JPanel();
		botoes.add(apagar);
		botoes.add(carregar);
		botoes.add(editar);
		
		add(botoes, BorderLayout.SOUTH);
		
		carregar.addActionListener(this);
		apagar.addActionListener(this);
		editar.addActionListener(this);
		
	}
	
	public void carregarDados() {
		modelo.setNumRows(0);
		
		Dao dao = new Dao();
		List<Drone> lista = dao.query();
		
		for (Drone drone : lista) {
			String[] linha = { 
				drone.getId()+"",
				drone.getTitulo(),
				drone.getMainJob(),
				drone.getDronesName(),
				drone.getInstituicao(),
				drone.isLancamento()+""
			};
			modelo.addRow(linha);
		}	
	}
	
	private void apagar() {
		Dao dao = new Dao();
		int linha = tabela.getSelectedRow();
		String id = tabela.getValueAt(linha, 0).toString();
		Drone drone = dao.buscarPorId(Long.valueOf(id));
		int resposta = JOptionPane.showConfirmDialog(this, "Tem certeza que quer apagar a missao selecionada?");
		//dao.apagarPeloId(Long.valueOf(id));
		if (resposta == JOptionPane.YES_OPTION) {
			dao.apagar(drone);
			carregarDados();
		}
	}
	
	private void editar() {
		Dao dao = new Dao();
		int linha = tabela.getSelectedRow();
		String id = tabela.getValueAt(linha, 0).toString();
		String titulo = tabela.getValueAt(linha, 1).toString();
		String mainJob = tabela.getValueAt(linha, 2).toString();
		String droneName = tabela.getValueAt(linha, 3).toString();
		String instituicao = tabela.getValueAt(linha, 4).toString();
		String lancamento = tabela.getValueAt(linha, 5).toString();
		
		boolean foiLancado = (lancamento == "true")? true : false;
		
		Drone drone = new Drone(Long.valueOf(id) ,titulo, mainJob, droneName, instituicao, foiLancado);
		dao.edit(drone);
		//carregarDados();
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		if (e.getSource() == carregar) carregarDados();		
		if (e.getSource() == apagar) apagar();
		if (e.getSource() == editar) editar();
	}
}