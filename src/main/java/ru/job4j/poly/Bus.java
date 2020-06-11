package ru.job4j.poly;

public class Bus implements Transport {
    private double gasPrice = 0;
    private int gas = 0;
    private int gasMax;
    private int passengets = 0;
    private int passengetsMax;
    private String nameTransport;

    public Bus(String pNameBus) {
        nameTransport = pNameBus;
        gasMax = 100;
        passengetsMax = 10;
    }

    public void setFuelPrice(double pGasPrice) {
        gasPrice = pGasPrice;
    }

    @Override
    public void goTransport() {
        if (gas > 0 ) {
            gas--;
            System.out.println("Transport GO");
        } else {
            System.out.println("Transport STOP");
        }

    }

    @Override
    public void passengers(int pPassengers) {
        if ((passengetsMax - passengets) > pPassengers) {
            passengets =+ pPassengers;
        } else {
            System.out.println("Everything doesn't fit");
        }
    }

    @Override
    public double gasUp(int pGas) {
        double price = 0;
        if ((pGas + gas) > gasMax ) {
           gas = pGas - (gasMax - gas);
           gas = pGas - gas;
            price = gas * gasPrice;
           System.out.println("Full tank !");
        } else {
            gas =+ pGas;
            price = pGas * gasPrice;
        }
        return price;
    }
}
