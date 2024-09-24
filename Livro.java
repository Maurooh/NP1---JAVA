package revisão;

	/*A classe extende de outra classe, para não precisar refazer os mesmos atributos ja feitos antes, facilitando o código */
	/*Implementa a classe caixa para poder utilizar o calculaDesconto de uma forma global, em outras classes também */
	public class Livro extends Produto implements Caixa {
		
		/* Cria a string que faltava para essa classe*/
		private String autor;
		
		
		/*No constructor é necessário colocar os atributos das outra classe que está herdando para poder funcionar e adicionar o que
		 foi colocado nessa classe */
		public Livro(int codigo,String descricao, float preco, String autor) 
		
		
		{
			super(codigo,descricao, preco);   
			/*Como são atributos de outra classe se usa o SUPER não é necessário o THIS
			por já estar feito na outra classe*/
			this.autor = autor;
			/*Como autor é um novo atributo é necessário o this */

		}
		
		/* getter  serve para poder puxar as informações que estarão na classe main e poder mostrar elas na hora de rodar o codigo */
		public String getAutor() {
			return autor;
		}
		
		/* setter serve para definir um valor na classe main, sem ele não é possivel definir nada*/
		public void setAutor(String autor) {
			this.autor = autor;
		}
		
		/*Aqui é o calculo para fazer o desconto, 10% de desconto*/
		public float calculaDesconto() {
			return preco - preco*0.10f;
		}
		
		
		/* Override e toString serve para poder mostrar as informações na hora de rodar, com ele é possivel ver o valor dos atributos */
		@Override
		public String toString() {
			return super.toString()+"\nAutor: " + autor+"\nPreço com desconto: "+calculaDesconto();
		}
	}


