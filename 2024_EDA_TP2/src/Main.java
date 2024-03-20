
public class Main {

    
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
