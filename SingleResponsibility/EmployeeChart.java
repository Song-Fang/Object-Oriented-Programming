package DesignPattern.SingleResponsibility;

import java.util.Arrays;
import java.util.List;

// I am mainly responsible for getting the results, show the results
// I don't care which database I used
public class EmployeeChart {

    //find the result
    //what if I change my database
    //I need to change my codes
    private Dao dao;
    public EmployeeChart(Dao dao){
        this.dao = dao;
    }

    //show the result
    public void showEmployee(){
        for(Employee e:dao.find()){
            System.out.println(e);
        }
    }
}
