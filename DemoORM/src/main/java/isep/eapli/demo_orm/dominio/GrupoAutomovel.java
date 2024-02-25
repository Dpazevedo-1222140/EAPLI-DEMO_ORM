package isep.eapli.demo_orm.dominio;


import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class GrupoAutomovel {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    private String nome;

    private int portas;

    private String classe;


    public GrupoAutomovel(){}
    public GrupoAutomovel(String nome, int portas, String classe){
        this.nome=nome;
        this.portas=portas;
        this.classe=classe;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setPortas(int portas) {
        this.portas = portas;
    }

    public void setClasse(String classe) {
        this.classe = classe;
    }

    public String getNome() {
        return nome;
    }

    public int getPortas() {
        return portas;
    }

    public String getClasse() {
        return classe;
    }
}
