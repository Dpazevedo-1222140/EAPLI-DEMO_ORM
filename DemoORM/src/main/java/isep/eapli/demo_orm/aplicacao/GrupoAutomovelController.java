/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package isep.eapli.demo_orm.aplicacao;

import isep.eapli.demo_orm.dominio.GrupoAutomovel;
import isep.eapli.demo_orm.persistencia.GrupoAutomovelRepositorio;
import isep.eapli.demo_orm.persistencia.GrupoAutomovelRepositorioJPAImpl;
import isep.eapli.demo_orm.persistencia.GrupoAutomovelRepositorioJPARepository;

import java.util.List;

/**
 *
 * @author eapli
 */
public class GrupoAutomovelController {

    private static final GrupoAutomovelRepositorioJPARepository repo = new GrupoAutomovelRepositorioJPARepository();


    public GrupoAutomovel registarGrupoAutomóvel(String nome, int portas,
            String classe,Double precoPorDia) {
        GrupoAutomovel grupo1 = new GrupoAutomovel(nome, portas, classe,precoPorDia);
        return repo.add(grupo1);
    }
    
    public List<GrupoAutomovel> listarGruposAutomoveis() {
        return repo.findAll();
	}

	public GrupoAutomovel procurarGrupoAutomovel(long id) {
		throw new UnsupportedOperationException("Ainda não implementada");
	}

        /*  Versão  sem usar padrão repositório
	 private GrupoAutomovel gravarGA(GrupoAutomovel gAuto) {

	 EntityManager manager = criarEntityManager("DEMO_ORMPU");

	 manager.getTransaction().begin();
	 manager.persist(gAuto);
	 manager.getTransaction().commit();

	 manager.close();
	 return gAuto;
	 }

	 private List<GrupoAutomovel> listarTodos() {


	 EntityManager manager = criarEntityManager("DEMO_ORMPU");

	 Query query = manager.createQuery("select ga from GrupoAutomovel ga");
	 List<GrupoAutomovel> results = query.getResultList();

	 for (GrupoAutomovel result : results) {
	 System.out.println(result);
	 }

	 manager.close();
	 return results;
	 }

	 private EntityManager criarEntityManager(String persistenceUnit) {
	 EntityManagerFactory factory = Persistence.
	 createEntityManagerFactory(persistenceUnit);
	 EntityManager manager = factory.createEntityManager();
	 return manager;
	 }
	 */
}
