
import java.util.Arrays;
import java.util.Random;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author DELL
 */
public class Ordenamiento {
     private int[] datos;

    public Ordenamiento() {
        datos = new int[10000];
    }

    public void carga() {
        Random rand = new Random();
        for (int i = 0; i < datos.length; i++) {
            datos[i] = rand.nextInt(10000); // Números aleatorios hasta 100
        }
    }

    public void muestra() {
       // System.out.println("Arreglo antes de ordenar:");
        System.out.println(Arrays.toString(datos));
    }

    public void bubbleSort() {
        System.out.println("----------Bubblesort-----------------");
        int n = datos.length;
        boolean flag = true;
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                if (datos[j] > datos[j + 1]) {
                    int temp = datos[j];
                    datos[j] = datos[j + 1];
                    datos[j + 1] = temp;
                    flag = false;
                }
                
            }
            if ( flag ) i=(n-2);
        }
    }

    public void insertionSort() {
          System.out.println("----------InsertionSort-----------------");
        int n = datos.length;
        for (int i = 1; i < n; ++i) {
            int aux = datos[i]; //guardo datos en posicion actual
            int j = i - 1; // guardo en J el indice anterior al actual

            while (j >= 0 && datos[j] > aux) { //
                datos[j + 1] = datos[j];
                j = j - 1;
            }
            datos[j + 1] = aux;
        }
    }

    public void shellSort() {
        int n = datos.length;

        for (int gap = n / 2; gap > 0; gap /= 2) {
            for (int i = gap; i < n; i += 1) {
                int temp = datos[i];
                int j;
                for (j = i; j >= gap && datos[j - gap] > temp; j -= gap) {
                    datos[j] = datos[j - gap];
                }
                datos[j] = temp;
            }
        }
    }

    
    
}
