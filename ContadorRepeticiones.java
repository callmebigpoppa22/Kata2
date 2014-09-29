/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package contadorrepeticiones;

import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;

/**
 *
 * @author usuario
 */
public class ContadorRepeticiones {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int[] vector = {1, 9, 2, 2, 2, 4, 5, 6, 6, 7, 7, 8, 9, 9, 9, 9};
        counter(vector);

    }

    private static void counter(int[] vector) {
        HashMap<Integer, Integer> rep;
        rep = new HashMap();
        for (int i = 0; i < vector.length; i++) {
            if (rep.get(vector[i]) == null) {
                rep.put(vector[i], 1);
            } else {
                rep.put(vector[i], rep.get(vector[i]) + 1);
            }
        }
        Set<Integer> k = rep.keySet();
        Collection<Integer> v = rep.values();
        Iterator iv = v.iterator();
        Iterator ik = k.iterator();
        Integer current_k;
        Integer current_v;
        int keyMax = 0;
        int valueMax = 0;
        while (ik.hasNext()) {
            current_k = (Integer) ik.next();
            current_v = (Integer) iv.next();
            if (current_v > valueMax) {
                valueMax = current_v;
                keyMax = current_k;
            }
        }
        System.out.println("Número: " + keyMax + ", Repeticiones: " + valueMax);

    }
}
// sout +tab -> System.out.println
//fore, fori + tab -> for
