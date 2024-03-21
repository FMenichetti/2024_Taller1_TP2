
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
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
    private ArrayList<Integer> lista;
    
    public Ordenamiento() {
        datos = new int[10000];
        lista = new ArrayList();
    }
    
    public void carga() {
        Random rand = new Random();
        for (int i = 0; i < datos.length; i++) {
            datos[i] = rand.nextInt(10000); // Números aleatorios hasta 100
            lista.add(rand.nextInt(10000)); // Números aleatorios hasta 100
            
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
            if (flag) {
                i = (n - 2);
            }
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
        System.out.println("----------InsertionSort-----------------");
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
    
    public void bucketSort() {
        // Paso 1: Crear un arreglo de "cubetas" (buckets)
        ArrayList<ArrayList<Integer>> cubetas = new ArrayList<>(lista.size());
        for (int i = 0; i < lista.size(); i++) {
            cubetas.add(new ArrayList<>());
        }

        // Paso 2: Distribuir los elementos en las cubetas
        for (Integer num : lista) {
            int index = (int) (num * 10); // Multiplicamos por 10 para distribuir en las cubetas
            cubetas.get(index).add(num);
        }

        // Paso 3: Ordenar cada cubeta
        for (ArrayList<Integer> cubeta : cubetas) {
            Collections.sort(cubeta);
        }

        // Paso 4: Concatenar las cubetas ordenadas
        lista.clear();
        for (ArrayList<Integer> cubeta : cubetas) {
            lista.addAll(cubeta);
        }
    }
    
    public void quickSort() {
        quickSort(0, lista.size() - 1);
    }
    
    private void quickSort(int inicio, int fin) {
        if (inicio < fin) {
            int indiceParticion = particion(inicio, fin);
            quickSort(inicio, indiceParticion - 1);
            quickSort(indiceParticion + 1, fin);
        }
    }
    
    private int particion(int inicio, int fin) {
        int pivote = lista.get(fin);
        int i = inicio - 1;
        for (int j = inicio; j < fin; j++) {
            if (lista.get(j) <= pivote) {
                i++;
                int temp = lista.get(i);
                lista.set(i, lista.get(j));
                lista.set(j, temp);
            }
        }
        int temp = lista.get(i + 1);
        lista.set(i + 1, lista.get(fin));
        lista.set(fin, temp);
        return i + 1;
    }
}
