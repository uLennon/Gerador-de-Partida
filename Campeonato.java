import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

public class Campeonato {
    private ArrayList<Time> time;

    public Campeonato(ArrayList<Time> time) {
        this.time = time;
    }
    // exibe a tabela com a pontuacao de cada time
    public void tabela(){
        Collections.sort(time);
        System.out.println("Nome          "+"PTS  "+"V " +"D "+"E ");
        for(Time times: time){
            System.out.println(times);
        }
    }

    public ArrayList<Time> getTime() {
        return time;
    }

}
