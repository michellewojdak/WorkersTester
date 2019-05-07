package workerstester;

public class HourlyWorker extends Person {

    private double wagePerHour;
    private double hoursPerWeek;

    public HourlyWorker() {
        //Call the default constructor from Person
        super();
        wagePerHour = Math.random() * 10.0 + 15.0;
        hoursPerWeek = 37.0;
    }

    public void displayCheque() {
        System.out.println("Cheque: " + (wagePerHour * hoursPerWeek));
    }

    public String toString() {
        String output = "";
        output += super.toString();
        output += "Wage: " + wagePerHour + "\n";
        output += "Hours Per Week: " + hoursPerWeek + "\n";
        return output;
    }
}
