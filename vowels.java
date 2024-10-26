import java.util.Scanner;

public class vowels {
    public static void main(String[] args) {
        Scanner input =new Scanner(System.in);
        System.out.print("Chal be shanne apna khudka ek letter daal, sunna maaa chakkle: ");
        String str = input.next();
        int count = 0;
        for(int i = 0;i<str.length();i++){
            char ch= str.charAt(i);
            if( ch == 'u' || ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' ){
                count ++;
            }
        }
        System.out.print(str+", Tujhe mein "+count+" barr " + "BUCKKEL DU BUCKKLE DU" );
    }
}
