package DesignPattern.SingleResponsibility;

public class MainTest {
    public static void main(String[] args) {
        EmployeeChart employeeChart = new EmployeeChart(new Dao());
        employeeChart.showEmployee();
    }
}
