/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espe.arreglos.tipos;

import ec.edu.espe.arreglos.modelo.TeamSoccer;

/**
 *
 * @author USUARIO
 */
public class TestingTeamSoccer {
    public static void main(String[] args) {
        TeamSoccer[] teamSoccer= new TeamSoccer[10];
        //int i=0;
        //incializacion
        for(int i=0;i<teamSoccer.length;i++){
            teamSoccer[i]=new TeamSoccer();
            teamSoccer[i].setPoints(i+3);
            if((i%2)==0){
                teamSoccer[i].setCategory("secundary");
            }else{
                teamSoccer[i].setCategory("primary");
            }
        }
        teamSoccer[0].setName("Nacional");
        teamSoccer[1].setName("Liga de Quito");
        teamSoccer[2].setName("Barcelona");
        teamSoccer[3].setName("Emelec");
        teamSoccer[4].setName("Aucas");
        teamSoccer[5].setName("Delfin");
        teamSoccer[6].setName("Independiente");
        teamSoccer[7].setName("Quito");
        teamSoccer[8].setName("Fuerza Amarilla");
        teamSoccer[9].setName("Catolica");
        //impresion
        System.out.println("primera forma del for\n");
        System.out.println("puntos   Nombre    Categoria");
        for(TeamSoccer teamSoccers:teamSoccer){
            System.out.println(teamSoccers.getPoints()+"        "+teamSoccers.getName()+"--"+teamSoccers.getCategory()); 
        }
        System.out.println("segunda forma del for\n");
        System.out.println("puntos   Nombre    Categoria");
        for(int j=0;j<teamSoccer.length;j++){
            System.out.println(teamSoccer[j].getPoints()+"        "+teamSoccer[j].getName()+"--"+teamSoccer[j].getCategory());
        }
    }
}
