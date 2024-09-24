package revisão; 

public class Produto {
	
	protected int codigo; /* protected serve para ter os gets e setters no código, se estiver public não é necessário */
	protected float preco; /* protected serve para ter os gets e setters no código, se estiver public não é necessário */
	protected String descricao; /* protected serve para ter os gets e setters no código, se estiver public não é necessário */
	

	public Produto(int codigo, String descricao, float preco) 
	
	/* constructor necessário em todas as classes, sempre nesse mesmo formato com os atributos,
	 depois dele sempre vem os "this" com tudo que estiver dentro dos parenteses. */
	
	
	{
		this.codigo = codigo;
		this.descricao = descricao;
		this.preco = preco;		
	}
	
	/* getter  serve para poder puxar as informações que estarão na classe main e poder mostrar elas na hora de rodar o codigo */
	public int getCodigo() {
		return codigo;
	}
	
	/* setter serve para definir um valor na classe main, sem ele não é possivel definir nada*/
	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}
	
	
	/* getter  serve para poder puxar as informações  que estarão na classe main e poder mostrar elas na hora de rodar o codigo */
	public float getPreço() {
		return preco;
	}
	
	
	/* setter serve para definir um valor na classe main, sem ele não é possivel definir nada*/
	public void setPreço(float preco) {
		this.preco = preco;
	}
	
	
	/* getter  serve para poder puxar as informações  que estarão na classe main e poder mostrar elas na hora de rodar o codigo */
	public String getDescricao() {
		return descricao;
	}
	
	
	
	/* setter serve para definir um valor na classe main, sem ele não é possivel definir nada*/
	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}
	
	/* Override e toString serve para poder mostrar as informações na hora de rodar, com ele é possivel ver o valor dos atributos */
	@Override
	public String toString() {
		return "Código: " + codigo + "\nDescrição: "+descricao+"\nPreço: " + preco;
	}
	
}





