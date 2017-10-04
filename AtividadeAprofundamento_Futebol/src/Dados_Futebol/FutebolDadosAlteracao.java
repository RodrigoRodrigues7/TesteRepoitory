package Dados_Futebol;

import Basicas.Jogador;
import Basicas.Jogo;
import Basicas.Time;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class FutebolDadosAlteracao {

    public static void main(String[] args) {

        EntityManagerFactory emf = Persistence.createEntityManagerFactory("hibernate_futebol");
        EntityManager em = emf.createEntityManager();

        EntityTransaction et = em.getTransaction();
        et.begin();

        Jogador ilsinho = em.find(Jogador.class, new Integer(6));
        ilsinho.setNome("Ilsinho Cavalcanti");
        ilsinho.setSalario(89000.00);
        ilsinho.setTemCardAmarelo(true);
//
        Jogador alexSilva = em.find(Jogador.class, new Integer(2));
        alexSilva.setTime(em.getReference(Time.class, new Integer(3)));
//
        Jogador rogerioCeni = em.find(Jogador.class, new Integer(1));

//
        Time cruzeiro = em.find(Time.class, new Integer(2));
        Jogador edCarlos = em.find(Jogador.class, new Integer(4));
        Jogador fabao = em.find(Jogador.class, new Integer(3));

//        
//===============================================================
//
        em.remove(rogerioCeni);
        em.remove(cruzeiro);
        em.remove(edCarlos);
        em.remove(fabao);

        em.persist(ilsinho);
        em.persist(alexSilva);

        et.commit();

        em.close();
        emf.close();

    }

}
