import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class Champions implements Camp{
    private ArrayList<Time> time;
    private ArrayList<Jogador> artilheiros = new ArrayList<>();

    public Champions(ArrayList<Time> time) {
        this.time = time;
    }

    public void setTimes(ArrayList<Time> times){
        times.addAll(Arrays.asList(
                new Time("Bayern      "),
                new Time("PSG         "),
                new Time("Real Madrid "),
                new Time("Ajax        "),
                new Time("Tottenham   "),
                new Time("Barcelona   "),
                new Time("chelsea     "),
                new Time("Man. United "),
                new Time("Man. City   "),
                new Time("Juventus    ")));
    }

    public boolean jogadoresGols(int equipe, int jogador){
        if(time.get(equipe).getJogadores().get(jogador).getGols() > 0)
            return true;
        return false;
    }

    public void listaJogadores(){
        for(int equipe = 0; equipe < 10; equipe++){
            for(int jogador = 0; jogador < 11; jogador++){
                if(jogadoresGols(equipe,jogador))
                    setGolArtilheiros(equipe,jogador);
            }
        }
    }

    public void setGolArtilheiros(int equipe, int jogador){
        artilheiros.add(time.get(equipe).getJogadores().get(jogador));
    }
        // exibe os 3 que fizeram mais gols.
    @Override
    public void exibeArtilheiros() {
        listaJogadores();
        Collections.sort(artilheiros);
        System.out.println("Artilharia: ");
        for(int i = 0; i < 3; i++){
            System.out.println(artilheiros.get(i).toString());
        }
    }
    public void geraTimes() throws IOException {
        int i=0;
        for (char c='a';c<'k';c++,i++){
            time.get(i).gera("/home/zin/IdeaProjects/Simulador/src/times/"+c+".txt");
        }
    }
    @Override
    public void classificacaoTimes() {
        Collections.sort(time);
        System.out.println("Nome          "+"PTS  "+" V " +" D "+" E "+" SG ");
        for(Time times: time){
            System.out.println(times);
        }
    }
}
