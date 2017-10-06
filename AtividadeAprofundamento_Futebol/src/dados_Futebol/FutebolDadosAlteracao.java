package dados_Futebol;

import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import basicas.Jogador;
import basicas.Jogo;
import basicas.Time;

public class FutebolDadosAlteracao {

    public static void main(String[] args) {

        EntityManagerFactory emf = Persistence.createEntityManagerFactory("hibernate_futebol");
        EntityManager em = emf.createEntityManager();

        EntityTransaction et = em.getTransaction();
        et.begin();
//        
//=================== PRIMEIRO(Jogo São Paulo e Flamengo) ======================
//
        Jogo jogo4 = em.find(Jogo.class, new Integer(4));
        jogo4.setPlacar1(3);
        jogo4.setPlacar2(2);
        jogo4.getTimeCasa().setPontos(18);
//        
//================= SEGUNDO(Alterar Dados do Jogador Ilsinho) ==================
//
        Jogador ilsinho = em.find(Jogador.class, new Integer(6));
        ilsinho.setNome("Ilsinho Cavalcanti");
        ilsinho.setSalario(89000.00);
        ilsinho.setTemCardAmarelo(true);
//        
//=============== TERCEIRO(Alterar o Time do Jogador Alex Silva) ===============
//
        Jogador alexSilva = em.find(Jogador.class, new Integer(2));
        alexSilva.setTime(em.getReference(Time.class, new Integer(3)));
//        
//================= QUARTO(Excluir o Jogador Rogério Ceni) =====================
//
        Jogador rogerioCeni = em.find(Jogador.class, new Integer(1));
//        
//================ QUINTO(Excluir Time Cruzeiro, Jogadores e Tecnico)===========
//
        Time cruzeiro = em.find(Time.class, new Integer(2));
//        
//===============================================================
//
        em.persist(jogo4);//°1
        em.persist(ilsinho);//°2
        em.persist(alexSilva);//°3

        em.remove(rogerioCeni);//°4
        em.remove(cruzeiro);//°5
//
        et.commit();

        em.close();
        emf.close();

    }

}
