/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espe.arreglos.primitivos;

/**
 *
 * @author LABS-DECC
 */
public class TestingArrays {
    // alt+shift +f tabulacion
    public static void main(String[] args) {
        //new <tipo> de dato  [dimension]
        int[] enteros = new int[10];
        int[] otrosEnteros = {8, 11, 2017};
        float[] flotantes = new float[5];
        System.out.println("primer arreglo \n");
        for (int i = 0; i < enteros.length; i++) {
            enteros[i] = i + 1;
            System.out.println(+enteros[i] + "\n");
        }
        System.out.println("segundo arreglo \n");
        for (float j = (float) 0.1; j <= 0.5; j += (float) 0.1) {
            flotantes[(int) j * 10] = 1 + j;
            System.out.println(+flotantes[(int) j * 10] + "\n");
        }
        for (int i = 0; i < 3; i++) {
            System.out.printf("\t");
            System.out.print(otrosEnteros[i]);
            //System.out.println(otrosEnteros[i] + "/");
        }
        System.out.printf("\n");
        for (int entero : enteros) {
            System.out.printf("\t");
            System.out.print(entero);
        }
        System.out.printf("\n");
        for(float flotante:flotantes){
            System.out.printf("\t");
            System.out.print(flotante);
        }
    }
}
