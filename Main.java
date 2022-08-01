import java.io.IOException;

public class Main {

	public static void main(String[] args) throws IOException {

		Time [] time = new Time[2];
		
		time[0] = new Time("Bayern");
		time[1] = new Time("PSG");
		time[0].gera("C:/Users/user/Desktop/a.txt");
		time[1].gera("C:/Users/user/Desktop/b.txt");
		
		Jogo []jogo = new Jogo[5]; 
		
		for(int i = 0; i < 2; i++) {
			jogo[i] = new Jogo();
			jogo[i].partida(time[0], time[1]); 
		}
		time[0].partiidas();
	}
}
