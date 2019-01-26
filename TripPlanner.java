import java.util.*;

public class TripPlanner {

    public static Scanner input = new Scanner(System.in);
    private String name = "";
    private String place = "";
    private int travelDays = 0;
    private double moneyToSpend = 0;
    private String currancySymbol = "";
    private double inOneRupee = 0;

    public void takeIntro(){
        System.out.println("Welcome to Vacation Planner!");
        System.out.print("What is your Name? ");
        this.name = this.input.nextLine();
        System.out.print("Nice to meet You "+this.name+", Where are you travelling :");
        this.place = this.input.nextLine();
        System.out.println("Grate! "+this.place+" sounds like a grate trip");
        System.out.println("************\n");
    }

    public void getTravelDetails(){
        System.out.print("How many days are you going to spend ?");
        this.travelDays = this.input.nextInt();
        System.out.print("How much Money, in Rupee(Indian), You Planning to Spend On your trip? ");
        this.moneyToSpend = this.input.nextDouble();
        System.out.print("What is the currancy Symbol of that country :");
        this.currancySymbol = this.input.next();
        System.out.print("How Many "+ this.currancySymbol +" in Rupees ?");
        this.inOneRupee = this.input.nextDouble();
        System.out.println("**************\n");
    }
    public void showTravelDetails(){
        double hours = this.travelDays*24;
        double minuts = hours*60;
        double perDayCost = this.moneyToSpend / this.travelDays;
        double destCountryMoney = this.moneyToSpend * this.inOneRupee;
        double dayCostInOther = perDayCost * this.inOneRupee;
        System.out.println("If your travelling for "+this.travelDays+" days that is same as "+hours+" and "+minuts+" minuts");
        System.out.println("If you are going to spend "+this.moneyToSpend+" rupee that means per Day you can spend Up to "+perDayCost+" rupee");
        System.out.print("your total budget in "+this.currancySymbol+" is "+ destCountryMoney +" "+this.currancySymbol+", ");
        System.out.println("And you can spend upto "+dayCostInOther+" "+this.currancySymbol+" Per Day ");
        System.out.println("**************\n");
    }
    public void timeInto(){
        System.out.print("What is the time diffrence between your city and destination city?");
        double timeDeff = this.input.nextDouble();
        System.out.println("that means when it is midnight at homeit is "+timeDeff+" at there");
        System.out.println("And when its noon at your home it is "+ ((12.00+timeDeff)%24) +" at there");
        System.out.println("************\n");
    }

    public void areaIntro(){
        System.out.print("What is the square area of your destination place in km2 ?");
        double areaOfDestCountry = this.input.nextDouble();
        System.out.println("in miles2 area is "+(areaOfDestCountry*0.386101919641)+" to trevel");
    }

    public static void main(String arg[]){
        TripPlanner myPlanner = new TripPlanner();
        myPlanner.takeIntro();
        myPlanner.getTravelDetails();
        myPlanner.showTravelDetails();
        myPlanner.timeInto();
        myPlanner.areaIntro();
        System.out.println("*****************************************************\n");
    }
}