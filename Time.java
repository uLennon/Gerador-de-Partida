import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class Time {
	private String nome;
	private ArrayList<Jogador> jogadores;
	private int vitoria, derrota,empate;
	private ArrayList<Partida> partidas;
	private int forca;
	private int pontuacao;


	public Time(String nome) {
		this.nome = nome;
		this.jogadores = new ArrayList<Jogador>();
		this.partidas = new ArrayList<Partida>();
		this.forca = 11;
		this.pontuacao = 0;
	}
	public void gera(String n)throws IOException {

		FileInputStream stream = new FileInputStream(n);
		InputStreamReader reader = new InputStreamReader(stream);
		BufferedReader br = new BufferedReader(reader);
		String linha = br.readLine();
		Jogador[] j = new Jogador[11];
		//pegas os jogadores do arquivo e adiciona no array
		for(int i = 0; i < 11; i++) {
			j[i]= new Jogador(linha,1,0);
			jogadores.add(j[i]);
			linha = br.readLine();
		}
		br.close();
	}
	// lista dos os jogadores do time
	public void mostraJogadores() {
		for(int i = 0; i < 11; i++) {
			System.out.println(jogadores.get(i).getNome());
		}
	}
	// exibe todos jogadores que fizeram gols
	public void fezGol() {
		for(int i = 0; i < 11; i++) {
			if(jogadores.get(i).getGols() > 0) {
				System.out.println(jogadores.get(i).getNome() +" Gols: "+jogadores.get(i).getGols());
			}
		}
	}
	// exibe todas as partidas
	public void partidasJogadas() {
		for(int i = 0; i < partidas.size();i++) {
			partidas.get(i).jogou();
		}
	}
	// exibe as vitorias, derrotas e empates do time
	public void estatisticas(){
		System.out.print("\nV / D / E\n");
		System.out.print(getVitoria()+"   "+getDerrota()+"   "+getEmpate());
	}
	
	
	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public ArrayList<Jogador> getJogadores() {
		return jogadores;
	}

	public void setJogadores(ArrayList<Jogador> jogadores) {
		this.jogadores = jogadores;
	}

	public ArrayList<Partida> getPartidas() {
		return partidas;
	}

	public void setPartidas(ArrayList<Partida> partidas) {
		this.partidas = partidas;
	}

	public int getVitoria() {
		return vitoria;
	}

	public void setVitoria(int vitoria) {
		this.vitoria = vitoria;
	}

	public int getDerrota() {
		return derrota;
	}

	public void setDerrota(int derrota) {
		this.derrota = derrota;
	}

	public int getEmpate() {
		return empate;
	}

	public void setEmpate(int empate) {
		this.empate = empate;
	}

	public int getPontuacao() {
		return pontuacao;
	}

	public void setPontuacao(int pontuacao) {
		this.pontuacao = pontuacao;
	}

	public int getForca() {
		return forca;
	}

	public void setForca(int forca) {
		this.forca = forca;
	}

}