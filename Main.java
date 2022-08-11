import java.io.IOException;

public class Main {

	public static void main(String[] args) throws IOException {
		Time [] time = new Time[2];
		time[0] = new Time("Bayern");
		time[1] = new Time("PSG");
		// adicionar o caminho do aquivo txt entre as ""
		time[0].gera("/home/zin/IdeaProjects/Simulador/src/a.txt");
		time[1].gera("/home/zin/IdeaProjects/Simulador/src/b.txt");

		Jogo jogo = new Jogo();
		jogo.adicionaJogos(time[0],time[1],2);
		time[0].partidasJogadas();
		time[0].estatisticas();

	}
}
