package com.yearup.dealership;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

public class ContractDataManager {

    public void saveContract(){
        Vehicle vehicle = null;
        ArrayList<Contract> contracts = new ArrayList<>();


            try (BufferedReader reader = new BufferedReader(new FileReader("dealership.csv"))) {
                String line;

                while ((line = reader.readLine()) != null) {
                    String[] fields = line.split("\\|");
                    if (Contract instanceof SalesContract) {
                        int vin = Integer.parseInt(fields[0]);
                        int year = Integer.parseInt(fields[1]);
                        String make = fields[2];
                        String model = fields[3];
                        String vehicleType = fields[4];
                        String color = fields[5];
                        int odometer = Integer.parseInt(fields[6]);
                        double price = Double.parseDouble(fields[7]);
                        contract = new Vehicle(vin, year, make, model, vehicleType, color, odometer, price);
                        contracts.add(contract);

                }
            } catch (IOException e) {
                e.printStackTrace();
            }

        } catch (IOException e) {
                throw new RuntimeException(e);
            }

    }




}
