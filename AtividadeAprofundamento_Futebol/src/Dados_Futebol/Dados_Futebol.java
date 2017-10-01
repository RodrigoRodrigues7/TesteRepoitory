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

//        Tecnico tec1 = new Tecnico();
//        tec1.setNome("Paulo Autuori");
//        Calendar dataTec1 = Calendar.getInstance();
//        dataTec1.set(1958, 02, 10);
//        tec1.setDataNasc(dataTec1);
//        tec1.setSalario(102000.00);
//
        Tecnico tec2 = new Tecnico();
        tec2.setNome("Mano Menezes");
        Calendar dataTec2 = Calendar.getInstance();
        dataTec2.set(1957, 03, 21);
        tec2.setDataNasc(dataTec2);
        tec2.setSalario(90000.00);

        Tecnico tec3 = new Tecnico();
        tec3.setNome("Marcelo Oliveira");
        Calendar dataTec3 = Calendar.getInstance();
        dataTec3.set(1958, 02, 10);
        tec3.setDataNasc(dataTec3);
        tec3.setSalario(82500.00);

//        Time tm1 = new Time();
//        tm1.setNome("São Paulo");
//        tm1.setEstado("SP");
//        tm1.setPontos(15);
//        tm1.setTecnico(tec1);
//        tec1.setTime(tm1);
//
        Time tm2 = new Time();
        tm2.setNome("Cruzeiro");
        tm2.setEstado("MG");
        tm2.setPontos(32);
        tm2.setTecnico(tec2);
        tec2.setTime(tm2);

//       
        Time tm3 = new Time();
        tm3.setNome("Flamengo");
        tm3.setEstado("RJ");
        tm3.setPontos(30);
        tm2.setTecnico(tec3);
        tec3.setTime(tm3);
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
//
//=====================================================
//
//        em.persist(jog);
//        em.persist(tec1);
        em.persist(tec2);
        em.persist(tec3);

//        em.persist(tm1);
        em.persist(tm2);
        em.persist(tm3);
        et.commit();

        em.close();
        emf.close();

    }

}
