package com.company;

import javax.swing.*;

public class Main {

    private static final int HOUR_PRICE = 40;
    private static final int MINUTE_PRICE = 1;

    public static void main(String[] args) {
        int minutesNumber = getTotalMinutesNumber();
        rentInfo(minutesNumber);
    }

    public static int getTotalMinutesNumber() {
        return Integer.parseInt(JOptionPane.showInputDialog(null, "Enter down below the number of minutes you used the equipment:"));
    }

    public static void rentInfo(int minutes) {
        int hoursNumber = minutes / 60;
        int additionalMinutesNumber = minutes % 60;
        int totalPrice = (hoursNumber * HOUR_PRICE) + (additionalMinutesNumber * MINUTE_PRICE);
        JOptionPane.showMessageDialog(null, "You have used the equipment for:\n\nHours - " + hoursNumber + "\nMinutes - " + additionalMinutesNumber + "\n\nThe total price is: " + totalPrice + "$\n");
    }
}
