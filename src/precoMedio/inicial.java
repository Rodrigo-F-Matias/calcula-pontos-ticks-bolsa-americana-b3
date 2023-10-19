package precoMedio;

public class inicial {
	
	/* 
	 * Por hora apenas escrever a lógica */
	public static void main(String[] args) {
	
	System.out.println("Quantos níveis deseja na grade?");
	int niveis =40;
	System.out.println("Qual o espaço da grade (ticks M.americano ou pontos M.B3)?");
	//
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
	// verificar se a pontuação é do míni indice ou outro ativo. Qualquer outro a lógica deduzirá que é mercado americano.
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


