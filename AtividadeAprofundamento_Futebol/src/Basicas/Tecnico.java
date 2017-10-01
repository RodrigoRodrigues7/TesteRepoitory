package Basicas;

import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;

@Entity
public class Tecnico extends Pessoa {
    
    @OneToOne
    @JoinColumn(name="FK_ID_Time")
    private Time time;

    public Time getTime() {
        return time;
    }

    public void setTime(Time nomeTime) {
        this.time = nomeTime;
    }
    
}
