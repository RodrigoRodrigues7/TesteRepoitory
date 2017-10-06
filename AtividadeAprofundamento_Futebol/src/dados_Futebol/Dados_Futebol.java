package dados_Futebol;

import java.util.Calendar;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import basicas.Campeonato;
import basicas.Jogador;
import basicas.Jogo;
import basicas.Juiz;
import basicas.Tecnico;
import basicas.Time;
import basicas.Time.Estado;

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
        tm1.setNome("SÃ£o Paulo");
        tm1.setEstado(Estado.SP);
        tm1.setPontos(15);
        tm1.setTecnico(tec1);
        tec1.setTime(tm1);
//      
        Time tm3 = new Time();
        tm3.setNome("Cruzeiro");
        tm3.setEstado(Estado.MG);
        tm3.setPontos(32);
        tm3.setTecnico(tec2);
        tec2.setTime(tm3);
//       
        Time tm2 = new Time();
        tm2.setNome("Flamengo");
        tm2.setEstado(Estado.RJ);
        tm2.setPontos(30);
        tm2.setTecnico(tec3);
        tec3.setTime(tm2);
//      
//================================================================
//
        Jogador jog1 = new Jogador();
        jog1.setNome("Rogério Ceni");
        jog1.setTime(tm1);
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
        jog2.setTime(tm1);
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
        jog3.setTime(tm3);
        Calendar dataJog3 = Calendar.getInstance();
        dataJog3.set(1982, 10, 22);
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
        jog4.setTime(tm3);
        Calendar dataJog4 = Calendar.getInstance();
        dataJog4.set(1984, 4, 16);
        jog4.setDataNasc(dataJog4);
        jog4.setSalario(45000.00);
        jog4.setNumCamisa(04);
        jog4.setEstaEmCampo(false);
        jog4.setTemCardAmarelo(false);
        jog4.setQtdCardAmarelo(2);
        jog4.setQtdCardVermelho(1);
//        
        Jogador jog5 = new Jogador();
        jog5.setNome("Souza");
        jog5.setTime(tm1);
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
        jog6.setTime(tm1);
        Calendar dataJog6 = Calendar.getInstance();
        dataJog6.set(1984, 11, 16);
        jog6.setDataNasc(dataJog6);
        jog6.setSalario(43860.90);
        jog6.setNumCamisa(06);
        jog6.setEstaEmCampo(false);
        jog6.setTemCardAmarelo(false);
        jog6.setQtdCardAmarelo(2);
        jog6.setQtdCardVermelho(0);

//
//================================================================
//
        Juiz ju1 = new Juiz();
        ju1.setNome("Armando Marques");
        Calendar dataJu1 = Calendar.getInstance();
        dataJu1.set(1930, 1, 6);
        ju1.setDataNasc(dataJu1);
        ju1.setSalario(24000.00);
//
        Juiz ju2 = new Juiz();;
        ju2.setNome("Paulo Cesar Oliveira");
        Calendar dataJu2 = Calendar.getInstance();
        dataJu2.set(1973, 11, 16);
        ju2.setDataNasc(dataJu2);
        ju2.setSalario(35000.00);
//
//================================================================
//
        Jogo jogo1 = new Jogo();
        jogo1.setNomeCampo("AAAAA");
        jogo1.setTimeCasa(tm1);
        jogo1.setTimeVisitante(tm3);
        jogo1.setPlacar1(2);
        jogo1.setPlacar2(1);
        Calendar dataJogo1 = Calendar.getInstance();
        dataJogo1.set(2013, 6, 13);
        jogo1.setDataJogo(dataJogo1);
        jogo1.setJuiz(ju2);
//
        Jogo jogo2 = new Jogo();
        jogo2.setNomeCampo("BBBBB");
        jogo2.setTimeCasa(tm3);
        jogo2.setTimeVisitante(tm1);
        Calendar dataJogo2 = Calendar.getInstance();
        dataJogo2.set(2013, 9, 10);
        jogo2.setDataJogo(dataJogo2);
        jogo2.setJuiz(ju1);
//
        Jogo jogo3 = new Jogo();
        jogo3.setNomeCampo("CCCCC");
        jogo3.setTimeCasa(tm2);
        jogo3.setTimeVisitante(tm3);
        jogo3.setPlacar1(1);
        jogo3.setPlacar2(1);
        Calendar dataJogo3 = Calendar.getInstance();
        dataJogo3.set(2013, 7, 14);
        jogo3.setDataJogo(dataJogo2);
        jogo3.setJuiz(ju2);
//
        Jogo jogo4 = new Jogo();
        jogo4.setNomeCampo("DDDDD");
        jogo4.setTimeCasa(tm1);
        jogo4.setTimeVisitante(tm2);
        Calendar dataJogo4 = Calendar.getInstance();
        dataJogo4.set(2013, 8, 19);
        jogo4.setDataJogo(dataJogo4);
        jogo4.setJuiz(ju1);
//
//================================================================
//

        Campeonato camp1 = new Campeonato();
        camp1.setNomeCamp("Campeonato Brasileiro");

        Calendar dataIniCamp1 = Calendar.getInstance();
        dataIniCamp1.set(2013, 5, 10);
        camp1.setDataInicio(dataIniCamp1);
        
        Calendar datafimCamp1 = Calendar.getInstance();
        datafimCamp1.set(2013, 11, 2);
        camp1.setDataFim(datafimCamp1);

        camp1.getTimes().add(tm1);
        camp1.getTimes().add(tm2);
        camp1.getTimes().add(tm3);
        
        camp1.setPrimeiroColocado(tm1);
        camp1.setSegundoColocado(tm3);
        camp1.setTerceiroColocado(tm2);
        
//        
        Campeonato camp2 = new Campeonato();
        camp2.setNomeCamp("Taça Glória de Goitá¡");

        Calendar dataIniCamp2 = Calendar.getInstance();
        dataIniCamp2.set(2013, 2, 2);
        camp2.setDataInicio(dataIniCamp2);
        
        Calendar datafimCamp2 = Calendar.getInstance();
        datafimCamp2.set(2013, 4, 1);
        camp2.setDataFim(datafimCamp2);

        camp2.getTimes().add(tm3);
        camp2.getTimes().add(tm2);
        
        camp2.setPrimeiroColocado(tm2);
        camp2.setSegundoColocado(tm3);

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
        em.persist(tec2);
        em.persist(tec3);
//        
        em.persist(tm1);
        em.persist(tm2);
        em.persist(tm3);
//             
        em.persist(jogo1);
        em.persist(jogo2);
        em.persist(jogo3);
        em.persist(jogo4);
//        
        em.persist(camp1);
        em.persist(camp2);
//        
        et.commit();

        em.close();
        emf.close();

    }

}
