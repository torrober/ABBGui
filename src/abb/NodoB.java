/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package abb;

import javax.swing.JOptionPane;

/**
 *
 * @author guest
 */
public class NodoB {

    int dato;
    NodoB Hizq, Hder;

    //Constructores
    NodoB(int Elem) {
        dato = Elem;
        NodoB Hizq, Hder = null;
    }

    public void insertar(int Elem) {
        boolean insercion = true;
        if (Elem < dato) {
            if (Hizq == null) {
                Hizq = new NodoB(Elem);
            } else {
                Hizq.insertar(Elem);
            }
        } else {
            if (Elem > dato) {
                if (Hder == null) {
                    Hder = new NodoB(Elem);
                } else {
                    Hder.insertar(Elem);
                }
            } else {
                insercion = false;
            }
        }
        if(!insercion){
            JOptionPane.showMessageDialog(null, "Insercion fallida");
        }
    }

    public int nodosCompletos(NodoB n) {
        if (n == null) {
            return 0;
        } else {
            if (n.Hizq != null && n.Hder != null) {
                return nodosCompletos(n.Hizq) + nodosCompletos(n.Hder) + 1;
            }
            return nodosCompletos(n.Hizq) + nodosCompletos(n.Hder);
        }
    }

    public int getDato() {
        return dato;
    }

    public NodoB getIzquierda() {
        return Hizq;
    }

    public NodoB getDerecha() {
        return Hder;
    }
    
}
