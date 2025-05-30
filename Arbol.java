public class Arbol {
 private Nodo raiz;

    public Arbol(){
        raiz = null;
    }

    //metodo para inicializar el arbol
    public void inicializarArbol(){
            raiz = new Nodo(1);
            raiz.izq = new Nodo(4);
            raiz.derecho = new Nodo(22);

            raiz.izq.izq= new Nodo(33);
            raiz.izq.derecho= new Nodo(90);
            raiz.derecho.izq= new Nodo(77);
            raiz.derecho.derecho= new Nodo(11);
    }
        //metodo para recorrer el arbol(InOrder)
     public void Inorder(Nodo nodo){
        if(nodo!=null){
            Inorder(nodo.izq);
            System.out.println(nodo.valor + " ");
            Inorder(nodo.derecho);
                }
            }
    public Nodo getRaiz(){
        return raiz;
    }
 
    public static int alturaArbol(Nodo nodo){
        if(nodo == null){
            return -1;
        }
        else{
            int alturaIzquierda = alturaArbol(nodo.izq);
            int alturaDerecha = alturaArbol(nodo.derecho);
            return Math.max(alturaIzquierda, alturaDerecha) + 1;
        }
    }
   
}
