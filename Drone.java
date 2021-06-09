
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Drone {

	@Id @GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	private String titulo;
	private String mainJob;
	private String dronesName;
	private String instituicao;
	private boolean lancamento;


	public Long getId() {
		return id;
	}


	public void setId(Long id) {
		this.id = id;
	}


	public String getTitulo() {
		return titulo;
	}


	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}


	public String getMainJob() {
		return mainJob;
	}


	public void setMainJob(String mainJob) {
		this.mainJob = mainJob;
	}


	public String getDronesName() {
		return dronesName;
	}


	public void setDronesName(String dronesName) {
		this.dronesName = dronesName;
	}


	public String getInstituicao() {
		return instituicao;
	}


	public void setInstituicao(String instituicao) {
		this.instituicao = instituicao;
	}


	public boolean isLancamento() {
		return lancamento;
	}


	public void setLancamento(boolean lancamento) {
		this.lancamento = lancamento;
	}


	@Override
	public String toString() {
		return "Filme [titulo=" + titulo + 
				", mainJob=" + mainJob + 
				", dronesName=" + dronesName + 
				", instituicao=" + instituicao + 
				", lancamento=" + lancamento + "]";
	}

	public Drone(Long id, String titulo, String mainJob, String dronesName, String instituicao, boolean lancamento) {
		super();
		this.id = id;
		this.titulo = titulo;
		this.dronesName = dronesName;
		this.mainJob = mainJob;
		this.instituicao = instituicao;
		this.lancamento = lancamento;
	}

	public Drone() {
		super();
	}
	
	


}