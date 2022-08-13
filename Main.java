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

		for(int i = 0; i<4;i++){
			for(int j=0; j<4;j++){
				jogo.adicionaJogos(time.get(i),time.get(j),1);
			}
		}

		Campeonato camp = new Campeonato(time);
		camp.tabela();
		System.out.println("\n");
		camp.artilharia();

	}
}