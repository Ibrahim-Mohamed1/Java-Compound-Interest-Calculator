//Ibrahim Mohamed
package compoundinterestibrahimmohamed;

import javax.swing.JOptionPane;

public class CompoundInterestIbrahimMohamed
{

    public static void main(String[] args)
    {
        double firstMonth;
        double secondMonth;
        double thirdMonth;
        double fourthMonth;
        double fifthMonth;
        double sixthMonth;
        double principle;
        double rate;
        double amount;
        double annualRate;

        principle = Double.parseDouble(JOptionPane.showInputDialog(
                "Please enter your monthly savings contribution?"));

        rate = Double.parseDouble(JOptionPane.showInputDialog(
                "What is your annual interest rate?"));

        annualRate = rate / 100 / 12;

        firstMonth = principle * (1 + annualRate);
        secondMonth = (principle + firstMonth) * (1 + annualRate);
        thirdMonth = (principle + secondMonth) * (1 + annualRate);
        fourthMonth = (principle + thirdMonth) * (1 + annualRate);
        fifthMonth = (principle + fourthMonth) * (1 + annualRate);
        sixthMonth = (principle + fifthMonth) * (1 + annualRate);

        amount = Math.round(sixthMonth * 1000.0) / 1000.0;

        JOptionPane.showMessageDialog(null,
                "Total after 6 months: $" + amount);
    }
};
