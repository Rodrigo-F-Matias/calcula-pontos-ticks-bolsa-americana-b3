package precoMedio;

public class inicial {
	
	/* Main é um metodo auto executavel em java*/
	public static void main(String[] args) {
	
	System.out.println("Qual o espaço dos níveis do GL?");
	int niveis =40;
	int somaNiveis = 0;
	int recebe =0;
	double valorDaPontuacao = 0.0021176470588235; /*no mini índice um ponto vale 0,20 , no nasdaq um tick vale 0,50 /na active 0,05 lote vale 0.0021176470588235 dólares o ponto */
	int espaco = 180;
	int pontuacaoTotal = 0;
	String moeda = "realoudolar";
	
	
	for (int numero=1; numero <= niveis; numero ++){
	       System.out.println("Numero atual é :"+numero);
	       somaNiveis = recebe + numero;
	       System.out.println("soma é :" +recebe + "+"+numero +" igual " + somaNiveis);
	       recebe = somaNiveis;
	 }
	
	if (valorDaPontuacao == 0.20) {
		moeda = "reais";
	}else {
		moeda = "dolares";
	}
	
	double resultado = ((valorDaPontuacao * espaco) *somaNiveis);
	System.out.println(" ");
	System.out.println("valor mínimo em caixa: " +resultado);
	pontuacaoTotal = niveis * espaco;
	System.out.println("Pontuacao total do GL: " +pontuacaoTotal+"pts");
	System.out.println(" ");
	System.out.println("Você precisa ter no mínimo "+resultado+" "+moeda+" "+"para aguentar "+pontuacaoTotal+"pts"+
	". Isso para operar com "+niveis+" niveis de "+espaco+"pts");
	
	
	
	}
}


