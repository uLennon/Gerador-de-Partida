import java.io.IOException;

public class Main {

	public static void main(String[] args) throws IOException {
		Time [] time = new Time[2];
		time[0] = new Time("Bayern");
		time[1] = new Time("PSG");

		// adicionar o caminho do aquivo txt entre as ""
		time[0].gera("C:\\Users\\pedro\\OneDrive\\Área de Trabalho\\Projeto Lennon\\Gerador-de-Partida/a.txt");
		time[1].gera("C:\\Users\\pedro\\OneDrive\\Área de Trabalho\\Projeto Lennon\\Gerador-de-Partida/b.txt");

		Jogo jogo = new Jogo();
		jogo.adicionaJogos(time[0],time[1],20);
		//time[0].partidasJogadas();
		System.out.println(time[0].getForca());
		System.out.println(time[1].getForca());
	}
}