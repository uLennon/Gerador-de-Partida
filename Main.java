import java.io.IOException;

public class Main {

	public static void main(String[] args) throws IOException {
<<<<<<< HEAD
		Time [] time = new Time[2];
		time[0] = new Time("Bayern");
		time[1] = new Time("PSG");
		// adicionar o caminho do aquivo txt entre as ""
		time[0].gera("/home/zin/IdeaProjects/Simulador/src/a.txt");
		time[1].gera("/home/zin/IdeaProjects/Simulador/src/b.txt");

		Jogo jogo = new Jogo();
		jogo.adicionaJogos(time[0],time[1],2);
		time[0].partidasJogadas();
=======

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
>>>>>>> 628cb6fac2c4feee75bc9c9de3fa2ed9fe717dc4
	}
}
