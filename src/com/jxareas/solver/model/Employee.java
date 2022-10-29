package com.jxareas.solver.model;

import java.text.DecimalFormat;

/**
 *
 * @author Jon Areas, @jxareas
 */
public class Employee {

    private String fullName;

    private String jobPosition;

    private double salary;

    public Employee(String fullName, String jobPosition, double salary) {
        this.fullName = fullName;
        this.jobPosition = jobPosition;
        this.salary = salary;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public String getJobPosition() {
        return jobPosition;
    }

    public void setJobPosition(String jobPosition) {
        this.jobPosition = jobPosition;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = roundTwoDecimals(salary);
    }

    @Override
    public String toString() {
        return "Employee{" + "fullName=" + fullName + ", jobPosition=" + jobPosition + ", salary=" + salary + '}';
    }
    
    private double roundTwoDecimals(double d) {
        DecimalFormat twoDForm = new DecimalFormat("#.##");
        return Double.valueOf(twoDForm.format(d));
    }

    public void increaseSalary() {
        
        switch(getJobPosition()) {
            case "Gerente" -> setSalary(salary * 1.05);
            case "Asistente" -> setSalary(salary * 1.10);
            case "Secretario" -> setSalary(salary * 1.15);
        }
     
    }

}
