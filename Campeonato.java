import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

public class Campeonato {
    private ArrayList<Time> time;
    private ArrayList<Jogador> artilheiros = new ArrayList<>();


    public Campeonato(ArrayList<Time> time) {
        this.time = time;
    }
    // exibe a tabela com a pontuacao de cada time
    public void tabela(){
        Collections.sort(time);
        System.out.println("Nome          "+"PTS  "+" V " +" D "+" E ");
        for(Time times: time){
            System.out.println(times);
        }
    }
    // metedo que armazena e ordena todos os jogadores que fizeram gols do maior para o menor
    public void artilharia(){
        for(int equipe = 0; equipe < 4; equipe++){
            for(int jogador = 0; jogador < 11; jogador++){
                if(time.get(equipe).getJogadores().get(jogador).getGols() > 0){
                    artilheiros.add(time.get(equipe).getJogadores().get(jogador));
                }
            }
        }
        Collections.sort(artilheiros);
        for(Jogador jogador: artilheiros){
            System.out.println(jogador);
        }
    }

    public ArrayList<Time> getTime() {
        return time;
    }
}
