package com.company;

import java.util.Scanner;

public class Main {

    static String Input;
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        Customer Cus = new Customer();
        Commercial Co = new Commercial();
        Residential Res = new Residential();
        System.out.println("Are you a customer or a Business?");
        Input = sc.next();
        if(Input.equalsIgnoreCase("customer"))
        {
            System.out.println("Enter name.");
            Input = sc.next();
            Cus.Cus_Name = Input;
            System.out.println("Enter personal phone number.");
            Input = sc.next();
            Cus.Cus_Phone= Input;
            System.out.println("Enter personal address.");
            Input = sc.next();
            Cus.Cus_Add = Input;
            System.out.println("Are you a senior citizen (seniors get 15% off).");
            System.out.println("N/Y");
            Input = sc.next();
            Res.Senior = Input;
            System.out.println("Are you a Residence?");
            System.out.println("N/Y");
            Input = sc.next();
            if(Input.equalsIgnoreCase("N"))
            {
                Res.res = false;
                System.out.println("#Customer Application#");
                System.out.println("Name: " + Cus.Cus_Name);
                System.out.println("Phone number: " + Cus.Cus_Phone);
                System.out.println("Address: " + Cus.Cus_Add);
                System.out.println("Total square feet: " + Cus.Square);
                System.out.println("Total Cost: " + Res.Cost);

            }
            if(Input.equalsIgnoreCase("Y"))
            {
                Res.res = true;
                System.out.println("#Customer Application#");
                System.out.println("Name: " + Cus.Cus_Name);
                System.out.println("Phone number: " + Cus.Cus_Phone);
                System.out.println("Address: " + Cus.Cus_Add);
                System.out.println("Total square feet: " + Cus.Square);
                System.out.println("Total Cost: " + Res.Cost);

            }
            else
            {

            }
        }

        if(Input.equalsIgnoreCase("Business"))
        {
            System.out.println("Enter name.");
            Input = sc.next();
            Cus.Cus_Name = Input;
            System.out.println("Enter personal phone number.");
            Input = sc.next();
            Cus.Cus_Phone = Input;
            System.out.println("Enter address.");
            Input = sc.next();
            Cus.Cus_Add = Input;

            System.out.println("Enter business name.");
            Input = sc.next();
            Co.Prop_Name = Input;
            System.out.println("Enter business phone number.");
            Input = sc.next();
            Co.Prop_Phone = Input;
            Commercial.calculate(Co.Cus, Co.CO_Square, Co.Cost);

            System.out.println("Are you a Residence?");
            System.out.println("N/Y");
            Input = sc.next();
            Residential.calculate(Res.Cost, Input, Res.res, Co, Res.Senior);
            if(Input.equalsIgnoreCase("N"))
            {
                System.out.println("#Business Application#");
                System.out.println("Name: " + Cus.Cus_Name);
                System.out.println("Property name: " + Co.Prop_Name);
                System.out.println("Phone number: " + Cus.Cus_Phone);
                System.out.println("Business number: " + Co.Prop_Phone);
                System.out.println("Address: " + Cus.Cus_Add);
                System.out.println("Total square feet: " + Co.CO_Square);
                System.out.println("Total Cost: " + Res.Cost);

            }
            if(Input.equalsIgnoreCase("Y"))
            {
                System.out.println("#Business Application#");
                System.out.println("Name: " + Cus.Cus_Name);
                System.out.println("Property name: " + Co.Prop_Name);
                System.out.println("Phone number: " + Cus.Cus_Phone);
                System.out.println("Business number: " + Co.Prop_Phone);
                System.out.println("Address: " + Cus.Cus_Add);
                System.out.println("Total square feet: " + Co.CO_Square);
                System.out.println("Total Cost: " + Res.Cost);


            }
            else
            {

            }
        }
    }
}
