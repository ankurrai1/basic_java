import java.time.temporal.ChronoUnit;
import java.util.Scanner;

public class Crypto {

    public Scanner input = new Scanner(System.in);

    public String normalizeText(String line){
        String newLine = line.replace(" ", "")
                .toUpperCase()
                .replaceAll("[,.;:()?!\"']","");
        return newLine;
    }

    public void greetUser(){
        System.out.print("welcome to Crypto ....................\n please entre your name :" );
        String name = this.input.next();
        System.out.println("nice to see you " + name);
    }

    public String getLine(){
        System.out.println("please enter your line to do oprations :");
        return this.input.nextLine();
    }

    public String shiftAlphabet(int shift){
        int start = 0;
        String result = "";
        if(shift < 0){
            start = (int)'Z' + shift + 1;
        }
        else{
            start = (int)'A' + shift;
        }
        char currChar = (char)start;
        for(; currChar <= 'Z'; ++currChar){
            result += currChar;
        }
        if(result.length() < 26){
            for(currChar = 'A'; result.length()<26; ++currChar){
                result += currChar;
            }
        }
        return result;
    }

    public String caesarify(String info, int key){
        String encripted ="";
        String encriptedAlpha = this.shiftAlphabet(key);
        String alphbet = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        for (int i = 0; i < info.length(); i++) {
            int alphIndex = alphbet.indexOf(info.charAt(i));
            encripted += encriptedAlpha.charAt(alphIndex);
        }
        return encripted;
    }

    public String groupify(String encriptedInfo, int groupIn){
        String grouped = "";
        int noOfX = 0;
        if((encriptedInfo.length()% groupIn) > 0) {
           noOfX = groupIn - (encriptedInfo.length() % groupIn);
        }
        for(int i = 0; i < noOfX; i++){
            encriptedInfo += "x";
        }
        for(int i = 0; i < encriptedInfo.length(); ){
            for(int j = 0; j < groupIn; i++,j++){
                grouped +=encriptedInfo.charAt(i);
            }
            grouped += " ";
        }
        return grouped;
    }

    public static void main(String args[]){
        Crypto crypto = new Crypto();
        crypto.greetUser();
        String mess = crypto.getLine();
        mess = crypto.normalizeText(mess);
        mess = crypto.caesarify(mess ,3);
        mess = crypto.groupify(mess,3);
        System.out.println(mess);
    }
}
