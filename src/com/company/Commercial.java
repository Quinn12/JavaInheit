package com.company;

public class Commercial
{
    String Prop_Name;
    String Prop_Phone;
    double CO_Square = 100000;
    double Cost =0;
    Customer Cus = new Customer();

    public static double calculate(Customer Cus, double CO_Square, double Cost)
    {
        int C_Square_Hold =0;
        if(Cus.Square > 0)
        {
            Cost = Cus.Square / 5d;
            return Cost;

        }
        return Cost;
    }
}
