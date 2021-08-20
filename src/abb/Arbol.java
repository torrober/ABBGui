/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package abb;


import javax.swing.JOptionPane;
import javax.swing.JPanel;

/**
 *
 * @author guest
 */
public class Arbol {

    NodoB Padre;
    NodoB Raiz;

    //Constructor
    public Arbol() {
        Raiz = null;
    }

    //Insercion de un elemento en el arbol
    public void insertaNodo(int Elem) {
        if (Raiz == null) {
            Raiz = new NodoB(Elem);
        } else {
            Raiz.insertar(Elem);
        }
    }

    //Escribir arbol
    public void escribir(NodoB Nodo) {
        if (Nodo == null) {
            return;
        } else {
            System.out.print(Nodo.dato + " ");
            escribir(Nodo.Hizq);
            escribir(Nodo.Hder);
        }
    }

    //Preorden Recursivo del arbol
    public void preorden(NodoB Nodo) {
        if (Nodo == null) {
            return;
        } else {
            System.out.print(Nodo.dato + " ");
            preorden(Nodo.Hizq);
            preorden(Nodo.Hder);
        }
    }

    //PostOrden recursivo del arbol
    public void postOrden(NodoB Nodo) {
        if (Nodo == null) {
            return;
        } else {
            postOrden(Nodo.Hizq);
            postOrden(Nodo.Hder);
            System.out.print(Nodo.dato + " ");
        }
    }

    //Inorden Recursivo del arbol
    public void inorden(NodoB Nodo) {
        if (Nodo == null) {
            return;
        } else {
            inorden(Nodo.Hizq);
            System.out.print(Nodo.dato + " ");
            inorden(Nodo.Hder);
        }
    }

//cantidad de niveles que posee el arbol
    public int altura(NodoB Nodo) {
        if (Nodo == null) {
            return 0;
        } else {
            return 1 + Math.max(altura(Nodo.Hizq), altura(Nodo.Hder));
        }
    }
//cantidad de nodos que posee el arbol	

    public int tamaño(NodoB Nodo) {
        if (Nodo == null) {
            return 0;
        } else {
            return 1 + tamaño(Nodo.Hizq) + tamaño(Nodo.Hder);
        }
    }

//cantidad de nodos hojas que posee el arbol	
    public int hojas(NodoB Nodo) {
        if (Nodo == null) {
            return 0;
        } else if (Nodo.Hizq == null && Nodo.Hder == null) {
            return 1;
        } else {
            return hojas(Nodo.Hizq) + hojas(Nodo.Hder);
        }
    }

    //cantidad de nodos completos que posee el arbol	
    public int completos(NodoB Nodo) {
        int cont = 0;
        if (Nodo != null) {
            cont = completos(Nodo.Hizq) + completos(Nodo.Hder);
            if (Nodo.Hizq != null && Nodo.Hder != null) {
                cont = cont + 1;
            }
        }
        return cont;
    }

//Busca un elemento en el arbol
    public void buscar(int Elem, NodoB A) {
        if (A == null) {
            JOptionPane.showMessageDialog(null, "Nodo no encontrado ");
        } else if (A.dato == Elem) {
            JOptionPane.showMessageDialog(null, "Nodo encontrado ");
        } else if (Elem > A.dato) {
            buscar(Elem, A.Hder);
        } else {
            buscar(Elem, A.Hizq);
        }
    }

    public NodoB getRaiz() {
        return Raiz;
    }

    public void ordenPorNiveles() {
        int altura = altura(Raiz);
        for (int i = 1; i <= altura; i++) {
            nivel(Raiz, i);
        }
    }

    private void nivel(NodoB Raiz, int i) {
        if (Raiz == null) {
            return;
        }
        if (i == 1) {
            System.out.print(Raiz.getDato() + " ");
        } else if (i > 1) {
            nivel(Raiz.getIzquierda(), i - 1);
            nivel(Raiz.getDerecha(), i - 1);
        }
    }

}
