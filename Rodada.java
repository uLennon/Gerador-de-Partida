import java.util.ArrayList;

public class Rodada {

    private ArrayList<Partida> partidas;
    private ArrayList<ArrayList<Partida>> rodadas = new ArrayList<>();


    public Rodada() {
        this.partidas = new ArrayList<>();

    }

    public void todasRodadas(){
        for (int i = 0; i < 90; i+=10) {
            for(int j = i; j < i+5;j++) {
                getPartidas().get(j).exibeResultadoPartida();
            }
            System.out.println("\n");
        }
    }

    public void exibeRodada(int n){
        n -= 1;
        ArrayList<Partida> auxRodadas= new ArrayList<>();

        for (int i = 0; i < 90; i+=10) {
            for(int j = i; j < i+5; j++) {
                auxRodadas.add(getPartidas().get(j));
            }
            rodadas.add(auxRodadas);
            auxRodadas = new ArrayList<>();
        }
        for (int i = 0; i < 5; i++) {
            getRodadas().get(n).get(i).exibeResultadoPartida();
        }
        System.out.println();
    }


    public ArrayList<Partida> getPartidas() {
        return partidas;
    }

    public void setPartidas(ArrayList<Partida> partidas) {
        this.partidas = partidas;
    }

    public ArrayList<ArrayList<Partida>> getRodadas() {
        return rodadas;
    }

    public void setRodadas(ArrayList<ArrayList<Partida>> rodadas) {
        this.rodadas = rodadas;
    }
}
