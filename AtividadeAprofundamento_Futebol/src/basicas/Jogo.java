package basicas;

import java.util.Calendar;
import java.util.Objects;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import org.hibernate.annotations.Cascade;
import org.hibernate.annotations.CascadeType;
import org.hibernate.annotations.Fetch;
import org.hibernate.annotations.FetchMode;

import basicas.Jogo;
import basicas.Juiz;
import basicas.Time;

@Entity
public class Jogo {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "FK_ID_TimeCasa",
            insertable = true, updatable = true)
    @Fetch(FetchMode.JOIN)
    @Cascade(CascadeType.SAVE_UPDATE)
    private Time timeCasa;

    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "FK_ID_TimeVisitante",
            insertable = true, updatable = true)
    @Fetch(FetchMode.JOIN)
    @Cascade(CascadeType.SAVE_UPDATE)
    private Time timeVisitante;

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

    public void setTimeCasa(Time timeCa) {
        this.timeCasa = timeCa;
    }

    public Time getTimeVisitante() {
        return timeVisitante;
    }

    public void setTimeVisitante(Time timeVi) {
        this.timeVisitante = timeVi;
    }

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

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 73 * hash + Objects.hashCode(this.timeCasa);
        hash = 73 * hash + Objects.hashCode(this.timeVisitante);
        hash = 73 * hash + Objects.hashCode(this.dataJogo);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Jogo other = (Jogo) obj;
        if (!Objects.equals(this.timeCasa, other.timeCasa)) {
            return false;
        }
        if (!Objects.equals(this.timeVisitante, other.timeVisitante)) {
            return false;
        }
        if (!Objects.equals(this.dataJogo, other.dataJogo)) {
            return false;
        }
        return true;
    }

}
