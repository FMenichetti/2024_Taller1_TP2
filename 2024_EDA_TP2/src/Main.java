
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
        System.out.println("---------------------------");
        System.out.println("---------------------------");
        Ordenamiento ordenamiento2 = new Ordenamiento();
        ordenamiento2.carga();

        System.out.println("Antes de ordenar:");
        ordenamiento2.muestra();
        startTime = System.currentTimeMillis();
        ordenamiento2.insertionSort();
        finalTime = System.currentTimeMillis();
        System.out.println("Tiempo Insertion: " + ( finalTime-startTime));
        System.out.println("Ordenado");
        ordenamiento2.muestra();
        
        System.out.println("---------------------------");
        System.out.println("---------------------------");
        
//         Ordenamiento ordenamientoBucket = new Ordenamiento();
//        ordenamientoBucket.carga();
//
//        System.out.println("Antes de ordenar:");
//        ordenamientoBucket.muestra();
//        startTime = System.currentTimeMillis();
//        ordenamientoBucket.bucketSort();
//        finalTime = System.currentTimeMillis();
//        System.out.println("Tiempo Bucket: " + ( finalTime-startTime));
//        System.out.println("Ordenado");
//        ordenamientoBucket.muestra();
//        
        System.out.println("---------------------------");
        System.out.println("---------------------------");
        
        
         Ordenamiento ordenamientoQuick = new Ordenamiento();
        ordenamientoQuick.carga();

        System.out.println("Antes de ordenar:");
        ordenamientoQuick.muestra();
        startTime = System.currentTimeMillis();
        ordenamientoQuick.quickSort();
        finalTime = System.currentTimeMillis();
        System.out.println("Tiempo Quick: " + ( finalTime-startTime));
        System.out.println("Ordenado");
        ordenamientoQuick.muestra();
        
        System.out.println("---------------------------");
        System.out.println("---------------------------");
        
    }
    
}
