import java.util.Random;
/**
 * PRIMEIRA PARTE
    a) Especificar, no documento a ser entregue, em qual equipamento foram realizados os testes
    (modelo do processador e velocidade; quantidade de memória principal / RAM; sistema
    operacional utilizado);

    b) Usar vetores de teste de tamanho 62.500 125.000, 250.000, 375.000 com valores aleatórios
    inteiros. É importante ressaltar que o mesmo vetor deve ser utilizado nos testes com cada
    um dos dois algoritmos.

    c) Para cada tamanho de vetor, realizar 50 vezes e retirar a média do tempo das ordenações
    com método da bolha e quicksort.
    
    d) Criar uma tabela comparando os resultados de tempo x tamanho entre os dois algoritmos
    e relacionar os valores com as suas complexidades teóricas.
    
    SEGUNDA PARTE
    a) Usando o vetor de tamanho 375.000, realizar uma comparação do algoritmo quicksort com
    um vetor aleatório e outro já ordenado. Execute este teste 10 vezes para tirar a mé
 */
public class base {

    static Random sorte = new Random(42); // números aleatórios fixos para testes
    public static void clear(){ 

        System.out.print("\033[H\033[2J"); 
        System.out.flush(); 
    }
    /**
     * Troca dois elementos de posição em um vetor de inteiros
     * 
     * @param tam O tamanho do vetor
     * @param p1  Primeira posição a ser trocada
     * @param p2  Segunda posição a ser trocada
     */
    public static void troca(int[] vet, int p1, int p2) {
        int aux = vet[p1];
        vet[p1] = vet[p2];
        vet[p2] = aux;
    }

     static int[] bubbleSort(int[] v) {
          //for utilizado para controlar a quantidade de vezes que o vetor será ordenado.
         for(int i = 0; i < v.length - 1; i++) {
            //for utilizado para ordenar o vetor.
           for(int j = 0; j < v.length - 1 - i; j++) {
             /* Se o valor da posição atual do vetor for maior que o proximo valor,
               então troca os valores de lugar no vetor. */
             if(v[j] > v[j + 1]) {
               int aux = v[j];
               v[j] = v[j + 1];
               v[j + 1] = aux;
             }
           }
         }
         return v;
        }
          
       
       private static int[] quickSort(int[] vetor, int inicio, int fim) {
        if (inicio < fim) {
          int posicaoPivo = separar(vetor, inicio, fim);
          quickSort(vetor, inicio, posicaoPivo - 1);
          quickSort(vetor, posicaoPivo + 1, fim);
        }
        return vetor;
      }
    
      private static int separar(int[] vetor, int inicio, int fim) {
        int pivo = vetor[inicio];
        int i = inicio + 1;
        while (i <= fim) {
          if (vetor[i] <= pivo)
            i++;
          else if (pivo < vetor[fim])
            fim--;
          else {
            int troca = vetor[i];
            vetor[i] = vetor[fim];
            vetor[fim] = troca;
            i++;
            fim--;
          }
        }
        vetor[inicio] = vetor[fim];
        vetor[fim] = pivo;
        return fim;
      }

    /**
     * Gera um vetor de inteiros ordenados, de tamanho N, com valores de 1 a N
     * 
     * @param tam O tamanho do vetor
     * @return O vetor com valores de 1 a N
     */
    public static int[] gerarVetor(int tam, double bagunca) {
        int[] vet = new int[tam];
        

        for (int i = 0; i < tam; i++)
            vet[i] = i + 1;

        int mistura = (int) (tam * bagunca);

        for (int i = 0; i < mistura; i++) {
            int p1 = sorte.nextInt(tam);
            int p2 = sorte.nextInt(tam);
            troca(vet, p1, p2);
        }
        return vet;
    }

    public static void main(String[] args) {
        clear();
        double soma = 0;
        long[] armazenaTempo = new long [50];
        //62.500 125.000, 250.000, 375.000
        int tam = 375000;
        double bagunca = 5.15 ;
        int[] V = gerarVetor(tam, bagunca), ordenado = quickSort(V , 0, V.length - 1);

       try{
         
            
            long start = System.currentTimeMillis();
          //bubbleSort(V);
           quickSort(ordenado, 0, V.length - 1);
          
          long elapsed = (System.currentTimeMillis() - start);  
             soma += elapsed;
             //setInterval(armazenaTempo[i],1000);
          System.out.println(soma);
         //System.out.println(media);
       } catch(Exception e){
          System.out.println(e);
       }
       
        
      }
   }
  
