/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espe.model;
//import ec.edu.espe.model.Analyzer;
/**
 *
 * @author USUARIO
 */
public class Comparison {
    //atributos
    private Analyzer[] analyzer;
    //metodos
    public static void main(String[] args) {
        // TODO code application logic here
        Analyzer analyzer1;
        analyzer1= new Analyzer();
        analyzer1.setName("Danny");
        analyzer1.setFirstDay(5);
        analyzer1.setUltimateDay(10);
        System.out.println("El analista se llama "+analyzer1.getName()+"  trabajo desde el dia  "+analyzer1.getFirstDay());  
        System.out.println("hasta el dia "+analyzer1.getUltimateDay()+"  del presente mes");
            
        
    }
    public void comparisonAnalist(Analyzer[] analyzer){
        
    }
}
