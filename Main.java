import java.io.IOException;
import java.util.ArrayList;

public class Main {

	public static void main(String[] args) throws IOException {

		ArrayList<Time> time = new ArrayList<>();

		time.add(new Time("Bayern      "));
		time.add(new Time("PSG         "));
		time.add(new Time("Real Madrid "));
		time.add(new Time("Ajax        "));

		// adicionar o caminho do aquivo txt entre as ""
		time.get(0).gera("/home/zin/IdeaProjects/Simulador/src/a.txt");
		time.get(1).gera("/home/zin/IdeaProjects/Simulador/src/b.txt");
		time.get(2).gera("/home/zin/IdeaProjects/Simulador/src/c.txt");
		time.get(3).gera("/home/zin/IdeaProjects/Simulador/src/d.txt");

		Jogo jogo = new Jogo();
		jogo.adicionaJogos(time.get(0),time.get(1),2);
		jogo.adicionaJogos(time.get(0),time.get(2),2);
		jogo.adicionaJogos(time.get(0),time.get(3),2);
		jogo.adicionaJogos(time.get(1),time.get(2),2);
		jogo.adicionaJogos(time.get(1),time.get(3),2);
		jogo.adicionaJogos(time.get(2),time.get(3),2);

		Campeonato camp = new Campeonato(time);
		camp.tabela();

	}
}