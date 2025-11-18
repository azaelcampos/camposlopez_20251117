/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package camposlopez_20251117;

/**
 *
 * @author UFG
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        ArbolTernarioRecursivo arbol = new ArbolTernarioRecursivo(13); // es la cantidad de indice
        arbol.insertar('A');//indice 0(raiz)
        arbol.insertar('B');//INDICE1
        arbol.insertar('C');//2
        arbol.insertar('D');//3
        arbol.asignarHijos(0,1,2,3);
        arbol.insertar('E');//4
        arbol.insertar('F');//5
        arbol.insertar('G');//6
        arbol.asignarHijos(1,4,5,6);
        arbol.insertar('H');//7
        arbol.insertar('I');//8
        arbol.insertar('J');//9
        arbol.asignarHijos(2,7,8,9);
        arbol.insertar('K');//10
        arbol.insertar('L');//11
        arbol.insertar('M');//12
        arbol.asignarHijos(3,10,11,12);
        
        System.out.println("RECORRIDO PRE-ORDEN");
        System.out.println("-------------------");
        arbol.recorrerPreOrden(arbol.raiz);
        System.out.println();
        
        System.out.println("RECORRIDO IN-ORDEN");
        System.out.println("-------------------");
        arbol.recorrerInOrden(arbol.raiz);
        System.out.println();
        
        System.out.println("RECORRIDO POST-ORDEN");
        System.out.println("-------------------");
        arbol.recorrerPostOrden(arbol.raiz);
        System.out.println();
        
    }
}
