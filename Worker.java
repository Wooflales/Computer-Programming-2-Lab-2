public class Worker extends Person {
    private double hourlyPayRate;

    @Override
    public String toString() {
        return "Worker{" +
                super.toString() +
                " hourlyPayRate=" + hourlyPayRate +
                "}";
    }
    public Worker(String id, String firstname, String lastname, String title, int YOB, double hourlyPayRate) {
        super(id, firstname, lastname, title, YOB);
        this.hourlyPayRate = hourlyPayRate;
    }

    public Worker(Person person, int hourlyPayRate)
    {
        super(person.getId(), person.getFirstname(), person.getLastname(), person.getTitle(), person.getYOB());
        this.hourlyPayRate = hourlyPayRate;
    }

    public double getHourlyPayRate() {
        return hourlyPayRate;
    }

    public void setHourlyPayRate(double hourlyPayRate) {
        this.hourlyPayRate = hourlyPayRate;
    }

    public double calculateWeeklyPay(double hoursWorked) {
        double weeklyPay = 0;
        double weeklyPay2 = 0;
        if (hoursWorked < 40) {
            weeklyPay = hourlyPayRate*hoursWorked;
        }
        else if (hoursWorked >= 40) {
            weeklyPay2 = hourlyPayRate*40;
            hourlyPayRate = hourlyPayRate*1.5;
            hoursWorked = hoursWorked-40;
            weeklyPay = hoursWorked*hourlyPayRate;
            weeklyPay = weeklyPay+weeklyPay2;
        }
        return weeklyPay;
    }
    public String displayWeeklyPay(double hoursWorked) {
        double weeklyPay3 = 0;
        double weeklyPay = 0;
        double weeklyPay2 = 0;
        String return1 = "";
        String return2 = "";
        String returnMessage = "";
        if (hoursWorked < 40) {
            weeklyPay = hourlyPayRate*hoursWorked;
            return2 = "They worked "+ hoursWorked + " hours and earned $"+ weeklyPay;
        }
        else if (hoursWorked >= 40) {
            weeklyPay2 = hourlyPayRate*40;
            return1 = "They worked " + hoursWorked + ".";
            hourlyPayRate = hourlyPayRate*1.5;
            hoursWorked = hoursWorked-40;
            weeklyPay = hoursWorked*hourlyPayRate;
            weeklyPay3 = weeklyPay+weeklyPay2;
            return2 = return1 + "The first 40 hours they worked they earned $" + weeklyPay2 + ". The " + hoursWorked + " hours they worked in over time they earned $" + weeklyPay + ". Their total pay is $" + weeklyPay3;
        }
        return return2;
    }

}
