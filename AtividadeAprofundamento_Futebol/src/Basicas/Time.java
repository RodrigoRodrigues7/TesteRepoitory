package Basicas;

import java.util.List;
import java.util.Objects;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import org.hibernate.annotations.Cascade;
import org.hibernate.annotations.CascadeType;

@Entity
public class Time {

    @Id
    private int id;
    private String nome;
    private String estado;
    private int pontos;
    
    @OneToMany(mappedBy="time")
    @Cascade(CascadeType.ALL)
    private List<Jogador> jogadores;
    
    @OneToOne
    @Cascade(CascadeType.ALL)
    private Tecnico tecnico;
    
    @OneToMany(mappedBy = "timeCasa")
    @Cascade(CascadeType.ALL)
    private List<Jogo> listaTimeCasa;
    
    @OneToMany(mappedBy = "timeVisitante")
    @Cascade(CascadeType.ALL)
    private List<Jogo> listTimeVisitante;

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

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
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

    public void setJogadores(List<Jogador> jogadores) {
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
