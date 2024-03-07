/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package isep.eapli.demo_orm.apresentacao;

import isep.eapli.demo_orm.aplicacao.GrupoAutomovelController;
import isep.eapli.demo_orm.dominio.GrupoAutomovel;
import isep.eapli.demo_orm.util.Console;

import java.util.List;

/**
 *
 * @author mcn
 */
public class MainMenu {
    public static void mainLoop() {
		int opcao = 0;
		do {
			opcao = menu();
			GrupoAutomovelController grupoAutomovelController = new GrupoAutomovelController();
			switch (opcao) {
				case 0:
					System.out.println("fim ...");
					break;
				case 1:
					String nome = Console.readLine("Nome");
					int portas = Console.readInteger("Portas");
					String classe = Console.readLine("Classe");
					grupoAutomovelController.registarGrupoAutomóvel(nome,portas,classe);
					break;

				case 2:
					List<GrupoAutomovel> result= grupoAutomovelController.listarGruposAutomoveis();
					for (GrupoAutomovel ga:result){
						System.out.println("Nome:"+ga.getNome());
						System.out.println("Portas:"+ga.getPortas());
						System.out.println("Classe"+ga.getClasse());
					}
					break;

				
				
				default:
					System.out.println("opcao não reconhecida.");
					break;
			}
		} while (opcao != 0);

	}

	private static int menu() {
		int option = -1;
		System.out.println("");
		System.out.println("=============================");
		System.out.println(" Rent a Car ");
		System.out.println("=============================\n");
		System.out.println("1.Registar Grupo Automóvel");
		System.out.println("2.Listar todos os Grupos Automóveis");          
		
        System.out.println("=============================");
        System.out.println("0. Sair\n\n");
		option = Console.readInteger("Por favor escolha opção");
		return option;
	}
}
