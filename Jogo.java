import java.util.ArrayList;
import java.util.Random;

public class Jogo {

	private Partida partida;
	private int golCasa, golFora;
	private ArrayList<Jogador> jogadorCasa;
	private ArrayList<Jogador> jogadorFora;

	public void partida(Time casa, Time fora) {
		int chanceDeGol, probabilidadeDeGol = 0;
		jogadorCasa = new ArrayList<Jogador>();
		jogadorFora = new ArrayList<Jogador>();
		Random rand = new Random();

		while (probabilidadeDeGol < 5) {
			chanceDeGol = rand.nextInt(4);
			
			if (chanceDeGol == 1) {
				golCasa += placar(rand, casa, jogadorCasa);
				
			} else if (chanceDeGol == 0) {
				golFora += placar(rand, fora, jogadorFora);
			}
			probabilidadeDeGol++;
		}
		resultadoDaPartida(casa,fora);
		armazenaPartida(casa,fora,rand);
	}
	// define quem ganhou, perdeu ou empatou
	public void resultadoDaPartida(Time casa, Time fora){
		if (getGolCasa() > getGolfora()) {
			casa.setVitoria(casa.getVitoria() + 1);
			fora.setDerrota(fora.getDerrota() + 1);
			casa.setPontuacao(casa.getPontuacao()+3);

		} else if (getGolfora() > getGolCasa()) {
			fora.setVitoria(fora.getVitoria() + 1);
			casa.setDerrota(casa.getDerrota() + 1);
			fora.setPontuacao(fora.getPontuacao()+3);

		} else {
			casa.setEmpate(casa.getEmpate() + 1);
			fora.setEmpate(fora.getEmpate() + 1);
			casa.setPontuacao(casa.getPontuacao()+1);
			fora.setPontuacao(fora.getPontuacao()+1);
		}
	}

	// guarda o placar com o resultado final da partida
	public void armazenaPartida(Time casa, Time fora, Random rand){
		int dia, mes;
		dia = rand.nextInt(30) + 1;
		mes = rand.nextInt(12) + 1;

		String dataPartida = dia + "/" + mes;
		partida = new Partida(dataPartida, casa, fora, golCasa, golFora, jogadorCasa, jogadorFora);

		casa.getPartidas().add(partida);
		fora.getPartidas().add(partida);
	}

	public void adicionaGol(Time time, int num) {
		time.getJogadores().get(num).setGol(time.getJogadores().get(num).getGol() + 1);
		time.getJogadores().get(num).setForca(time.getJogadores().get(num).getForca() + 1);
		time.setForca(time.getForca()+1);
	}

	public void adicionaGols(Time time, int num) {
		time.getJogadores().get(num).setGols(time.getJogadores().get(num).getGols() + 1);
	}

	public void adicionaJogos(Time casa, Time fora, int quantidade) {
		Jogo[] jogo = new Jogo[quantidade];
		for (int i = 0; i < quantidade; i++) {
			jogo[i] = new Jogo();
			jogo[i].partida(casa, fora);
		}
	}
	public int placar(Random rand, Time time, ArrayList<Jogador> jogador) {
		
		int probabilidadeDeJogador = rand.nextInt(11);
		while (probabilidadeDeJogador == 0) {
				probabilidadeDeJogador = rand.nextInt(11);
		}
		adicionaGol(time, probabilidadeDeJogador);
		adicionaGols(time, probabilidadeDeJogador);
		jogador.add(time.getJogadores().get(probabilidadeDeJogador));
		
		return 1;
	}

	public int getGolCasa() {
		return golCasa;
	}

	public void setGolCasa(int golCasa) {
		this.golCasa = golCasa;
	}

	public int getGolfora() {
		return golFora;
	}

	public void setGolFora(int golFora) {
		this.golFora = golFora;
	}
}