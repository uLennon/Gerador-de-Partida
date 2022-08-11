import java.util.ArrayList;

public class Partida {
	private String data;
	Time casa, fora;
	private int golCasa, golFora;
	private ArrayList<Jogador> jogadorCasa;
	private ArrayList<Jogador> jogadorFora;
	
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
	//exibe o resultado de uma partida
	public void jogou() {
		System.out.println("\nData"+" "+data+"\n"+casa.getNome()+" "+golCasa+"x"+golFora+" "+fora.getNome());
	
		for(Jogador j : jogadorCasa) {
			System.out.println(j.getNome());
		}
		for(Jogador j : jogadorFora) {
			System.out.println("\t   "+j.getNome());
		}
	}
}