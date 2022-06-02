public class Random{
        static Random sorte = new Random(42); //números aleatórios fixos para testes

        /**
         * Troca dois elementos de posição em um vetor de inteiros
         * @param tam O tamanho do vetor
         * @param p1 Primeira posição a ser trocada
         * @param p2 Segunda posição a ser trocada
         */
        public static void troca(int[] vet, int p1, int p2){
            int aux = vet[p1];
            vet[p1] = vet[p2];
            vet[p2] = aux;
    }

    /**
     * Gera um vetor de inteiros ordenados, de tamanho N, com valores de 1 a N
     * @param tam O tamanho do vetor
     * @return O vetor com valores de 1 a N
     */
    public static int[] gerarVetor(int tam, double bagunca){
        int[] vet = new int[tam];
        
        for(int i=0; i<tam; i++)
            vet[i] = i+1;
        
        int mistura = (int)tam*bagunca;

        for(int i=0; i<mistura; i++){
            int p1 = sorte.nextInt(tam);
            int p2 = sorte.nextInt(tam);
            troca(vet, p1, p2);			
        }
        return vet;
    }
    
    public int[] quicksort(int v[])
    {
        // for utilizado para controlar a quantidade de vezes que o vetor será ordenado.
    for(int i = 0; i < v.length - 1; i++) {
        // for utilizado para ordenar o vetor.
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
    public int[] bubblesort()
    {

    }
    
   

}




	