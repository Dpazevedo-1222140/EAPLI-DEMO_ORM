/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package isep.eapli.demo_orm.persistencia;

import isep.eapli.demo_orm.dominio.GrupoAutomovel;

/**
 *
 * @author eapli
 */
public class GrupoAutomovelRepositorioJPARepository extends JpaRepository<GrupoAutomovel,Long> {

    @Override
    protected String persistenceUnitName() {
        return "DEMO_ORMPU";
    }

}
