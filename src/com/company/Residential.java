package com.company;

public class Residential
{
    Main m = new Main();
    String StringM = m.Input;
    Customer Cus = new Customer();
    Commercial Co = new Commercial();
    double Cost =0;
    boolean res = false;
    String Senior;
    public static double calculate(double Cost, String StringM, boolean res, Commercial Co, String Senior)
    {
        if(StringM.equalsIgnoreCase("Customer"))
        {
            if (res == false) {
                if (Senior.equalsIgnoreCase("Y")) {
                    Cost = Cost - 0.15;
                    return Cost;
                }
                if (Senior.equalsIgnoreCase("N")) {
                    return Cost;
                }
            }
            if (res == true) {
                if (Senior.equalsIgnoreCase("Y")) {
                    Cost = Cost - 0.15;
                    return Cost;
                }
                if (Senior.equalsIgnoreCase("N")) {
                    return Cost;
                }
            }
        }

        if(StringM.equalsIgnoreCase("Business"))
        {
            if (res == false) {
                if (Senior.equalsIgnoreCase("Y")) {
                    Cost = Co.Cost - 0.15;
                    return Cost;
                }
                if (Senior.equalsIgnoreCase("N")) {
                    return Cost;
                }
            }
            if (res == true) {
                if (Senior.equalsIgnoreCase("Y")) {
                    Cost = Co.Cost - 0.15;
                    return Cost;
                }
                if (Senior.equalsIgnoreCase("N")) {
                    return Cost;
                }
            }
        }
        return Cost;
    }
}
