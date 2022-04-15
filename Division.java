import java.util.Scanner;
public class Division {
    public static void main(String[] args) {
        int no1;

        Scanner input = new Scanner(System.in);
        System.out.print("Please Enter Number: ");
        no1 = input.nextInt();

        for (int i=0; i <= no1; i++){
            if (i % 3 == 0 && i % 4 == 0){
                System.out.print(i + "-");
            }
        }
    }
}
