import java.util.Random;

public class App {
   
   
   public static void troca(int[] vet, int p1, int p2){
    int aux = vet[p1];
    vet[p1] = vet[p2];
    vet[p2] = aux;
}
static Random sorte = new Random();
/**
* Gera um vetor de inteiros ordenados, de tamanho N, com valores de 1 a N
* @param tam O tamanho do vetor
* @return O vetor com valores de 1 a N
*/
public static int[] gerarVetor(int tam, double bagunca){
    
    int[] vet = new int[tam];

    for(int i=0; i<tam; i++)
        vet[i] = i+1;

    double mistura = (int)tam*bagunca;

    for(int i=0; i<mistura; i++){
        int p1 = sorte.nextInt(tam);
        int p2 = sorte.nextInt(tam);
        troca(vet, p1, p2);			
    }
    return vet;
}

public int[] quicksort(int v[])
{

return v;
}

public int[] bubblesort(int v[])
{
for(int i = 0; i < v.length - 1; i++) {
    
    for(int j = 0; j < v.length - 1 - i; j++) {

        if(v[j] > v[j + 1]) {
            int aux = v[j];
            v[j] = v[j + 1];
            v[j + 1] = aux;
        }
    }
}
return v;
}
    public static void main(String[] args) throws Exception {
        
        
    }
}
