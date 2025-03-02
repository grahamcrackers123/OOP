/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.javamaster.oop;

/**
 *
 * @author zach malonjao
 */
public abstract class User {
    
    protected String employeeId;
    protected String lastName;
    protected String firstName;
    protected String birthday;
    protected String address;
    protected String phoneNumber;
    protected String sssNumber;
    protected String philhealthNumber;
    protected String tinNumber;
    protected String pagIbigNumber;
    protected String status;
    protected String position;
    protected String immediateSupervisor;
    protected double basicSalary;
    protected double riceSubsidy;
    protected double phoneAllowance;
    protected double clothingAllowance;
    protected double grossSemiMonthlyRate;
    protected double hourlyRate;
    
     protected User(String employeeId, String lastName, String firstName, String birthday, String address,
                   String phoneNumber, String sssNumber, String philhealthNumber, String tinNumber,
                   String pagIbigNumber, String status, String position, String immediateSupervisor,
                   double basicSalary, double riceSubsidy, double phoneAllowance, double clothingAllowance,
                   double grossSemiMonthlyRate, double hourlyRate) {
        this.employeeId = employeeId;
        this.lastName = lastName;
        this.firstName = firstName;
        this.birthday = birthday;
        this.address = address;
        this.phoneNumber = phoneNumber;
        this.sssNumber = sssNumber;
        this.philhealthNumber = philhealthNumber;
        this.tinNumber = tinNumber;
        this.pagIbigNumber = pagIbigNumber;
        this.status = status;
        this.position = position;
        this.immediateSupervisor = immediateSupervisor;
        this.basicSalary = basicSalary;
        this.riceSubsidy = riceSubsidy;
        this.phoneAllowance = phoneAllowance;
        this.clothingAllowance = clothingAllowance;
        this.grossSemiMonthlyRate = grossSemiMonthlyRate;
        this.hourlyRate = hourlyRate;
    }
  
    public abstract void accessDashboard(User user);
    
    public abstract void accessSalaryCalculation(AccessParameters accessParameters);
    
    public abstract void accessLeave(AccessParameters accessParameters);
    
    
    public double[] CalculatePayroll(Employee emp, String month){
    PayrollCalculator tc = new PayrollCalculator(emp, month);
    tc.calculatePayroll();
    
    double[] payrollData = {tc.getGrossPay(), tc.getMonthlyRate(), tc.getDailyRate(), tc.getSssDeduct(), tc.getPhilHealthDeduct(), tc.getPagibigDeduct(), tc.getWithHoldingTax(), tc.getTotalBenefits(), tc.getTotalDeductions(), tc.getNetPay()};
    return payrollData;
    
    
    
        /*
      INDEX ACCESS GUIDE
        Earnings
            0  Gross Pay
            1  Monthly Rate
            2  Daily Rate
        Deductions
            3 SSS deduction
            4 PhilhHealth Deduction
            5 Pagibig Deduction
            6 WithHolding tax
        Summary
            7 Total Benefits
            8 Total Deductions
            9 Net Pay


        */
  }  
    
    
    
    
    
    
   protected String getEmployeeId() {
        return employeeId;
    }

    protected void setEmployeeId(String employeeId) {
        this.employeeId = employeeId;
    }

    protected String getLastName() {
        return lastName;
    }

    protected void setLastName(String lastName) {
        this.lastName = lastName;
    }

    protected String getFirstName() {
        return firstName;
    }

    protected void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    protected String getBirthday() {
        return birthday;
    }

    protected void setBirthday(String birthday) {
        this.birthday = birthday;
    }

    protected String getAddress() {
        return address;
    }

    protected void setAddress(String address) {
        this.address = address;
    }

    protected String getPhoneNumber() {
        return phoneNumber;
    }

    protected void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    protected String getSssNumber() {
        return sssNumber;
    }

    protected void setSssNumber(String sssNumber) {
        this.sssNumber = sssNumber;
    }

    protected String getPhilhealthNumber() {
        return philhealthNumber;
    }

    protected void setPhilhealthNumber(String philhealthNumber) {
        this.philhealthNumber = philhealthNumber;
    }

    protected String getTinNumber() {
        return tinNumber;
    }

    protected void setTinNumber(String tinNumber) {
        this.tinNumber = tinNumber;
    }

    protected String getPagIbigNumber() {
        return pagIbigNumber;
    }

    protected void setPagIbigNumber(String pagIbigNumber) {
        this.pagIbigNumber = pagIbigNumber;
    }

    protected String getStatus() {
        return status;
    }

    protected void setStatus(String status) {
        this.status = status;
    }

    protected String getPosition() {
        return position;
    }

    protected void setPosition(String position) {
        this.position = position;
    }

    protected String getImmediateSupervisor() {
        return immediateSupervisor;
    }

    protected void setImmediateSupervisor(String immediateSupervisor) {
        this.immediateSupervisor = immediateSupervisor;
    }

    protected double getBasicSalary() {
        return basicSalary;
    }

   

    protected double getRiceSubsidy() {
        return riceSubsidy;
    }

   

    protected double getPhoneAllowance() {
        return phoneAllowance;
    }

 

protected double getGrossSemiMonthlyRate() {
    return grossSemiMonthlyRate;
}



protected double getClothingAllowance() {
    return clothingAllowance;
}



protected double getHourlyRate() {
    return hourlyRate;
}







}
