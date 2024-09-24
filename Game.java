package revisão;


public class Game extends Produto implements Caixa {
	
	
	/*Sempre necessário no constructor colocar os atributos que estão sendo herdados e se tiver os novos que foram criados. */
	public Game(int codigo, String descricao, float preco) {
		super(codigo, descricao, preco);
		/*Como são atributos de outra classe se usa o SUPER. Não é necessário o THIS
		por já estar feito n	a outra classe*/
	}

	/*Aqui é o calculo para fazer o desconto, 15% de desconto*/
	public float calculaDesconto() {
		return preco - preco*0.15f;
	}
	
	/* Override e toString serve para poder mostrar as informações na hora de rodar, com ele é possivel ver o valor dos atributos */
	@Override
	public String toString() {
		return super.toString()+"\nPreço com desconto: " + calculaDesconto();
	}
}
