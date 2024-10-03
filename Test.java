import java.util.Random;

public class Test {
    public static void main(String[] args) {
        int tamanho = 10; // Tamanho do array
        int limiteInferior = 1; // Limite inferior do intervalo
        int limiteSuperior = 100; // Limite superior do intervalo

        int[] numerosAleatorios = new int[tamanho];
        Random random = new Random();

        for (int i = 0; i < tamanho; i++) {
            numerosAleatorios[i] = random.nextInt(limiteSuperior - limiteInferior + 1) + limiteInferior;
        }

        System.out.print("Números aleatórios gerados: ");
        for (int num : numerosAleatorios) {
            System.out.print(num + " ");
        }
        
        System.out.println();
        int k = Ordenacao.encontrarMaximo(numerosAleatorios);
        numerosAleatorios = Ordenacao.sort(numerosAleatorios, tamanho, k);
        
        System.out.print("Números aleatórios ordenados: ");
        for (int num : numerosAleatorios) {
            System.out.print(num + " ");
        }
        
         System.out.println();
         
    }
}
