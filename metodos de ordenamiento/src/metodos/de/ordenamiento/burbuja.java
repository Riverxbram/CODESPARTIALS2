
package metodos.de.ordenamiento;

public class burbuja {
    public static void burbuja(int[]arreglo){
        int tamaño = arreglo.length;
        for (int i=0; i<tamaño; i++){
            for (int j=0; j<tamaño-1; j++){
                if (arreglo[j]>arreglo[j+1]){
                    int temp= arreglo[j];
                    arreglo [j]= arreglo[j+1];
                    arreglo [j+1]=temp;
                } 
                
                
            }
        }
    } 
}
