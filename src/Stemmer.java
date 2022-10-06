import java.util.Arrays;

public class Stemmer {

    public static String[] getNGrams(String keyword, int number) {
        keyword = keyword.replaceAll(" ", "");
        String[] array = keyword.split("");
        String[] N_Grams = {};
        if (number != 0) {
            int quantityGrams = 0;

            if (array.length > number){
                for (int i = array.length; i >= number; i--) {
                    quantityGrams++;
                }
            }else{
                quantityGrams=1;
            }

            N_Grams = new String[quantityGrams];

            if (array.length == number) {
                N_Grams[0] = keyword;
            }
            else if(array.length<number){
                String helper = keyword;
                for (int i = keyword.length(); i < number; i++) {
                            helper += "*";
                }
                N_Grams[0] = helper;
            }
            else {
                for (int i = 0; i < quantityGrams; i++) {

                    N_Grams[i] = keyword.substring(0, number);
                    keyword=keyword.substring(1, keyword.length());
                }
            }
            return N_Grams;
        } else {
//            if number is 0 return empty array
            return N_Grams;
        }
    }

    public static String[] getShared(String[] setOfNGrams1, String[] setOfNGrams2 ) {
        int similarity = 0;
        for (int i = 0; i < setOfNGrams1.length; i++) {
            for (int j = 0; j < setOfNGrams2.length; j++) {
                if (setOfNGrams1[i].equals(setOfNGrams2[j])) {
                    similarity++;
                }
            }

        }
        String[] result = new String[similarity];
        int index = 0;
        for (int i = 0; i < setOfNGrams1.length; i++) {
            for (int j = 0; j < setOfNGrams2.length; j++) {
                if (setOfNGrams1[i].equals(setOfNGrams2[j])) {
                    result[index] = setOfNGrams1[i];
                    index++;
                }
            }
        }
        return result;
    }


    public static double getDistance(String[] setOfNGrams1, String[] setOfNGrams2){
        String[] similarity = getShared(setOfNGrams1, setOfNGrams2);
        return (double) similarity.length/(setOfNGrams1.length+setOfNGrams2.length);
    }

    public static boolean isRelevant(String keyword, String text){
        String[] words = text.split("\\s+");

        for (int i = 0; i < words.length; i++) {
            if(getDistance(getNGrams(keyword, 3), getNGrams(words[i], 3)) >0.4)
                return true;
        }

return false;
    }


    public static void main(String[] args) {
        System.out.println("--------------- task 1 ----------------");

        System.out.println(Arrays.toString(getNGrams("house", 3)));
        System.out.println(Arrays.toString(getNGrams("trousers", 3)));


        System.out.println("--------------- task 2 ----------------");
        System.out.println(Arrays.toString(getShared(getNGrams("house", 3), getNGrams("trousers", 3))));

        System.out.println("--------------- task 3 ----------------");
        System.out.println(getDistance(getNGrams("house", 3), getNGrams("trousers", 3)));


        System.out.println("--------------- task 4 ----------------");
        System.out.println(isRelevant("house","trousers"));


        System.out.println(isRelevant("house","the house is clean"));

    }
}
