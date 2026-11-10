package week14_bsit1_2;

public class ForDemo {

    public static void main(String[] args) {
//        int n = 0;
//        while (n < 5) {
//            System.out.println(n);
//            n++;
//        }
//        for(int n = 1; n < 10 ; n++){
//            System.out.println(n);
//        }
        for (int invar = 1; invar <= 10; invar++) {
            if(invar == 5 ){
                return;
            }
            System.out.println(invar);
        }
        System.out.println("Thank you!");
    }

}
