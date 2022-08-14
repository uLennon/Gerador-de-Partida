import java.io.IOException;
import java.util.ArrayList;

public class Main {

	public static void main(String[] args) throws IOException {

		ArrayList<Time> time = new ArrayList<>();

		time.add(new Time("Bayern      "));
		time.add(new Time("PSG         "));
		time.add(new Time("Real Madrid "));
		time.add(new Time("Ajax        "));
		time.add(new Time("Tottenham   "));
		time.add(new Time("Barcelona   "));
		time.add(new Time("chelsea     "));
		time.add(new Time("Man. United "));
		time.add(new Time("Man. City   "));
		time.add(new Time("Juventus    "));

		// adicionar o caminho do aquivo txt entre as ""
		time.get(0).gera("/home/zin/IdeaProjects/Simulador/src/times/a.txt");
		time.get(1).gera("/home/zin/IdeaProjects/Simulador/src/times/b.txt");
		time.get(2).gera("/home/zin/IdeaProjects/Simulador/src/times/c.txt");
		time.get(3).gera("/home/zin/IdeaProjects/Simulador/src/times/d.txt");
		time.get(4).gera("/home/zin/IdeaProjects/Simulador/src/times/e.txt");
		time.get(5).gera("/home/zin/IdeaProjects/Simulador/src/times/f.txt");
		time.get(6).gera("/home/zin/IdeaProjects/Simulador/src/times/g.txt");
		time.get(7).gera("/home/zin/IdeaProjects/Simulador/src/times/h.txt");
		time.get(8).gera("/home/zin/IdeaProjects/Simulador/src/times/i.txt");
		time.get(9).gera("/home/zin/IdeaProjects/Simulador/src/times/j.txt");

		Jogo jogo = new Jogo();
		jogo.jogar(time,10);
		Campeonato camp = new Campeonato(time);
		camp.tabela();
	}
}