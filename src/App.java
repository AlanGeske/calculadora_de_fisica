import java.util.Scanner;

public class App {
    

    public static void main(String[] args)  {
 
        Calculadora Calculadora = new Calculadora();
        Scanner scanner = new Scanner(System.in);
        
        float massa = 5;
        float peso = 10;
        float velocidade = 15;
        float raio = 20;
        float forcaMedia = 25;
        float intervaloTempo = 30;
        float constanteElasticaMola = 35;
        float deformacaoMola = 40;
        float distancia = 45;
        float tempo = 50;
        float posicaoInicial = 55;
        float aceleracao = 60;
        float resultado;

        
        resultado = Calculadora.calcularForcaPeso(massa, peso);
        System.out.println("O resultado do cálculo força peso é: " +resultado);
      
       resultado = Calculadora.calcularForcaCentripeta(velocidade, raio, massa);
       System.out.println("O resultado do cálculo força centrípeta é: " +resultado);  

       resultado = Calculadora.calcularForcaElastica(constanteElasticaMola, deformacaoMola);
       System.out.println("O resultado do cálculo força elástica é: " +resultado);
       
       resultado = Calculadora.calcularImpulso(forcaMedia, intervaloTempo);
       System.out.println("O resultado do cálculo impulso é: " +resultado);

       resultado = Calculadora.calcularMru(posicaoInicial, velocidade, intervaloTempo);
       System.out.println("O resultado do cálculo MRU é: " +resultado);

       resultado = Calculadora.calcularMruv(posicaoInicial, velocidade, intervaloTempo, aceleracao);
       System.out.println("O resultado do cálculo MRUV é: " +resultado);

       resultado = Calculadora.calcularVelocidadeMedia(distancia, tempo);
       System.out.println("O resultado do cálculo de velocidade média é: " +resultado);

    }
    }

