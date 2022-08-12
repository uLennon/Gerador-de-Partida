import java.io.IOException;

public class Main {

	public static void main(String[] args) throws IOException {
		Time [] time = new Time[4];
		time[0] = new Time("Bayern");
		time[1] = new Time("PSG");
		time[2] = new Time("Real Madrid");
		time[3] = new Time("Ajax");

		// adicionar o caminho do aquivo txt entre as ""
		time[0].gera("/home/zin/IdeaProjects/Simulador/src/a.txt");
		time[1].gera("/home/zin/IdeaProjects/Simulador/src/b.txt");
		time[2].gera("/home/zin/IdeaProjects/Simulador/src/c.txt");
		time[3].gera("/home/zin/IdeaProjects/Simulador/src/d.txt");

		Jogo jogo = new Jogo();
		jogo.adicionaJogos(time[0],time[1],20);
		jogo.adicionaJogos(time[2],time[3],2);
		time[0].partidasJogadas();

	}
}