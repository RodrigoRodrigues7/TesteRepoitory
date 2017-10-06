package basicas;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import org.hibernate.annotations.Cascade;
import org.hibernate.annotations.CascadeType;

import basicas.Jogador;
import basicas.Jogo;
import basicas.Tecnico;
import basicas.Time;

@Entity
public class Time {

    @Id
    @GeneratedValue(strategy = GenerationType.TABLE)
    private int id;
    private String nome;
    
    @Enumerated(EnumType.STRING)
    private Estado estado;
    private int pontos;

    @OneToMany(mappedBy = "time")
    @Cascade(CascadeType.ALL)
    private List<Jogador> jogadores = new ArrayList<>();

    @OneToOne
    @JoinColumn(name = "FK_ID_Tecnico")
    @Cascade(CascadeType.ALL)
    private Tecnico tecnico;

    @OneToMany(mappedBy = "timeCasa")
    @Cascade(CascadeType.ALL)
    private List<Jogo> listaTimeCasa;

    @OneToMany(mappedBy = "timeVisitante")
    @Cascade(CascadeType.ALL)
    private List<Jogo> listTimeVisitante;

    @ManyToMany
    @JoinTable(name = "Time_Campeonato",
            joinColumns = @JoinColumn(name = "ID_Time"),
            inverseJoinColumns = @JoinColumn(name = "ID_Campeonato"))
    private List<Campeonato> listaCamp = new ArrayList<>();

    public enum Estado {
    	AC, AL, AP, AM, BA, CE, DF, ES, GO, MA, MT, MS, MG, PA, PB, PR, PE, PI, RJ, RN, RS, RO, RR, SC, SP, SE, TO
    }
    
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Estado getEstado() {
        return estado;
    }

    public void setEstado(Estado uf) {
        this.estado = uf;
    }

    public int getPontos() {
        return pontos;
    }

    public void setPontos(int pontos) {
        this.pontos = pontos;
    }

    public List<Jogador> getJogadores() {
        return jogadores;
    }

    public void setJogadores(ArrayList<Jogador> jogadores) {
        this.jogadores = jogadores;
    }

    public Tecnico getTecnico() {
        return tecnico;
    }

    public void setTecnico(Tecnico tecnico) {
        this.tecnico = tecnico;
    }

    public List<Jogo> getListaTimeCasa() {
        return listaTimeCasa;
    }

    public void setListaTimeCasa(List<Jogo> listaTimeCasa) {
        this.listaTimeCasa = listaTimeCasa;
    }

    public List<Jogo> getListTimeVisitante() {
        return listTimeVisitante;
    }

    public void setListTimeVisitante(List<Jogo> listTimeVisitante) {
        this.listTimeVisitante = listTimeVisitante;
    }

    public List<Campeonato> getListaCamp() {
        return listaCamp;
    }

    public void setListaCamp(List<Campeonato> listaCamp) {
        this.listaCamp = listaCamp;
    }

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 97 * hash + Objects.hashCode(this.nome);
        hash = 97 * hash + Objects.hashCode(this.estado);
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
        final Time other = (Time) obj;
        if (!Objects.equals(this.nome, other.nome)) {
            return false;
        }
        if (!Objects.equals(this.estado, other.estado)) {
            return false;
        }
        return true;
    }

}
