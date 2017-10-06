package basicas;

import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import org.hibernate.annotations.Cascade;
import org.hibernate.annotations.CascadeType;
import org.hibernate.annotations.Fetch;
import org.hibernate.annotations.FetchMode;

import basicas.Jogador;
import basicas.Pessoa;
import basicas.Time;

@Entity
public class Jogador extends Pessoa {

    @ManyToOne()
    @JoinColumn(name="FK_ID_Time",
            insertable = true, updatable = true)
    @Fetch(FetchMode.JOIN)
    @Cascade(CascadeType.SAVE_UPDATE)
    private Time time;
    
    private int numCamisa;
    private boolean estaEmCampo;
    private boolean temCardAmarelo;
    private int qtdCardAmarelo;
    private int qtdCardVermelho;

    public Time getTime() {
        return time;
    }

    public void setTime(Time idTm) {
        this.time = idTm;
    }

    public int getNumCamisa() {
        return numCamisa;
    }

    public void setNumCamisa(int numCamisa) {
        this.numCamisa = numCamisa;
    }

    public boolean isEstaEmCampo() {
        return estaEmCampo;
    }

    public void setEstaEmCampo(boolean estaEmCampo) {
        this.estaEmCampo = estaEmCampo;
    }

    public boolean isTemCardAmarelo() {
        return temCardAmarelo;
    }

    public void setTemCardAmarelo(boolean temCardAmarelo) {
        this.temCardAmarelo = temCardAmarelo;
    }

    public int getQtdCardAmarelo() {
        return qtdCardAmarelo;
    }

    public void setQtdCardAmarelo(int qtdCardAmarelo) {
        this.qtdCardAmarelo = qtdCardAmarelo;
    }

    public int getQtdCardVermelho() {
        return qtdCardVermelho;
    }

    public void setQtdCardVermelho(int qtdCardVermelho) {
        this.qtdCardVermelho = qtdCardVermelho;
    }
    
    
    @Override
	public String toString() {
		return " -----------------------------\n " 
				+ "Jogador:\n "
				+ super.getNome() + "\n"
				+ " numCamisa = " + numCamisa       + "\n"
				+ " estaEmCampo = " + estaEmCampo     + "\n" 
				+ " temCardAmarelo = " + temCardAmarelo  + "\n" 
				+ " qtdCardAmarelo = " + qtdCardAmarelo  + "\n" 
				+ " qtdCardVermelho = " + qtdCardVermelho + "\n"
				+ " ----------------------------- ";
				
	}

	@Override
    public int hashCode() {
        int hash = 7;
        hash = 97 * hash + this.numCamisa;
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
        final Jogador other = (Jogador) obj;
        if (this.numCamisa != other.numCamisa) /*&& ()*/ {
            return false;
        }
        return true;
    }

}
