public class SalaryWorker extends Worker{
    private double annualSalary;

    @Override
    public String toString() {
        return "SalaryWorker{" +
                super.toString() +
                " annualSalary=" + annualSalary +
                "}";
    }

    public SalaryWorker(String id, String firstname, String lastname, String title, int YOB, double hourlyPayRate, double annualSalary) {
        super(id, firstname, lastname, title, YOB, hourlyPayRate);
        this.annualSalary = annualSalary;
    }
    public SalaryWorker(Worker worker,double annualSalary) {
        super(worker.getId(),worker.getFirstname(), worker.getLastname(), worker.getTitle(), worker.getYOB(),worker.getHourlyPayRate());
        this.annualSalary = annualSalary;
    }

    public double getAnnualSalary() {
        return annualSalary;
    }

    public void setAnnualSalary(double annualSalary) {
        this.annualSalary = annualSalary;
    }
    @Override
    public double calculateWeeklyPay(double hoursWorked) {
        double weeklypay = annualSalary/52;
        return weeklypay;
    }

    @Override
    public String displayWeeklyPay(double hoursWorked) {
        String statement = "";
        double weeklypay = annualSalary/52;
        statement = "The worker makes $"+weeklypay+" every week, out of 52 weeks in a year.";
        return statement;
    }



}
