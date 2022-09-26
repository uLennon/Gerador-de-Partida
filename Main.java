import java.io.IOException;
import java.util.ArrayList;

public class Main {

	public static void main(String[] args) throws IOException {
		ArrayList<Time> times = new ArrayList<>();
		Champions campeonato = new Champions(times);
		campeonato.setTimes(times);
		campeonato.geraTimes();

		Partida partida	= new Partida();
		Rodada r = new Rodada();
		partida.jogar(times,r);

		campeonato.classificacaoTimes();
		r.todasRodadas();
		campeonato.exibeArtilheiros();


	}
}