package com.blp.employee;

public class EmployeeWageComputation {
    public static final int  FULL_TIME = 1;
    public static final int  WAGE_PER_HR = 20;

    public static void main(String[] args) {
        System.out.println("Welcome to Employee Wage Computation Program");
        int workingHours = 0;
        int empType = (int) (Math.random() * 100) % 2;
        if (empType == FULL_TIME)
        {
            System.out.println("Employee is Present");

            workingHours = 8;
        } else
        {
            System.out.println("Employee is Absent");

        }
        int wage = workingHours * WAGE_PER_HR;
        System.out.println("Employee Daily Wage is " + wage);
    }
}
