public class Controle {
	// atributos privados ArrayList listaJogador e listaEquipe
	
	public Controle(){
        // instanciar ArrayList listaJogador e listaEquipe
	}
	
	public void cadastraJogador(String nome, String posicao){
	// instanciar classe Jogador e adicionar no ArrayList listaJogador
	}
	
	public void cadastraEquipe(String nome){
	// instanciar classe Equipe e adicionar no ArrayList listaEquipe
	}
	
	public void contrataJogador(String equipe, String jogador){
	/* Percorrer o ArrayList listaEquipe e localizar a equipe informada no parâmetro equipe
	 * Se encontrou a equipe, percorrer o ArrayList listaJogador e localizar o jogador informado no parâmetro jogador.
	 * Se encontrou o jogador, então adicionar o jogador na equipe
	 */
	}

	public void demiteJogador(String equipe, String jogador){
	/* Percorrer o ArrayList listaEquipe e localizar a equipe informada no parâmetro equipe
	 * Se encontrou a equipe, percorrer o ArrayList listaJogador e localizar o jogador informado no parâmetro jogador.
	 * Se encontrou o jogador, então remover o jogador da equipe
	 */
	}
	
	public String listarJogadores(String equipe){
	/* Percorrer o ArrayList listaEquipe e localizar a equipe informada no parâmetro equipe
	 * Se encontrou a equipe, chamar o método da classe Equipe que retorna o nome dos jogadores
	 */
	}
	
	public String listarJogadoresPosicao(String posicao){
	/* Percorrer o ArrayList listaJogador e retornar o nome dos jogadores que atuam na posição informada no parâmetro.
	 */
	}
}
