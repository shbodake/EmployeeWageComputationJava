package com.blp.employee;

public class EmployeeWageComputation {
    public static final int  FULL_TIME = 1;
    public static final int  PART_TIME = 0;
    public static final int  WAGE_PER_HR = 20;

    public static void main(String[] args) {
        System.out.println("Welcome to Employee Wage Computation Program");
        int workingHours = 0;
        int empType = (int) (Math.random() * 100) % 2;
        int empType1 = (int) (Math.random() * 100) % 3;
        if (empType == FULL_TIME)
        {
            System.out.println("Employee is Present");
            System.out.println("Employee is Present Full time");
            workingHours = 8;
        } else if (empType == PART_TIME)
        {
            System.out.println("Employee is Present Part time");
            workingHours = 4;
        } else
        {
            System.out.println("Employee is Absent");
        }
        int wage = workingHours * WAGE_PER_HR;
        System.out.println("Employee Daily Wage is " + wage);
    }
}

