
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.TypedQuery;

public class Dao {
	
	EntityManager manager = JPAUtil.getManager();
	
	public void create(Drone drone) {
		
		manager.getTransaction().begin();
		manager.persist(drone);
		manager.getTransaction().commit();
		
		//manager.close();
	}
	
	public List<Drone> query() {
		
		TypedQuery<Drone> query =  manager.createQuery("SELECT d FROM Drone d" , Drone.class);
		return   query.getResultList();
	}
	
	public void apagar(Drone drone) {
		manager.getTransaction().begin();
		manager.remove(drone);
		manager.getTransaction().commit();
		}
		
	public void apagar(Long id) {
			apagar(buscarPorId(id));
	}
	
	public Drone buscarPorId(Long id) {
		return manager.find(Drone.class, id);
	}
	
	public void edit(Drone drone) {
		Drone antigo = manager.find(Drone.class,drone.getId());
		manager.getTransaction().begin();
		antigo.setTitulo(drone.getTitulo());
		antigo.setMainJob(drone.getMainJob());
		antigo.setDronesName(drone.getDronesName());
		antigo.setInstituicao(drone.getInstituicao());
		antigo.setLancamento(drone.isLancamento());
		manager.getTransaction().commit();
		
	}
	
}
