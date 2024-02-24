package isep.eapli.demo_orm.dominio;

public class GrupoAutomovel {

    private String nome;

    private int portas;

    private String classe;

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
