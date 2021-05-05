/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Question12;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
/**
 *
 * @author Hemanth Venkata Reddy Telluri
 */
public class EmployeeDriver {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println("Hemanth Venkata Reddy Telluri");
        ArrayList<Employee> employeeList = new ArrayList<Employee>();
        Employee empobj1 = new Employee(56, "Hemanth", 25000.9);
        employeeList.add(empobj1);
        Employee empobj2 = new Employee(25, "Raghavenra", 12055.8);
        employeeList.add(empobj2);
        Employee empobj3 = new Employee(61, "Sai", 22003.6);
        employeeList.add(empobj3);
        Employee empobj4 = new Employee(74, "Chandra", 4873.8);
        employeeList.add(empobj4);
        Employee empobj5 = new Employee(38, "Madhu", 3984.4);
        employeeList.add(empobj5);
        Employee empobj6 = new Employee(99, "Sravani", 101000.8);
        employeeList.add(empobj6);
        System.out.println("Displaying original Employee List Elements(before sorting):");
        for (Employee employeeList1 : employeeList) {
            System.out.println(employeeList1);
        }
        Collections.sort(employeeList);
        System.out.println("Sorted the list by using empId(Natural Ordering):");
        for (Employee employeeList1 : employeeList) {
            System.out.println(employeeList1);
        }        
        System.out.println("Sorting the Employee details by Salary:");
        for (Employee employeeList1 : employeeList) {
            System.out.println(employeeList1);
        }


        System.out.println("Sorting the Employee details by name:");
        for (Employee employeeList1 : employeeList) {
            System.out.println(employeeList1);
        }
    }
}
