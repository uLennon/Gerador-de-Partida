public class Jogador implements Comparable<Jogador> {
	private String nome;
	private int forca;
	private int gols;
	private int gol;


	public Jogador(String nome, int forca, int gols) {
		this.forca = forca;
		this.nome = nome;
		this.gols = gols;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public int getForca() {
		return forca;
	}
	public void setForca(int forca) {
		this.forca = forca;
	}
	public int getGols() {
		return gols;
	}
	public void setGols(int gols) {
		this.gols = gols;
	}
	public int getGol() {
		return gol;
	}
	public void setGol(int gol) {
		this.gol = gol;
	}

	@Override
	public int compareTo(Jogador outroJogador) {
		if(this.gols < outroJogador.getGols())
			return 1;
		else if(this.gols > outroJogador.getGols())
			return -1;

		return 0;
	}

	@Override
	public String toString() {
		return nome +" - "+ gols;
	}
}