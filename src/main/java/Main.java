import java.util.Scanner;
public class Main{
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        while(in.hasNext()){
            int n = in.nextInt();
            in.nextLine();
            int num = n / 10;
            for(int i = 0 ; i < num ; ++i){
                System.out.print("X");
            }
            n = n %(num * 10);
            switch(n){
                case 1:System.out.println("I");break;
                case 2:System.out.println("II");break;
                case 3:System.out.println("III");break;
                case 4:System.out.println("IV");break;
                case 5:System.out.println("V");break;
                case 6:System.out.println("VI");break;
                case 7:System.out.println("VII");break;
                case 8:System.out.println("VIII");break;
                case 9:System.out.println("IX");break;
                default:System.out.println();
            }
        }
    }
}
