import java.util.Scanner;

class Multiplication {

    int getInteger(){
        Scanner in = new Scanner(System.in);
        int num = in.nextInt();
        return num;
    }

    long getProduct(int num1, int num2){
        long result = (long)num1 * num2;
        return result;
    }

    public static void main(String[] args) {
        Multiplication multiplier = new Multiplication();
        System.out.println("Enter two numbers for product ");
        int num1 = multiplier.getInteger();
        int num2 = multiplier.getInteger();
        long product = multiplier.getProduct(num1, num2);
        System.out.print("Poduct is : " + product);
    }
}