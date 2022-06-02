/**
 * Estudamos, durante as aulas da disciplina, como a complexidade de tempo (custo de execução)
    de um algoritmo pode impactar o tempo para a obtenção de uma solução para um problema
    computacional. O cálculo matemático da complexidade do algoritmo dá uma medida segura para
    compararmos algoritmos e seus comportamentos.
    Neste exercício, tentaremos ver na prática os efeitos de algoritmos de complexidades
    diferentes para um mesmo problema. Você realizará a medição de tempo de execução de algoritmos
    diferentes com quantidades crescentes de dados e comparará os resultados obtidos com a função de
    complexidade destes algoritmos.
    A descrição completa das tarefas segue:

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
    um vetor aleatório e outro já ordenado. Execute este teste 10 vezes para tirar a média de
    tempo; compare os resultados obtidos com o que sabemos de quicksort. 
 */
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
    }

    public static void main(String[] args) throws Exception {
        //tam = 62.500, 125.000, 250.000, 375.000
        int tam = 62500;
        double 
        bubblesort(gerarVetor(tam, bagunca));
        
    }
}




	