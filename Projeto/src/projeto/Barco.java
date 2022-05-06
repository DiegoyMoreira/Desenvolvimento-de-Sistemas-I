package projeto;
public class Barco implements Transporte{
    // Metodo //
    @Override
    public void entregar(){
        System.out.println("Entrega feita com Sucesso!!");
    }
    @Override
    public void abastecer() {
        System.out.println("Abastecendo Barco!!");
    }
}
