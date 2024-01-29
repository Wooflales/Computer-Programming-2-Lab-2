
import java.util.ArrayList;
public class InheritanceDemo {
    public static void main(String[] args) {
        ArrayList<Worker> thelist = new ArrayList<>();
        Worker matthew = new Worker("1", "Matthew", "Brown", "Mr.", 2004, 16);
        Worker gary = new Worker("2", "Gary", "Lopez", "Mr.", 2002, 15);
        Worker ashley = new Worker("3", "Ashley", "Feng", "Ms.", 2003, 18);
        SalaryWorker henry = new SalaryWorker("4", "Henry", "Grove", "Mr.", 2000, 0, 50000);
        SalaryWorker sarah = new SalaryWorker("5", "Sarah", "Green", "Ms.", 1998, 0, 55000);
        SalaryWorker mary = new SalaryWorker("6", "Mary", "Bet", "Ms.", 1999, 0, 53000);
        thelist.add(matthew);
        thelist.add(gary);
        thelist.add(ashley);
        thelist.add(henry);
        thelist.add(sarah);
        thelist.add(mary);
        // Simulate 3 weekly pay periods

        for (int week = 1; week <= 3; week++) {

            System.out.println("Week " + week + " Payroll:");

            System.out.println("----------------------------");



            // Workers

            System.out.println("Workers:");

            displayWeeklyPay(thelist, week, 40);



            System.out.println("----------------------------\n");

        }

    }



    private static void displayWeeklyPay(ArrayList<? extends Worker> workers, int week, int hoursWorked) {

        for (Worker worker : workers) {

            double weeklyPay = worker.calculateWeeklyPay(hoursWorked);

            System.out.printf("%s %s:\t$%.2f%n", worker.getFirstname(), worker.getLastname(), weeklyPay);

        }

    }

}
