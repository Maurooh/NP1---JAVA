package revisão;

import javax.swing.JOptionPane; // Importação da classe JOptionPane para mexer com o programa por popup

// Classe principal Loja
public class Loja {

    // Método main - ponto de entrada da aplicação
    public static void main(String[] args) {
        int opcao, codigo; // Declaração das variáveis para opção do menu e código do produto
        Produto[] produtos = new Produto[3]; // Criação de um array de produtos com capacidade para 3 pedidos
        String descricao; // Variável para armazenar a descrição do produto
        float preco; // Variável para armazenar o preço do produto
        Produto prod; // Declaração de uma variável do tipo Produto

        // Loop para cadastrar 3 produtos
        for (int i = 0; i < 3; i++) {
            // Solicita ao usuário a escolha do tipo de produto a ser cadastrado (1 - Livro, 2 - Game)
            opcao = Integer.parseInt(
                    JOptionPane.showInputDialog("Escolha o produto para cadastrar:\n" + "1 - Livro\n2 - Game"));
            
            // Estrutura switch para tratar as opções escolhidas pelo usuário
            switch (opcao) {
                case 1:
                    // Entrada de dados para o Livro
                    codigo = Integer.parseInt(JOptionPane.showInputDialog("Digite o código do Livro"));
                    descricao = JOptionPane.showInputDialog("Digite o nome do Livro");
                    preco = Float.parseFloat(JOptionPane.showInputDialog("Digite o preço do Livro"));
                    String autor = JOptionPane.showInputDialog("Digite o autor do Livro");

                    // Criação de um objeto do tipo Livro
                    prod = new Livro(codigo, descricao, preco, autor);
                    produtos[i] = prod; // Armazena o livro no array de produtos
                    break;
                
                case 2:
                    // Pede os atributos para fornecer
                    codigo = Integer.parseInt(JOptionPane.showInputDialog("Digite o código do Game")); 
                    descricao = JOptionPane.showInputDialog("Digite o nome do Game");
                    preco = Float.parseFloat(JOptionPane.showInputDialog("Digite o preço do Game"));

                    // Criação de um objeto do tipo Game
                    prod = new Game(codigo, descricao, preco);
                    produtos[i] = prod; // Armazena o game no array de produtos
                    break;
                
                default:
                    // Mensagem de erro caso o usuário escolha uma opção inválida
                    JOptionPane.showMessageDialog(null, "Opção inválida!");
            }
        }
        imprime(produtos); // Chama o método imprime para exibir os produtos cadastrados
    }

    // Método para imprimir os produtos cadastrados
    static void imprime(Produto[] produtos) {
        String msg = ""; // Inicializa a mensagem que será exibida
        
        // Percorre o array de produtos
        for (Produto prod : produtos) {
            msg += prod + "\n"; // Adiciona a representação do produto à mensagem
        }
        
        // Exibe a mensagem contendo os detalhes dos produtos cadastrados
        JOptionPane.showMessageDialog(null, msg);
    }
}
