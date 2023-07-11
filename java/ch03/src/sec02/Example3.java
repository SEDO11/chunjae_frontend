package sec02;

public class Example3 {
    public static void main(String[] args) {
        /*
        do {

        } while ()
         */
        int i = 0;
        int tot = 0;
        do {
            i+=3;
            tot+=i;
        } while(i>=100);
        System.out.println(tot);
    }
}
