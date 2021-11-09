
package nodosim;
import java.util.Scanner;

public class lis {
    Nodo primero = new Nodo();
    Nodo ultimo = new Nodo();
    Scanner teclado = new Scanner (System.in);
    public lis()  {
        primero= null;
        ultimo= null;
    }
    
     //Ls 12,45,14,78    ls. 12->45->14->78-> null
    //primero = 12 ultimo = 78 nuevo = 78
    
    
    public void insertarNodo() {
        Nodo nuevo= new Nodo();
        System.out.print("ingrese el dato para el nuevo nodo: ");
        nuevo.dato = teclado.nextInt();
        if(primero==null) {
            primero = nuevo;
            primero.siguiente = null;
            ultimo = nuevo;
        } else {
            ultimo.siguiente = nuevo;
            nuevo.siguiente = null;
            ultimo = nuevo;
        }
        System.out.print("\n Nodo ingresado\n");
    }
    
    public void mostrar() {
        Nodo actual=new Nodo();
        actual = primero;
        if(primero != null) {
            while (actual != null ) {
                System.out.println("" + actual.dato);
                actual = (Nodo) actual.siguiente;
            }
            
        }else {
            System.out.print("\n la lista se encuentra vecia\n");
            
        }
    }
}

