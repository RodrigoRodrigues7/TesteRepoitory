package dados_Futebol;

//import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
//import javax.persistence.Query;

//import basicas.Jogador;

public class ConsultasJPQL {

	public static void main(String[] args) {

		EntityManagerFactory emf = Persistence.createEntityManagerFactory("hibernate_futebol");
		EntityManager em = emf.createEntityManager();

		EntityTransaction et = em.getTransaction();
		et.begin();

		// String consulta1 = "SELECT j FROM Jogador j WHERE j.numCamisa =
		// :numero AND FK_ID_Time = :timeJogador";
		// Query q1 = em.createQuery(consulta1, Jogador.class);
		// q1.setParameter("numero", 1);
		// q1.setParameter("timeJogador", 1);
		//
		// Jogador jogador = (Jogador) q1.getSingleResult();
		// System.out.println(jogador.toString());

		// =====================================================================================================

		// String consulta2 = "SELECT j FROM Jogador j WHERE j.qtdCardAmarelo >
		// 1 AND FK_ID_Time = :timeJogador";
		// Query q2 = em.createQuery(consulta2, Jogador.class);
		// q2.setParameter("timeJogador", 1);
		//
		// List<Jogador> listaJogadores = q2.getResultList();
		// for (Jogador jogadorAmarelo : listaJogadores) {
		// System.out.println(jogadorAmarelo.toString());
		// }

		// =====================================================================================================

		em.getTransaction().commit();
		em.close();
		emf.close();

	}

}
