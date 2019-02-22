import java.util.*;

class Fibonacci {
    public static int terms = 0;
    public Scanner input = new Scanner(System.in);

    public void getTerms(){
        System.out.print("ENTER NUMBERS OF TERMS :");
        if (input.hasNextInt()){
        this.terms = this.input.nextInt();
        }
        else{
            this.input.nextLine();
            System.out.println("input is not valid term ");
            getTerms();
        }
    }

    public long getNextTerm(long firstTirm, long secondTerm){
        return firstTirm + secondTerm;
    }

    public void printFiboSeries(){
        int noOfTerm = this.terms;
        long firstTerm = 0, secondTerm =1;
        while(noOfTerm>0){
            System.out.print(" "+firstTerm);
            long thirdTerm = getNextTerm(firstTerm,secondTerm);
            firstTerm = secondTerm;
            secondTerm = thirdTerm;
            noOfTerm--;
        }
    }
    public void showFibo(int term, long firstTerm, long secondTerm){
        if (term > 0){
            System.out.print(" "+firstTerm);
            long nextTerm = firstTerm + secondTerm;
            firstTerm = secondTerm;
            secondTerm = nextTerm;
            showFibo(term-1, firstTerm, secondTerm);
        }else{
            System.out.println("Invalid No Of Terms");
        }
    }

    public static void main(String []args){
        Fibonacci fibo = new Fibonacci();
        fibo.getTerms();
        System.out.println("========================== fibonacci using Loops =============================");
        fibo.printFiboSeries();
        System.out.println("\n========================== fibonacci using recursion =============================");
        fibo.showFibo(terms,0,1);
    }
}