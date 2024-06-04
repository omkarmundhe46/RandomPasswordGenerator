package Task1;

import java.util.Scanner;

public class RandomPasswordGenerator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("how many password you need to genearate : ");
        int total = sc.nextInt();

        System.out.print("entre length of your password : ");
        int length = sc.nextInt();

        String[] randomPasswords = new String[total];
        for (int i = 0; i < total; i++) {
            String randomPassword = "";
            for (int j = 0; j < length; j++) {
                randomPassword += RandomCharacter();
            }
            randomPasswords[i] = randomPassword;
        }
        printPassword(randomPasswords);
    }

    private static void printPassword(String[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
    }

    public static char RandomCharacter(){
        int rand = (int)(Math.random()*62) ;

        if(rand <= 9){
            int ascii = rand + 48;
            return (char)(ascii);
        }
        else if(rand <= 35){
            int ascii = rand + 55;
            return (char)(ascii);
        }
        else{
            int ascii = rand + 55;
            return (char)(ascii);
        }
    }
}
