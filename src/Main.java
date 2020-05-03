public class Main {
    public static void main(String[] args) {
        //O functie care primeste 2 stringuri ca parametru si verifica daca al 2 lea string exista in primul string

        String text = "Chiar e necesar acest pneumomicroscopicosilicovolcaniconioza?";
        String text2 = "Ana are mere si pere, si nu da la nimeni.";
        boolean contains = contains(text,text2);

    }

    public static boolean contains(String text, String text2){
        boolean rezultat = text.contains(text2);
        System.out.println("Rezultat adevarat sau fals: "+rezultat);
        return rezultat;

    }

}
