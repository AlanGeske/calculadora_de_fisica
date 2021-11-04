
// //Imagine que você foi contratado por um professor de física que deseja tornar suas aulas mais modernas. Ele solicitou a você que crie um programa capaz de calcular as respostas para as seguintes Fórmulas dinâmicas e cinemáticas:

// - Força peso
// - Força centrípeta
// - Impulso
// - Força Elástica
// - Velocidade média
// - Movimento Retilíneo Uniformemente (MRU)
// - Movimento Retilíneo Uniformemente Variado (MRUV)

public class Calculadora {

   


    public float calcularForcaPeso(float massa, float peso){
        return  massa *  peso;
    }
   
    public float calcularForcaCentripeta(float Velocidade, float raio, float massa){
        return (float) (massa * Math.pow(Velocidade, 2) / raio);

    }
         
    public float calcularImpulso( float forcaMedia, float intervaloTempo){
        return forcaMedia * intervaloTempo;

    }

    public float calcularForcaElastica (float constanteElasticaMola, float deformacaoMola){
        return constanteElasticaMola * deformacaoMola;
    }   


    public float calcularVelocidadeMedia (float distancia, float tempo){
        return distancia / tempo;

    }

    public float calcularMru (float posicaoInicial, float velocidade, float intervaloTempo){
        return posicaoInicial + velocidade * intervaloTempo;

    }

    public float calcularMruv (float posicaoInicial, float velocidade, float intervaloTempo, float aceleracao){
        return  (float) (posicaoInicial + velocidade * intervaloTempo + aceleracao * Math.pow(intervaloTempo, 2) / 2); 
    }
}
