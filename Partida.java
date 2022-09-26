import java.util.ArrayList;
import java.util.Random;

public class Partida {
	private String data;
	Time casa, fora;
	private int golCasa, golFora;
	private ArrayList<Jogador> jogadorCasa;
	private ArrayList<Jogador> jogadorFora;

	public Partida() {
	}

	public Partida(String data, Time casa, Time fora, int golCasa, int golFora, ArrayList<Jogador> jogadorCasa, ArrayList<Jogador> jogadorFora
	) {
		this.data = data;
		this.casa = casa;
		this.fora = fora;
		this.golCasa = golCasa;
		this.golFora = golFora;
		this.jogadorCasa = jogadorCasa;
		this.jogadorFora = jogadorFora;

	}
	public void criaPartida(Time casa, Time fora, Rodada r) {
		probabilidadeGolsTimes(casa,fora);
		resultadoPartida(casa,fora);
		armazenaPartida(casa,fora, r);
	}
	public void probabilidadeGolsTimes(Time casa, Time fora){
		Random rand = new Random();
		int chanceDeGol, probabilidadeDeGol = 0;
		jogadorCasa = new ArrayList<Jogador>();
		jogadorFora = new ArrayList<Jogador>();

		while (probabilidadeDeGol < 5) {
			chanceDeGol = rand.nextInt(4);

			if (chanceDeGol == 1) {
				golCasa += placar(casa,jogadorCasa);

			} else if (chanceDeGol == 0) {
				golFora += placar(fora,jogadorFora);
			}
			probabilidadeDeGol++;
		}
	}
	// define quem ganhou, perdeu ou empatou
	public void resultadoPartida(Time casa, Time fora){
		if(this.golCasa > this.golFora) {
			timeCasaGanhou(casa,fora);

		} else if (this.golFora > this.golCasa) {
			timeForaGanhou(casa,fora);
		} else {
			timesEmpataram(casa,fora);
		}
	}

	public void timeCasaGanhou(Time casa, Time fora){
		casa.setVitoria(casa.getVitoria() + 1);
		fora.setDerrota(fora.getDerrota() + 1);
		casa.setPontuacao(casa.getPontuacao()+3);
	}
	public void timeForaGanhou(Time casa, Time fora){
		fora.setVitoria(fora.getVitoria() + 1);
		casa.setDerrota(casa.getDerrota() + 1);
		fora.setPontuacao(fora.getPontuacao()+3);
	}
	public void timesEmpataram(Time casa, Time fora){
		casa.setEmpate(casa.getEmpate() + 1);
		fora.setEmpate(fora.getEmpate() + 1);
		casa.setPontuacao(casa.getPontuacao()+1);
		fora.setPontuacao(fora.getPontuacao()+1);
	}

	// guarda o placar com o resultado final da partida
	public void armazenaPartida(Time casa, Time fora, Rodada r){
		Random rand = new Random();
		int dia, mes;
		dia = rand.nextInt(30) + 1;
		mes = rand.nextInt(12) + 1;

		String dataPartida = dia + "/" + mes;
		Partida part = new Partida(dataPartida, casa, fora, golCasa, golFora, jogadorCasa, jogadorFora);
		casa.getPartidas().add(part);
		r.getPartidas().add(part);
		setGolPartida(casa,fora,golCasa,golFora);
		golFora=0;
		golCasa=0;

	}

	public void adicionaGol(Time time, int num) {
		time.getJogadores().get(num).setGols(time.getJogadores().get(num).getGols() + 1);
		time.getJogadores().get(num).setForca(time.getJogadores().get(num).getForca() + 1);
		time.setForca(time.getForca()+1);
	}

	public void adicionaJogos(Time casa, Time fora, int quantidade, Rodada r) {
		for (int i = 0; i < quantidade; i++) {
			criaPartida(casa, fora,r);
		}
	}
	public int placar(Time time, ArrayList<Jogador> jogador) {
		Random rand = new Random();
		int probabilidadeDeJogador = rand.nextInt(11);
		while (probabilidadeDeJogador == 0) {
			probabilidadeDeJogador = rand.nextInt(11);
		}
		adicionaGol(time, probabilidadeDeJogador);
		jogador.add(time.getJogadores().get(probabilidadeDeJogador));

		return 1;
	}
	//Gera as partidas dos times

	public void jogar(ArrayList<Time> time, Rodada r){
		int primeiro=0, ultimo=9;
		for(int i = 0; i < 9; i++){
			primeiro = 0;
			ultimo = 9;
			for(int j = 0; j < 10; j++){
				adicionaJogos(time.get(primeiro),time.get(ultimo),1, r);
				primeiro++;
				ultimo--;
			}
			// faz cada time se enfrentar sem repeticao
			for(int it = 0; it < 1; it++) {
				Time temp = time.get(1);
					for (int j = 1; j < 9; j++) {
						time.set(j, time.get(j + 1));
					}
					time.set(9, temp);
			}
		}
	}

	//exibe o resultado de uma partida com jogadores que fizeram gols
	public void partidaJogada() {
		System.out.println("\nData"+" "+data+"\n"+casa.getNome()+" "+golCasa+"x"+golFora+" "+fora.getNome());

		for(Jogador j : jogadorCasa) {
			System.out.println(j.getNome());
		}
		for(Jogador j : jogadorFora) {
			System.out.println("\t       "+j.getNome());
		}
	}
	// exibe so o placar e os times
	public void exibeResultadoPartida(){
		System.out.println(casa.getNome()+" "+golCasa+"x"+golFora+" "+fora.getNome());
	}

	public void setGolPartida(Time casa, Time fora,int golCasa, int golFora){
		casa.setGolsFeito(casa.getGolsFeito() + golCasa);
		casa.setGolsSofrido(casa.getGolsSofrido() + golFora);

		fora.setGolsFeito(fora.getGolsFeito() + golFora);
		fora.setGolsSofrido(fora.getGolsSofrido() + golCasa);
	}

	public int getGolCasa() {
		return golCasa;
	}

	public void setGolCasa(int golCasa) {
		this.golCasa = golCasa;
	}

	public int getGolFora() {
		return golFora;
	}

	public void setGolFora(int golFora) {
		this.golFora = golFora;
	}

}