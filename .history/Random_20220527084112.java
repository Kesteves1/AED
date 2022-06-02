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
    
    public int[] quicksort(int V)
    {
        int[] v = {5, 2, 4, 3, 0, 9, 7, 8, 1, 6};
        BubbleSort bs = new BubbleSort();
        bs.ordenar(v);
        for(int num : v) {
      System.out.print(num + " ");
    }
    public int[] bubblesort()
    {

    }
    
   

}




	