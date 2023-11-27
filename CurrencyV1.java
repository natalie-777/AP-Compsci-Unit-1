/**
 * The Currency class converts an amount of money from a specific
 * country into the equivalent currency of another country given 
 * the current exchange rate.
 *
 * @author Natalie Nixon
 * @version 09/20/2023
 */
public class CurrencyV1
{
    public static void main(String [ ] args)
    {
        //Declare and initialize local variables
        double startingUsDollars = 6500.00;		// starting US Dollars

        double pesosSpent = 7210.25;            // Mexican Pesos spent
        double pesoExchangeRate = 17.05065;     // 1 US dollar = 19.57852 Pesos
        double dollarsSpentInMexico = 0.0;      // US dollars spent in Mexico
        double dollarsAfterMexico = 0.0;  // US dollars remaining after Mexico
        //remaining variables below here
    
        double bahtSpent = 72719.93;             
            double bahtExchangeRate = 36.06122 ;       
                double dollarsSpentInThailand = 0.0;       
                    double dollarsAfterThailand = 0.0;
        
        double realSpent = 13227.13;           
            double realExchangeRate = 4.858708 ;    
                double dollarsSpentInBrazil = 0.0;       
                    double dollarsAfterBrazil = 0.0;         

        
        
        

        // Message to user stating purpose
        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
        System.out.println("This program converts an amount of money");
        System.out.println("from a specific country into the equivalent");
        System.out.println("currency of another country given the current");
        System.out.println("exchange rate.");
        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
        System.out.println();
        System.out.println("Starting US Dollars:                 " + startingUsDollars);
        System.out.println();
        // Conversion
        // code goes below here
            dollarsSpentInMexico = pesosSpent / pesoExchangeRate;
                 dollarsSpentInThailand = bahtSpent / bahtExchangeRate;
                    dollarsSpentInBrazil = realSpent / realExchangeRate;
                    
                        dollarsAfterMexico = startingUsDollars - dollarsSpentInMexico;
                            dollarsAfterThailand = dollarsAfterMexico - dollarsSpentInThailand;
                                dollarsAfterBrazil = dollarsAfterThailand - dollarsSpentInBrazil;
    System.out.println("Mexico:   ");
        System.out.println(" Pesos spent:            " + pesosSpent);
            System.out.println(" US dollars equivalent:  " + dollarsSpentInMexico);
                System.out.println(" US dollars remaining:   "  +  dollarsAfterMexico);
                    System.out.println(); 
                    
                    
    System.out.println("Thailand   ");
        System.out.println(" Baht spent:              " + bahtSpent);
            System.out.println(" US dollars equivalent:   " + dollarsSpentInThailand);
                System.out.println(" US dollars remaining:    " + dollarsAfterThailand);
                    System.out.println();
                    
    System.out.println("Brazil   ");
        System.out.println(" Real spent:                " + realSpent);
            System.out.println(" US dollars equivalent:     " + dollarsSpentInBrazil);
                System.out.println(" US dollars remaining:      " + dollarsAfterBrazil);
    
    System.out.println("---------------------------------------");
        System.out.println("Remaining US dollars:    " + dollarsAfterBrazil);
            System.out.println();
                System.out.println();
            
    
    


        // Complete the code below for Souvenir Purchases
 		System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
		System.out.println("Souvenir Purchases");
		System.out.println(" (all values in US Dollars) ");
		System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");

		//Calculations for Souvenir #1
		int costItem1 = 12;  						//cost per item of first souvenir
		int budget1 = 100;   						//budget for first item
		int totalItems1 = budget1 / costItem1; 		//how many items can be purchased
		int fundsRemaining1 = budget1 % costItem1;  //how much of the budget is left

		System.out.println("Item 1");
		System.out.println("   Cost per item: $" + costItem1 );
		System.out.println("   Budget: $"+ budget1);
		System.out.println("   Total items purchased: " +  totalItems1);
		System.out.println("   Funds remaining: $"  +  fundsRemaining1);
     	System.out.println();

		//Calculations for Souvenir #2
		double costItem2 = 29.99;  						//cost per item of second souvenir
		int budget2 = 500;   							//budget for second item
		int totalItems2 = (int)(budget2 / costItem2); 	//how many items can be purchased
		double fundsRemaining2 = budget2 % costItem2;  	//how much of the budget is left

		System.out.println("Item 2");
		System.out.println("   Cost per item: $" + costItem2 );
		System.out.println("   Budget: $"+ budget2);
		System.out.println("   Total items purchased: " +  totalItems2);
		System.out.println("   Funds remaining: $"  +  fundsRemaining2);

    } // end of main method
} // end of class

