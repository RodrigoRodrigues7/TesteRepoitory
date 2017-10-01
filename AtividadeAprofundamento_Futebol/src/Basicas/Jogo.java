package Basicas;

import java.util.Calendar;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import org.hibernate.annotations.Cascade;
import org.hibernate.annotations.CascadeType;
import org.hibernate.annotations.Fetch;
import org.hibernate.annotations.FetchMode;

@Entity
public class Jogo {

    @Id
    private int id;
    
    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "FK_ID_TimeCasa",
            insertable = true, updatable = true)
    @Fetch(FetchMode.JOIN)
    @Cascade(CascadeType.SAVE_UPDATE)
    private Time timeCasa;
    
//    private Time timeVisitante;
    private String nomeCampo;

    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "FK_ID_Juiz",
            insertable = true, updatable = true)
    @Fetch(FetchMode.JOIN)
    @Cascade(CascadeType.SAVE_UPDATE)
    private Juiz juizJogo;

    private int placar1;
    private int placar2;
    private Calendar dataJogo;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Time getTimeCasa() {
        return timeCasa;
    }

    public void setTimeCasa(Time timeCasa) {
        this.timeCasa = timeCasa;
    }

//    public Time getTimeVisitante() {
//        return timeVisitante;
//    }
//
//    public void setTimeVisitante(Time timeVisitante) {
//        this.timeVisitante = timeVisitante;
//    }

    public String getNomeCampo() {
        return nomeCampo;
    }

    public void setNomeCampo(String nomeCampo) {
        this.nomeCampo = nomeCampo;
    }

    public Juiz getJuiz() {
        return juizJogo;
    }

    public void setJuiz(Juiz jz) {
        this.juizJogo = jz;
    }

    public int getPlacar1() {
        return placar1;
    }

    public void setPlacar1(int placar1) {
        this.placar1 = placar1;
    }

    public int getPlacar2() {
        return placar2;
    }

    public void setPlacar2(int placar2) {
        this.placar2 = placar2;
    }

    public Calendar getDataJogo() {
        return dataJogo;
    }

    public void setDataJogo(Calendar dataJogo) {
        this.dataJogo = dataJogo;
    }

}
