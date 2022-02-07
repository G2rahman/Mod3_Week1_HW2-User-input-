import java.util.*;
    public class prac{
        //Fib
        public static void excercise1(){
            Scanner scan= new Scanner(System.in);
            //System.out.println("How many numbers do you want");
            int num=scan.nextInt();
            int a=0;
            int b=1;
            int c;
            
            for (int i=0; i <= num; i++){
                c=a+b;
                System.out.print( c + " ");    
                a=b;
                b=c;       

            }
        }
        //Palindrome
        public static void excercise2(){
            Scanner scan=new Scanner(System.in);
            //System.out.println("What word do you want to check");
            String word=scan.nextLine();
            int word.length;
            int word=word.length();
            boolean Pali=true;
            for (i=0; i <=word.length(); i++){
            if (string.charAt(i)) !=string.charAt(word.length-1-i){
                Pali=false;
                System.out.println(Word+" is not a palindrome")){
                    break;
                }
                    }
                if (Pali) {
                    System.out.println(Word+" is a palindrome");
                    break;
                    }
                }
                Scanner scanner = new Scanner(System.in);

    public class excercise3{
        System.out.print("enter a number: ");

    int number = scanner.nextInt();
    String numericString = Integer.toString(number);
    int numberOfDigits = numericString.length();
    int sum = 0;

    for (int i = 0; i < numberOfDigits; i++) {
      int digit = Character.getNumericValue( numericString.charAt(i) );
      sum += Math.pow(digit, numberOfDigits);
            }  
        }
        public static void main(String agrs[]){
            System.out.println("Excercise1: How many numbers do you want");
            System.out.println("What word do you want to check");
    }
    