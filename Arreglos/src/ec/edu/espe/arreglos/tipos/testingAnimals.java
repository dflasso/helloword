/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espe.arreglos.tipos;

import ec.edu.espe.arreglos.modelo.Animal;

/**
 *
 * @author LABS-DECC
 */
public class testingAnimals {
    //ctrl +shit+i---> importa clases
    public static void main(String[] args) {
        Animal[] animal= new Animal[10];
        System.out.printf("\nObjetos de Animales\n");
        //inicializaciones
        for(int i=0;i<10;i++){
            animal[i]= new Animal();
            animal[i].setId(i+1);
            if((i%2)==0){
                animal[i].setOjos("cafes");
            }else{
                animal[i].setOjos("negros");
            }
        }
        //nombres
        animal[1].setName("Juan");
        animal[2].setName("Pedro");
        animal[3].setName("Maria");
        animal[4].setName("Jose");
        animal[5].setName("Luis");
        animal[6].setName("Felipe");
        animal[7].setName("Carlos");
        animal[8].setName("Freddy");
        animal[9].setName("Edgar");
        animal[0].setName("Pablo");
        //impresion
        System.out.println("segunda forma del for\n");
        for(Animal animals: animal){
           System.out.println("id:  "+animals.getId()+"  name: "+animals.getName()+"  eyes:"+animals.getOjos());
        }
        System.out.println("segunda forma del for\n");
        for(int j=0;j<10;j++){
            System.out.println("id:  "+animal[j].getId()+"  name: "+animal[j].getName()+"  eyes:"+animal[j].getOjos());
        }  
    }
}
