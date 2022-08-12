import java.util.ArrayList;
import java.util.Random;

public class Jogo {

	private Partida partida;
	private int golCasa, golFora;
	private ArrayList<Jogador> jogadorCasa;
	private ArrayList<Jogador> jogadorFora;

	public void partida(Time casa, Time fora) {
		int probabilidadeDeGols, cont = 0;
		jogadorCasa = new ArrayList<Jogador>();
		jogadorFora = new ArrayList<Jogador>();
		Random rand = new Random();

		while (cont < 5) {
			probabilidadeDeGols = rand.nextInt(4);
			if (probabilidadeDeGols == 1) {

				int probabilidadeDeJogador = rand.nextInt(11);
				while (probabilidadeDeJogador == 0) {
					probabilidadeDeJogador = rand.nextInt(11);

				}
				adicionaGol(casa, probabilidadeDeJogador);
				adicionaGols(casa, probabilidadeDeJogador);

				jogadorCasa.add(casa.getJogadores().get(probabilidadeDeJogador));
				
				golCasa += 1;
			} else if (probabilidadeDeGols == 0) {
				int probabilidadeDeJogador = rand.nextInt(11);
				while (probabilidadeDeJogador == 0) {
					probabilidadeDeJogador = rand.nextInt(11);
				}
				
				adicionaGol(fora,probabilidadeDeJogador);
				adicionaGols(fora, probabilidadeDeJogador);
				
				jogadorFora.add(fora.getJogadores().get(probabilidadeDeJogador));
				golFora += 1;
			}
			cont++;
		}
		if (golCasa > golFora) {
			casa.setVitoria(casa.getVitoria() + 1);
			fora.setDerrota(fora.getDerrota() + 1);
		} else if (golFora > golCasa) {
			fora.setVitoria(fora.getVitoria() + 1);
			casa.setDerrota(casa.getDerrota() + 1);
		} else {
			casa.setEmpate(casa.getEmpate() + 1);
			fora.setEmpate(fora.getEmpate() + 1);
		}

		int dia, mes;
		dia = rand.nextInt(30) + 1;
		mes = rand.nextInt(12) + 1;

		String placar = dia + "/" + mes;
		partida = new Partida(placar, casa, fora, golCasa, golFora, jogadorCasa, jogadorFora);

		casa.getPartidas().add(partida);
		fora.getPartidas().add(partida);

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
	
}