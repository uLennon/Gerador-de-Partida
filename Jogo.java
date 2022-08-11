import java.util.ArrayList;
import java.util.Random;

public class Jogo{

	private Partida partida;
	private int golCasa, golFora;
	private ArrayList<Jogador> jogadorCasa;
	private ArrayList<Jogador> jogadorFora;

	public void partida(Time casa, Time fora) {
		int aux, cont = 0;
		jogadorCasa = new ArrayList<Jogador>();
		jogadorFora = new ArrayList<Jogador>();
		Random rand = new Random();
		
	while(cont < 5) {	
		aux = rand.nextInt(4);
			if(aux==1) {
				aux = rand.nextInt(11);
				if(aux==0) aux=2;
<<<<<<< HEAD
					adicionaGol(casa,aux);
					adicionaGols(casa,aux);
					jogadorCasa.add(casa.getJogadores().get(aux));
					golCasa += 1;								
			}
			else if(aux==0) {
					aux = rand.nextInt(11);
						if(aux==0) aux=3;
							adicionaGol(fora,aux);
							adicionaGols(fora,aux);
							jogadorFora.add(fora.getJogadores().get(aux));
							golFora += 1;
			}
			cont++;
	}
=======
					casa.getJogadores().get(aux).setGols(casa.getJogadores().get(aux).getGols()+1);
					casa.getJogadores().get(aux).setGol(casa.getJogadores().get(aux).getGol()+1);
					jogadorCasa.add(casa.getJogadores().get(aux));
					golCasa += 1;								
			}
			else if(aux==0){
				aux = rand.nextInt(11);
					if(aux==0) aux=3;
						fora.getJogadores().get(aux).setGols(fora.getJogadores().get(aux).getGols()+1);
						fora.getJogadores().get(aux).setGol(fora.getJogadores().get(aux).getGol()+1);
						jogadorFora.add(fora.getJogadores().get(aux));
						golFora += 1;
				}
			else if(aux>1) {
			
			}
			cont++;
		}
>>>>>>> 628cb6fac2c4feee75bc9c9de3fa2ed9fe717dc4
		if(golCasa > golFora) {
			casa.setVitoria(casa.getVitoria()+1);
			fora.setDerrota(fora.getDerrota()+1);
		}
		else if(golFora > golCasa) {
			fora.setVitoria(fora.getVitoria()+1);
			casa.setDerrota(casa.getDerrota()+1);
		}
		else {
			casa.setEmpate(casa.getEmpate()+1);
			fora.setEmpate(fora.getEmpate()+1);
		}
		
		int dia, mes;
		dia = rand.nextInt(30)+1;
		mes = rand.nextInt(12)+1;
<<<<<<< HEAD

=======
		
>>>>>>> 628cb6fac2c4feee75bc9c9de3fa2ed9fe717dc4
		String placar = dia +"/"+ mes;
		partida = new Partida(placar,casa,fora,golCasa,golFora,jogadorCasa,jogadorFora);
	
		casa.getPartidas().add(partida);
		fora.getPartidas().add(partida);	
		
	}

<<<<<<< HEAD
	public int getGolCasa() {
=======
	
	public int getgolCasa() {
>>>>>>> 628cb6fac2c4feee75bc9c9de3fa2ed9fe717dc4
		return golCasa;
	}

	public void setGolCasa(int golCasa) {
		this.golCasa = golCasa;
	}

	public int getGolfora() {
		return golFora;
	}

	public void setGolFora(int golFora) {
		this.golFora = golFora;
	}
<<<<<<< HEAD

	public void adicionaGol(Time time, int num){
		time.getJogadores().get(num).setGol(time.getJogadores().get(num).getGol()+1);
	}
	public void adicionaGols(Time time, int num){
		time.getJogadores().get(num).setGols(time.getJogadores().get(num).getGols()+1);
	}
	public void adicionaJogos(Time casa, Time fora, int quantidade){
		Jogo []jogo = new Jogo[quantidade];
		for(int i = 0; i < quantidade; i++){
			jogo[i] = new Jogo();
			jogo[i].partida(casa,fora);
		}
	}
=======
	
	
	
>>>>>>> 628cb6fac2c4feee75bc9c9de3fa2ed9fe717dc4
}