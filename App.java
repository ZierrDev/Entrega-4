public class App {


    public static void main(String[] args) throws Exception {
        Arbol arbol = new Arbol();
        arbol.inicializarArbol();
        
        
        System.out.println("Calcular altura del arbol");
        System.out.println("Altura: "+arbol.alturaArbol(arbol.getRaiz()));
      
    }
}