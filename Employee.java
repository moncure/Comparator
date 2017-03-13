/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Amy Moncure
 */
import java.util.Comparator;

public class Employee implements Comparator {
    
    private String name;
    private String department;
    private int age;
    
    public Employee(String name, String department, int age){
        this.name = name;
        this.department = department;
        this.age = age;
        
    }
    
    public int compare(Object o1, Object o2){
        //compareTo sorts to Employee objects based on the name.
        //Return negative if Employee1.name comes before Employee2.name
        //return 0 if the names are the same
        //return positive if Employee1.name comes after Employee2.name
        //compareTo ignores case
        
        Employee e1 = (Employee) o1;
        Employee e2 = (Employee) o2;
        return e1.name.compareToIgnoreCase(e2.name);
    }//end compareTo
    
    private boolean compareTest(){
        Employee e1 = new Employee("Wilma","Science",32);
        Employee e2 = new Employee("wilma","math",30);
        
        //expect sort==0;  Same name
        int sort = e1.compare(e1,e2);
        boolean case1 = (sort == 0);
        
        
        return (case1);
        
        
    }
    
    public boolean employeeUnitTest(){
        
    }
    
    public static void main(String[] args){
        Employee e1 = new Employee("fred","math",31);
        if (e1.employeeUnitTest())
            System.out.println("Successful Unit Test");
        else System.out.println("ERROR");
    }//end main
}//end Employee
