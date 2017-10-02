package Dados_Futebol;

import Basicas.Jogador;
import Basicas.Juiz;
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

        Tecnico tec1 = new Tecnico();
        tec1.setNome("Paulo Autuori");
        Calendar dataTec1 = Calendar.getInstance();
        dataTec1.set(1958, 02, 10);
        tec1.setDataNasc(dataTec1);
        tec1.setSalario(102000.00);
//
        Tecnico tec2 = new Tecnico();
        tec2.setNome("Mano Menezes");
        Calendar dataTec2 = Calendar.getInstance();
        dataTec2.set(1957, 03, 21);
        tec2.setDataNasc(dataTec2);
        tec2.setSalario(90000.00);
//        
        Tecnico tec3 = new Tecnico();
        tec3.setNome("Marcelo Oliveira");
        Calendar dataTec3 = Calendar.getInstance();
        dataTec3.set(1958, 02, 10);
        tec3.setDataNasc(dataTec3);
        tec3.setSalario(82500.00);
//        
//================================================================
//
        Time tm1 = new Time();
        tm1.setNome("São Paulo");
        tm1.setEstado("SP");
        tm1.setPontos(15);
        tm1.setTecnico(tec1);
        tec1.setTime(tm1);
//
        Time tm2 = new Time();
        tm2.setNome("Cruzeiro");
        tm2.setEstado("MG");
        tm2.setPontos(32);
        tm2.setTecnico(tec3);
        tec3.setTime(tm2);
//       
        Time tm3 = new Time();
        tm3.setNome("Flamengo");
        tm3.setEstado("RJ");
        tm3.setPontos(30);
        tm3.setTecnico(tec3);
        tec3.setTime(tm3);
//        
//================================================================
//
        Jogador jog1 = new Jogador();
        jog1.setNome("Rogério Ceni");
        jog1.setIdTime(tm1);
        Calendar dataJog1 = Calendar.getInstance();
        dataJog1.set(1979, 9, 28);
        jog1.setDataNasc(dataJog1);
        jog1.setSalario(88000.00);
        jog1.setNumCamisa(01);
        jog1.setEstaEmCampo(true);
        jog1.setTemCardAmarelo(false);
        jog1.setQtdCardAmarelo(2);
        jog1.setQtdCardVermelho(1);
//        
        Jogador jog2 = new Jogador();
        jog2.setNome("Alex Silva");
        jog2.setIdTime(tm1);
        Calendar dataJog2 = Calendar.getInstance();
        dataJog2.set(1983, 0, 04);
        jog2.setDataNasc(dataJog2);
        jog2.setSalario(45000.00);
        jog2.setNumCamisa(02);
        jog2.setEstaEmCampo(true);
        jog2.setTemCardAmarelo(false);
        jog2.setQtdCardAmarelo(2);
        jog2.setQtdCardVermelho(1);
//                
        Jogador jog3 = new Jogador();
        jog3.setNome("Fabão");
        jog3.setIdTime(tm2);
        Calendar dataJog3 = Calendar.getInstance();
        dataJog3.set(1983, 0, 04);
        jog3.setDataNasc(dataJog3);
        jog3.setSalario(45000.00);
        jog3.setNumCamisa(03);
        jog3.setEstaEmCampo(true);
        jog3.setTemCardAmarelo(false);
        jog3.setQtdCardAmarelo(2);
        jog3.setQtdCardVermelho(1);
//                        
        Jogador jog4 = new Jogador();
        jog4.setNome("Edcarlos");
        jog4.setIdTime(tm2);
        Calendar dataJog4 = Calendar.getInstance();
        dataJog4.set(1983, 0, 04);
        jog4.setDataNasc(dataJog4);
        jog4.setSalario(45000.00);
        jog4.setNumCamisa(04);
        jog4.setEstaEmCampo(true);
        jog4.setTemCardAmarelo(false);
        jog4.setQtdCardAmarelo(2);
        jog4.setQtdCardVermelho(1);
//        
        Jogador jog5 = new Jogador();
        jog5.setNome("Souza");
        jog5.setIdTime(tm1);
        Calendar dataJog5 = Calendar.getInstance();
        dataJog5.set(1980, 8, 27);
        jog5.setDataNasc(dataJog5);
        jog5.setSalario(65000.00);
        jog5.setNumCamisa(15);
        jog5.setEstaEmCampo(true);
        jog5.setTemCardAmarelo(true);
        jog5.setQtdCardAmarelo(1);
        jog5.setQtdCardVermelho(1);
//        
        Jogador jog6 = new Jogador();
        jog6.setNome("Ilsinho");
        jog6.setIdTime(tm1);
        Calendar dataJog6 = Calendar.getInstance();
        dataJog6.set(1984, 11, 16);
        jog6.setDataNasc(dataJog6);
        jog6.setSalario(43860.90);
        jog6.setNumCamisa(06);
        jog6.setEstaEmCampo(false);
        jog6.setTemCardAmarelo(false);
        jog6.setQtdCardAmarelo(2);
        jog6.setQtdCardVermelho(0);

        Juiz ju1 = new Juiz();
        ju1.setNome("Armando Marques");
        Calendar dataJu1 = Calendar.getInstance();
        dataJu1.set(1930, 1, 6);
        ju1.setDataNasc(dataJu1);
        ju1.setSalario(24000.00);

        Juiz ju2 = new Juiz();
        ju2.setNome("Paulo Cesar Oliveira");
        Calendar dataJu2 = Calendar.getInstance();
        dataJu2.set(1973, 11, 16);
        ju2.setDataNasc(dataJu2);
        ju2.setSalario(35000.00);

//
//================================================================
//
        em.persist(jog1);
        em.persist(jog2);
        em.persist(jog3);
        em.persist(jog4);
        em.persist(jog5);
        em.persist(jog6);
//
        em.persist(ju1);
        em.persist(ju2);
//
        em.persist(tec1);
//        em.persist(tec2);
        em.persist(tec3);
//        
        em.persist(tm1);
        em.persist(tm2);
        em.persist(tm3);
        et.commit();

        em.close();
        emf.close();

    }

}
