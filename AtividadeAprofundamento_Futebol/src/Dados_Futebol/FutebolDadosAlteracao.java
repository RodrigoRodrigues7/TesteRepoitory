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
        
        /*
        Jogador ilsinho = em.find(Jogador.class, new Integer(6));
        ilsinho.setNome("Ilsinho Cavalcanti");
        ilsinho.setSalario(89000.00);
        ilsinho.setTemCardAmarelo(true);
        */
        
        Jogador alexSilva = em.find(Jogador.class, new Integer(2));
        
        
        //em.persist(ilsinho);
        em.persist(alexSilva);
        
        et.commit();

        em.close();
        emf.close();

    }

}
