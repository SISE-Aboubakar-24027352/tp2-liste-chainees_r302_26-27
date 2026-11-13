package exo1;

public class Main {

    public static void main(String[] args) {

        SinglyListClass maListe = new SinglyListClass();

        // ---- Test 1 : liste vide ----
        System.out.println("isEmpty() attendu true  -> " + maListe.isEmpty());
        System.out.println("size() attendu 0        -> " + maListe.size());
        System.out.println("first() attendu null    -> " + maListe.first());
        System.out.println("last() attendu null     -> " + maListe.last());
        System.out.println("removeFirst() attendu null -> " + maListe.removeFirst());


        // ---- Test 2 : addLast sur liste vide ----
        maListe.addLast(5);

        System.out.println("Liste attendue [5]-> " + maListe);
        System.out.println("size() attendu 1  -> " + maListe.size());
        System.out.println("first() attendu 5 -> " + maListe.first());
        System.out.println("last() attendu 5  -> " + maListe.last());


        // ---- Test 3 : plusieurs addLast ----
        maListe.addLast(2);
        maListe.addLast(7);

        System.out.println("Liste attendue [5 -> 2 -> 7] -> " + maListe);
        System.out.println("size() attendu 3 -> " + maListe.size());
        System.out.println("last() attendu 7 -> " + maListe.last());


        // ---- Test 4 : addFirst ----
        maListe.addFirst(1);

        System.out.println("Liste attendue [1 -> 5 -> 2 -> 7] -> " + maListe);
        System.out.println("first() attendu 1 -> " + maListe.first());
        System.out.println("size() attendu 4 -> " + maListe.size());


        // ---- Test 5 : removeFirst ----
        Integer removed = maListe.removeFirst();

        System.out.println("Élément supprimé attendu 1 -> " + removed);
        System.out.println("Liste attendue [5 -> 2 -> 7] -> " + maListe);
        System.out.println("size() attendu 3 -> " + maListe.size());


        // ---- Test 6 : vidage complet de la liste ----
        maListe.removeFirst();
        maListe.removeFirst();
        maListe.removeFirst();

        System.out.println("Liste attendue [] -> " + maListe);
        System.out.println("isEmpty() attendu true -> " + maListe.isEmpty());
        System.out.println("size() attendu 0 -> " + maListe.size());
        System.out.println("removeFirst() attendu null -> " + maListe.removeFirst());


        // ---- Test 7 : suppression du dernier élément ----
        maListe.addFirst(42);
        System.out.println("Liste attendue [42] -> " + maListe);
        removed = maListe.removeFirst();

        System.out.println("Élément supprimé attendu 42 -> " + removed);
        System.out.println("Liste attendue [] -> " + maListe);
        System.out.println("isEmpty() attendu true -> " + maListe.isEmpty());
    }
}
