/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author DELL
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Ordenamiento ordenamiento = new Ordenamiento();
        ordenamiento.carga();

        System.out.println("Antes de ordenar:");
        ordenamiento.muestra();
        long startTime = System.currentTimeMillis();
        ordenamiento.bubbleSort();
        long finalTime = System.currentTimeMillis();
        System.out.println("Tiempo bubble: " + ( finalTime-startTime));
        System.out.println("Ordenado");
        ordenamiento.muestra();
        //Otro metodo
        
        Ordenamiento ordenamiento2 = new Ordenamiento();
        ordenamiento2.carga();

        System.out.println("Antes de ordenar:");
        ordenamiento2.muestra();
        startTime = System.currentTimeMillis();
        ordenamiento2.insertionSort();
        finalTime = System.currentTimeMillis();
        System.out.println("Tiempo bubble: " + ( finalTime-startTime));
        System.out.println("Ordenado");
        ordenamiento2.muestra();
        System.out.println("Messi 10");
        
        
    }
    
}
