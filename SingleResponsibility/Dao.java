package DesignPattern.SingleResponsibility;

import java.util.Arrays;
import java.util.List;

public class Dao {
    public List<Employee> find(){
        List<Employee> employees = Arrays.asList(new Employee(1,"Jack"),new Employee(2,"Zhang"));
        return employees;
    }
}
