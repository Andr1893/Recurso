
public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World!");

        /**
         * 1) Indique qual o output (na consola) do seguinte código: O cão Bobby ladra O
         * gato mia
         * 
         * caso a classe cao e gato nao tenha o super(); o codigo dara erro.
         * 
         * Nesse caso a resposta: - Erro ao compilar o codigo pois as classes nao contem
         * a super() da herança
         */
        Animal cao = new Cao("Bobby");
        Animal gato = new Gato("Tareco");

        /**
         * 2) Indique quais as diferenças entre os modificadores de acesso default,
         * public, private e protected.
         * 
         * defaut: Acessível pelas classes dentro do mesmo package public: Acessível por
         * todas as classes private: Acessível apenas dentro da classe protected:
         * Acessível dentro do mesmo package e pelas classes descendentes (subclasses)
         * 
         */

        /**
         * 3) Um snack-bar tem o seguinte preçário:
         * 
         * So precisas de fazer a função
         * 
         */

        String[] arrPedidos = new String[] { "H", "F", "C", "B", "F", "H", "C" };
        double total = calcularReceita(arrPedidos);
        System.out.println(total);

        /**
         * 4) A Escola Secundária de Santa Maria da Feira organizou uma mini-maratona, na qual
              participaram 100 atletas. Os tempos dos participantes, expressos em segundos, foram
              armazenados num array. Implemente em Java os seguintes métodos:
         */


         /**
          * Criação do array
          * So precisas de fazer a funções
          */
         int[] arrTempos = new int[] {100,150,200,60,45,37};


         int menorTempo = getMenorTempo(arrTempos);
         System.out.println("Menor Tempo: "+ menorTempo);

         double media = getTempoMedio(arrTempos);
         System.out.println("Tempo medio: " + media);

         int nParticipantes = getNumAbaixoMedia(arrTempos,media);
         System.out.println("Total participantes abaixo media "+ nParticipantes);

    }

    /**
     * 
     * 3) Um snack-bar tem o seguinte preçário:
     * Esta é função
     * 
     */
    static double calcularReceita(String[] arrPedidos) {

        double totalPagar = 0;
        for (int i = 0; i < arrPedidos.length; i++) {

            switch (arrPedidos[i]) {
                case "H":
                    totalPagar += 5;
                    break;

                case "F":
                    totalPagar += 8;
                    break;

                case "B":
                    totalPagar += 2;
                    break;

                case "C":
                    totalPagar += 1.5;
                    break;
            }
        }

        return totalPagar;
    }

    /**
     * 
     * 4)
     *  - a
     */
    static int getMenorTempo(int[] arrTempos) {
        int tempo = arrTempos[0];

        // Percorre os tempos todos do array
        for (int i = 0; i < arrTempos.length; i++) {

            // caso o tempo seja maior que o tempo arrTempos[i] 
            if (tempo > arrTempos[i])
                tempo = arrTempos[i];
            
        }
        return tempo;
    }

    /**
     * 
     * 4)
     *  - b
     */
    static double getTempoMedio(int[] arrTempos){
        double media = 0;

        // Percorre os tempos todos do array
        for (int i = 0; i < arrTempos.length; i++) {

           media += arrTempos[i];
            
        }
        return media / arrTempos.length;
    }

    /**
     * 
     * 4)
     *  - C
     */
    static int getNumAbaixoMedia(int[] arrTempos, double tempoMedio){

        int participantes = 0;

        for (int i = 0; i < arrTempos.length; i++) {
            
            if(arrTempos[i] < tempoMedio)
            participantes +=1;
        }

        return participantes;
    }

}
