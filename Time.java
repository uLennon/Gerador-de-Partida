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
	
	
	public Time(String nome) {
		this.nome = nome;
		this.jogadores = new ArrayList<Jogador>();
		this.partidas = new ArrayList<Partida>();
	}
	
	public void gera(String n)throws IOException {
		
		FileInputStream stream = new FileInputStream(n);
		InputStreamReader reader = new InputStreamReader(stream);
        BufferedReader br = new BufferedReader(reader);
        String linha = br.readLine();
		Jogador[] j = new Jogador[11];
		
		for(int i = 0; i < 11; i++) {
			j[i]= new Jogador(linha,1,0);
			jogadores.add(j[i]);
			linha = br.readLine();
		}
		br.close();
	}
	public void timee() {	
		for(int i = 0; i < 11; i++) {
			System.out.println(jogadores.get(i).getNome());
		}
	}
	public void fezGol() {
		for(int i = 0; i < 11; i++) {
			if(jogadores.get(i).getGols()>0) {
				System.out.println(jogadores.get(i).getNome() +" Gols: "+jogadores.get(i).getGols());
			}
		}
	}

	public void partiidas() {
		for(int i = 0; i < partidas.size();i++) {			
			partidas.get(i).jogou();			
		}
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
}
