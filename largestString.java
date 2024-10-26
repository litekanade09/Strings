import java.util.Scanner;

public class largestString {
    public static void main(String[] args) {
        String friuts[] = {"apple","mango","pineapple"};
        String largest = friuts[0];
        for(int i = 1;i<friuts.length;i++){
            if(largest.compareTo(friuts[i]) < 0){
                largest = friuts[i];
            }

        }
//        String str= "Prajwal".replace("j","k");
//        System.out.println(str);
        System.out.println(largest);
//        String str = "Prajwal";
//        String str1 = "Santosh";
//        String str2 = "Arati";
//        System.out.println(str.equals(str1) + " "+ str.equals(str2));




    }
//
}
