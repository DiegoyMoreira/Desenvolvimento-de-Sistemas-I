package projeto;
public class Fabrica {
    public Transporte getFabrica(int modal){
        if(modal == 1){ 
            // Traporte barco //
            return new Barco();
        }
        else if(modal == 2){
            // Tranporte caminhao //
            return new Caminhao();
        }
        else
            return null;
  }
}
