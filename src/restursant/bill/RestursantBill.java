/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package restursant.bill;

import java.text.DecimalFormat;

/**
 *
 * @author seden0957
 */
public class RestursantBill {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        DecimalFormat x = new DecimalFormat ("###.##");
        double meal, tax, total;
        meal = 10.95;
        tax = meal*.13;
        total = meal + tax;
        System.out.println("Resturant Bill\n**************\n" + "Meal:      $"+ (x.format(meal)) + "\nHST:       $" + (x.format(tax)) + "\nTotal:     $" + (x.format(total)) );
    }
    
}
