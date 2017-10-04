package Basicas;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;
import java.util.Objects;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;

@Entity
public class Campeonato {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    private String nomeCamp;
    private Calendar dataInicio;
    private Calendar dataFim;

    @ManyToMany
    @JoinTable(name = "Time_Campeonato",
            joinColumns = @JoinColumn(name = "ID_Campeonato"),
            inverseJoinColumns = @JoinColumn(name = "ID_Time"))
    private List<Time> times = new ArrayList<>();
    
    public int getId() {
        return id;
    }
    
    public void setId(int id) {
        this.id = id;
    }
    
    public String getNomeCamp() {
        return nomeCamp;
    }
    
    public void setNomeCamp(String nomeCamp) {
        this.nomeCamp = nomeCamp;
    }
    
    public Calendar getDataInicio() {
        return dataInicio;
    }
    
    public void setDataInicio(Calendar dataInicio) {
        this.dataInicio = dataInicio;
    }
    
    public Calendar getDataFim() {
        return dataFim;
    }
    
    public void setDataFim(Calendar dataFim) {
        this.dataFim = dataFim;
    }
    
    public List<Time> getTimes() {
        return times;
    }
    
    public void setTimes(List<Time> times) {
        this.times = times;
    }
    
    @Override
    public int hashCode() {
        int hash = 7;
        hash = 89 * hash + this.id;
        hash = 89 * hash + Objects.hashCode(this.nomeCamp);
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
        final Campeonato other = (Campeonato) obj;
        if (this.id != other.id) {
            return false;
        }
        if (!Objects.equals(this.nomeCamp, other.nomeCamp)) {
            return false;
        }
        return true;
    }

}
