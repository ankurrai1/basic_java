import java.util.Scanner;

class PrintJava{
    void printJava(){
        System.out.println("\n printing simply by strings \n===========================================\n");
        System.out.println("         J        A       V          V       A       ");
        System.out.println("         J      A   A      V        V      A   A     ");
        System.out.println("         J     A     A      V      V      A     A    ");
        System.out.println(" J       J    AAAAAAAAA      V   V       AAAAAAAAA   ");
        System.out.println("  JJJJJJJ    A         A       V        A         A  ");
        System.out.println("\n");
    }

    void printChar(String string, int frequency){
        while (frequency > 0) {
            System.out.print(string);
            frequency--;
        }
    }

    void printLetterJ(int rowIndex){
        if (rowIndex < 3){
            this.printChar(" ",8);
            this.printChar("J",1);
        }
        else if(rowIndex == 3){
            this.printChar("j",1);
            this.printChar(" ",7);
            this.printChar("J",1);
        }
        else{
            this.printChar(" ",1);
            this.printChar("J",7);
            this.printChar(" ",1);
        }
    }

    void printLetterA(int rowIndex){
        int base = 5;
        int leftLocation = base - rowIndex;
        int rightLocation = base + rowIndex;
        if (rowIndex == 3) {
            this.printChar(" ",1);
            this.printChar("A",7);
            this.printChar(" ",1);
            return;
        }
        for (int index = 1; index <= 9; index++) {
            if (index == leftLocation || index == rightLocation )
                System.out.print("A");
            else
                System.out.print(" ");
        }
    }

    void printLetterV(int rowIndex){
        int base = 9;
        int leftLocation = rowIndex + 1;
        int rightLocation = base - rowIndex;
        for (int index = 1; index <= 9; index++) {
            if (index == leftLocation || index == rightLocation )
                System.out.print("V");
            else
                System.out.print(" ");
        }
    }

    void printJavaByLoop(){
        System.out.println("\n printing JAVA with help of loops \n===========================================\n");
        for (int i = 0; i < 5; i++) {
            System.out.print("  ");
            this.printLetterJ(i);
            System.out.print("  ");
            this.printLetterA(i);
            System.out.print("  ");
            this.printLetterV(i);
            System.out.print("  ");
            this.printLetterA(i); 
            System.out.println("  ");
        }
    }
    
    public static void main(String[] args) {
        PrintJava java = new PrintJava();
        java.printJava();
        java.printJavaByLoop();
    }
}