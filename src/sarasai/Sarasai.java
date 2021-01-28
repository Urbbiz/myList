/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package sarasai;

public class Sarasai {


    public static void main(String[] args) {
//        MyList ml = new MyList();
        MyLinkedList ml = new MyLinkedList();
        ml.printAll();
        System.out.println(ml.size());
        ml.add("Labas");
        ml.printAll();
        System.out.println(ml.size());
        ml.add("Pasauli");
        ml.printAll();
        System.out.println(ml.size());
        ml.add("!");
        ml.printAll();
        System.out.println(ml.size()); // 3
        System.out.println(ml); // [Labas, Pasauli, !]
        System.out.println(ml.get(1)); // Pasauli
        ml.remove(0);
        System.out.println(ml.size()); // 2
        System.out.println(ml); // [Pasauli, !]
        System.out.println(ml.get(1)); // !
        ml.insert(0, "Vel labas");
        System.out.println(ml.size()); // 3
        System.out.println(ml); // [Vel labas, Pasauli, !]
        ml.set(1, "Aliau");
        System.out.println(ml); // [Vel labas, Aliau, !]
    }

}