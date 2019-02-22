import java.util.Random;
import java.util.Scanner;

public class OddsAndEvens {

    public Scanner input = new Scanner(System.in);
    private String name = "";
    private String userChoice = "";
    private String result = "";

    private void getInfo(){
        System.out.println("Lets play game called as odds or even");
        System.out.print("What is your name ? ");
        this.name = this.input.next();
        System.out.println("hii "+this.name);
    }

    private void getOption(){
        System.out.println("Enter your option as \n1.  odd \n2. even");
        this.userChoice = this.input.next();
    }

    private void verifyAnswer(){
        this.getOption();
        if (this.userChoice.equals("odd")){
            System.out.println(this.name +" has picked " + this.userChoice+" so computer will be even ");
        }
        else if(this.userChoice.equals("even")){
            System.out.println(this.name+" has picked  "+ this.userChoice +" so computer will be odd ");
        }
        else {
            System.out.println("Wrong answer try again.............");
            this.verifyAnswer();
        }
    }

    private void startGame(){
        Random random = new Random();
        System.out.print("How many fingers you want to put :  ");
        int userFingers = this.input.nextInt();
        int computerNum = random.nextInt(6);
        int sum = userFingers + computerNum;
        System.out.println("the computer played "+computerNum+" fingers" +"\n----------------------------------------------------\n");
        System.out.println("user fingers + computer fingers = " + sum+"\n---------------------------------------------------------\n");
        if(sum % 2 == 0){
            System.out.println("sum is even");
            this.result = "even";
        }
        else {
            System.out.println("sum is odd");
            this.result = "odd";
        }
    }

    private void showWinner(){
        if(this.userChoice.equals(this.result)){
            System.out.println( "Congratulations winner is  : " + this.name);
        }
        else{
            System.out.println(" Sorry computer won the game ....");
        }
    }

    public static void main(String[] args){
        OddsAndEvens oddsAndEven = new OddsAndEvens();
        oddsAndEven.getInfo();
        oddsAndEven.verifyAnswer();
        oddsAndEven.startGame();
        oddsAndEven.showWinner();
    }
}
