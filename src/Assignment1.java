public class Assignment1 {





    //    -------------------------- PART 1 -----------------------------------------

    public static int countSheep(int legs){
        int amount = legs/4;
        return amount;
    }

    public static int furColourRatio(int black, int white){
        if(black>white){
            return 1;
        }
        else if (black <white){
            return -1;
        }
        else{
            return 0;
        }
    }

    public static boolean canFeed(int sheep, double hay){
        double hayStandart = 2.5;
        if (hay/sheep<hayStandart){
            return false;
        }
        else{
            return true;
        }
    }

    public static double calculateSales(int sheep, double value){
        return sheep*value;
    }





//    -------------------------- PART 2 -----------------------------------------

    public int herdDivisors(int sheep){
        int quatityDivisors=0;
        for (int i = 1; i <= sheep ; i++) {
            if (sheep%i==0){
                quatityDivisors++;
            }
        }
        return quatityDivisors;
    }

    public String getColourByID(long ID){

        int divisors =0;
        for (int i = 1; i <=ID ; i++) {
            if (ID%i==0){
                divisors++;
            }
        }


        if (ID%3==0){
            return "black";
        }
        else if(ID%5==0){
            return "brown";
        }
        else if (divisors==2){
            return "lucky";
        }
        else{
            return "white";
        }
    }


    public static void main(String[] args) {
//        System.out.println(countSheep(16));
//        System.out.println(furColourRatio(2, 25));
//        System.out.println(canFeed(2, 3));
//        System.out.println(calculateSales(3, 300.50));
//
// add static to part2 methods to test them (was not mentioned in the assignment)
//        System.out.println(herdDivisors(6));
//        System.out.println(getColourByID(3));
//        System.out.println(getColourByID(4));
//        System.out.println(getColourByID(112));
//        System.out.println(getColourByID(15));
    }
}
