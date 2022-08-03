package com.bridgelabz;
public class EmployeeWages {
	    final int IS_PART_TIME = 1;
	    final int IS_FULL_TIME = 2;
	    final int Emp_Rate_Per_Hr = 20;
	    final int Num_Of_Working_Days = 20;
	    final int Max_Hrs_In_Month = 100;

	    void empcal()
	    {
	        int empHrs = 0 , totalEmpHrs = 0 , totalWorkingDays = 0;
	        while (totalEmpHrs <= Max_Hrs_In_Month &&
	                totalWorkingDays < Num_Of_Working_Days)
	        {
	            totalWorkingDays++;
	            int empCheck = (int) Math.floor(Math.random() * 10) % 3;
	            // System.out.println("Employee is : "+empCheck);
	            switch (empCheck){
	                case IS_PART_TIME:
	                    empHrs = 4;
	                    System.out.println("Employee is Work Part Time ");
	                    break;
	                case IS_FULL_TIME:
	                    empHrs = 8;
	                    System.out.println("Employee is Work Full Time ");
	                    break;
	                default:
	                    empHrs = 0;
	                    System.out.println("Employee is Abesent");
	            }
	            totalEmpHrs+= empHrs;
	            System.out.println("Day: " + totalWorkingDays +"  "+ "Employee working hours:" + empHrs );
	        }
	        int totalEmpWage = totalEmpHrs * Emp_Rate_Per_Hr;
	        System.out.println("Total Employee Wage is "+ totalEmpWage);
	    }

	    public static void main(String args[])
	    {
	        System.out.println("Welcome to Employee Wage Computation Program on Master Branch");
	        EmployeeWages emp=new EmployeeWages();
	        emp.empcal();
	    }
	}

