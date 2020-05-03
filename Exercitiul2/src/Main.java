public class Main {
    public static void main(String[] args) {
        //Numarul cel mai mare intr-un vector.
        int[] array = {10,20,30,40,50,60,70,80,90,100};

        int celMaiMareNr= celMaiMareNr(array);
        System.out.println(celMaiMareNr);

    }
    public static int celMaiMareNr ( int [] array){
        int celMaiMareNr= 10;
        for (int cursor = 0; cursor < array.length; cursor++) {
            if (array[cursor] > celMaiMareNr) {
                celMaiMareNr = array[cursor];
            }
        }
        return celMaiMareNr;
    }

}
