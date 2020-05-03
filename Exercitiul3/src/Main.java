public class Main {
    public static void main(String[] args) {
        //Sa se numere cuvintele care au lungime impara si se termina cu litera E intr-un text.

        String text = "Gadesc ca e ceva de scris pe aici este ca ma gandesc sa scriu altceva";
        int nrcuvinte = nrcuvinte(text);
        System.out.println("Numarul de cuvinte este: "+nrcuvinte);

    }
    public static int nrcuvinte (String text){
        int sumaString = 0;
        String [] rezultatsplit = text.split(" ");
        for(int cursor = 0; cursor<rezultatsplit.length;cursor++){
            if(rezultatsplit[cursor].length() %2 !=0 && rezultatsplit[cursor].endsWith("e")){
                return sumaString;
            }
        }
        return sumaString;

    }
}
