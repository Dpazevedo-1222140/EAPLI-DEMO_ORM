package isep.eapli.demo_orm.dominio;


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Automovel {
    @Id
    long pk;
    @Column(unique=true)
    String matricula;

    public Automovel(){}
}
