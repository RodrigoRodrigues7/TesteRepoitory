package Dados_Futebol;

import Basicas.Jogador;
import Basicas.Tecnico;
import Basicas.Time;
import java.util.Calendar;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class Dados_Futebol {

    public static void main(String[] args) {

        EntityManagerFactory emf = Persistence.createEntityManagerFactory("hibernate_futebol");
        EntityManager em = emf.createEntityManager();

        EntityTransaction et = em.getTransaction();
        et.begin();

//        Time tm1 = new Time();
//        tm1.setNome("São Paulo");
//        tm1.setEstado("SP");
//        tm1.setPontos(15);
        
        Time tm2 = new Time();
        tm2.setNome("Cruzeiro");
        tm2.setEstado("MG");
        tm2.setPontos(32);
        
        Time tm3 = new Time();
        tm3.setNome("São Paulo");
        tm3.setEstado("SP");
        tm3.setPontos(15);
        
//        Tecnico tec = new Tecnico();
//        tec.setNome("Paulo Autuori");
//        Calendar dataTec = Calendar.getInstance();
//        dataTec.set(1958, 03, 10);
//        tec.setDataNasc(dataTec);
//        tec.setSalario(102000.00);
//        tec.setNomeTime(tm1);
//
//        Jogador jog = new Jogador();
//        jog.setNome("Rogério Ceni");
//        jog.setIdTime(tm1);
//        Calendar dataJog = Calendar.getInstance();
//        dataJog.set(1979, 10, 28);
//        jog.setDataNasc(dataJog);
//        jog.setSalario(88000.00);
//        jog.setNumCamisa(01);
//        jog.setEstaEmCampo(true);
//        jog.setTemCardAmarelo(false);
//        jog.setQtdCardAmarelo(2);
//        jog.setQtdCardVermelho(1);

//        em.persist(jog);
//        em.persist(tec);
//        em.persist(tm1);
        et.commit();

        em.close();
        emf.close();

    }

}
