package projeto;
public class Projeto {
    public static void main(String[] args){
        Fabrica fabrica = new Fabrica();
        // obj fabrica //
        Transporte obj1;
        obj1 = fabrica.getFabrica(1);
        // obj 1 //
        Transporte obj2;
        obj2 = fabrica.getFabrica(2);
        // obj 2 //
        
        obj1.entregar();
        obj2.entregar();
        obj1.abastecer();
        obj2.abastecer();
        // Metodos entregar e abastecer //
    }
}
