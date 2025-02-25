/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.javamaster.oop;

/**
 *
 * @author zach malonjao
 */
public class PayrollCalculator extends AbstractDeductionCalculator {
    
    private double monthlyValue;
    private String month;
    
    PayrollCalculator(Employee emp, String month){
        super(emp);
        this.month=month;
        
    }
    double dailyRate;
   
    double monthlyBasicSalary;
    double allAllowances;
    double grossPay;
    double netPay;
    
    
    public void calculatePayroll(){
        
        dailyRate = emp.getHourlyRate()*8;  
       
        monthlyValue = getMonthlyValue(month);
            monthlyBasicSalary = Math.round(dailyRate * monthlyValue * 100.0) / 100.0;
            allAllowances = getAllowances(emp);
           
        grossPay = monthlyBasicSalary+allAllowances;
        
        totalDeduction = calculateTotalDeduction(monthlyBasicSalary);
            taxableIncome = monthlyBasicSalary-totalDeduction; 
            withHoldingTax = calculateWithHoldingTax(taxableIncome);
        
            
        //PROBLEM WITH WITHHOLDINGTAX    
        netPay = grossPay -withHoldingTax-totalDeduction ;
        System.out.println(totalDeduction);
        
        
    }
    
    //STUFF TO OUTPUT
    
    
  
    //EARNINGS
    
        public double getGrossPay(){
            return grossPay;
        }
        public double getMonthlyRate(){
            return monthlyBasicSalary;
        }

        public double getDailyRate(){
            return dailyRate;
        }
    //Deductions    
        public double getSssDeduct(){
            return sssDeduct;
        }

        public double getPhilHealthDeduct(){
            return philHealthDeduct;
        }

        public double getPagibigDeduct(){
            return pagibigDeduct;
        }

        public double getWithHoldingTax(){
            return withHoldingTax;
        }
    //Summary
        
        public double getTotalBenefits(){
            return allAllowances;
        }
        
        public double getTotalDeductions(){
            return totalDeduction + withHoldingTax;
        }
    
        public double getNetPay(){
             return netPay;
        }
    
    
}
