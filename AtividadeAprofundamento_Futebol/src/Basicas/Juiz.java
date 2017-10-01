package Basicas;

import java.util.List;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.OneToMany;
import org.hibernate.annotations.Cascade;
import org.hibernate.annotations.CascadeType;

@Entity
public class Juiz extends Pessoa {

    @OneToMany(mappedBy = "juizJogo", fetch = FetchType.LAZY)
    @Cascade(CascadeType.ALL)
    private List<Jogo> jogos;

    public List<Jogo> getJogos() {
        return jogos;
    }

    public void setJogos(List<Jogo> jogos) {
        this.jogos = jogos;
    }

}
