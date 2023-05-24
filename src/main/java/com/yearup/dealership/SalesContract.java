package com.yearup.dealership;

public class SalesContract extends Contract {

    protected double salesTax;
    protected int recordingFee;
    protected int processingFee;
    protected boolean finance;





    public SalesContract(String date, String name, String email, double salesTax, int recordingFee, int processingFee, boolean finance) {
        super(date, name, email);
        this.salesTax = salesTax;
        this.recordingFee = recordingFee;
        this.processingFee = processingFee;
        this.finance = false;
    }

    @Override
    public double getTotalPrice(){
        return getVehicleSold().getPrice() + salesTaxAmount + recordingFee + processingFee;
    }

    public double getMonthlyPayment(){
        int numberOfPayments = 0;
        double interestRate = 0;
        if (financeOption) {
            if (getVehicleSold().getPrice() >= 10000) {
                numberOfPayments = 48;
                interestRate = 4.25 / 1200;
            } else {
                numberOfPayments = 24;
                interestRate = 5.25 / 1200;
            }

            double monthlyPayment = getTotalPrice() * (interestRate * Math.pow(1 + interestRate, numberOfPayments)) / (Math.pow(1 + interestRate, numberOfPayments) - 1);
            monthlyPayment = Math.round(monthlyPayment * 100);
            monthlyPayment /= 100;
            return monthlyPayment;
        } else {
            return 0.0;
        }
    }

}
