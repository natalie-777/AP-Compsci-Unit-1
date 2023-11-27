/****************************************************************************************************************************************
Name: Natalie Nixon 
Date: September 20th, 2023
Purpose of Code: The purpose of this code is to calculate the total points and average grade each time a new score is added to the total.
*****************************************************************************************************************************************/
public class GradesV2
{
    public static void main(String[ ] args)
    {
        //local variables       
        int numTests = 0;    //number of tests        
        int testgrade = 0;       // test grade 
        int totalpoints = 0;       // total points of all test scores   
        double average = 0.0;        // average score of all test scores 
             
                
        //1
         testgrade = 95;      // test grade   
            totalpoints += testgrade;  
                numTests++;             
                    average = ((double)totalpoints / (double)numTests); 
                        System.out.print(" Test # " + numTests); // test number
                             System.out.print("   Test Grade: " + testgrade); // test grade
                                 System.out.print("   Total Points: " + totalpoints); // total points of all tests
                                    System.out.println("   Average Score: " + average); // Average of all tests scores
        
        //2
        testgrade = 73;          
            totalpoints += testgrade;
                 numTests++;
                    average = ((double)totalpoints / (double)numTests);
                        System.out.print(" Test # " + numTests);
                            System.out.print("   Test Grade: " + testgrade);
                                System.out.print("   Total Points: " + totalpoints);
                                    System.out.println("   Average Score: " + average);   
        
       //3
        testgrade = 91;           
            totalpoints += testgrade;
                numTests++;
                    average = ((double)totalpoints / (double)numTests);
                        System.out.print(" Test # " + numTests);
                            System.out.print("   Test Grade: " + testgrade);
                                System.out.print("   Total Points: " + totalpoints);
                                    System.out.println("   Average Score: " + average);
        
        //4
        testgrade = 82;           
            totalpoints += testgrade; 
                numTests++;
                    average = ((double)totalpoints / (double)numTests);
                        System.out.print(" Test # " + numTests);
                            System.out.print("   Test Grade: " + testgrade);
                                System.out.print("   Total Points: " + totalpoints);
                                    System.out.println("   Average Score: " + average);  
        
       //5 ( Natalie's Example #1)
        testgrade = 27;           
            totalpoints += testgrade; 
                numTests++;
                    average = ((double)totalpoints / (double)numTests);
                        System.out.print(" Test # " + numTests);
                            System.out.print("   Test Grade: " + testgrade);
                                System.out.print("   Total Points: " + totalpoints);
                                    System.out.println("   Average Score: " + average);   
   
      //6 ( Natalie's EXample #2)
       testgrade = 52;           
            totalpoints += testgrade; 
                numTests++;
                    average = ((double)totalpoints / (double)numTests);
                        System.out.print(" Test # " + numTests);
                            System.out.print("   Test Grade: " + testgrade);
                                System.out.print("   Total Points: " + totalpoints);
                                    System.out.println("   Average Score: " + average); 
   
   
        //7 ( Natalie's Example #3)
        testgrade = 100;           
            totalpoints += testgrade; 
                numTests++;
                    average = ((double)totalpoints / (double)numTests);
                        System.out.print(" Test # " + numTests);
                            System.out.print("   Test Grade: " + testgrade);
                                System.out.print("  Total Points: " + totalpoints);
                                    System.out.println("   Average Score: " + average); 
       
       //8 ( Natalie's Example #4)
        testgrade = 93;           
            totalpoints += testgrade; 
                numTests++;
                    average = ((double)totalpoints / (double)numTests);
                        System.out.print(" Test # " + numTests);
                            System.out.print("   Test Grade: " + testgrade);
                                System.out.print("   Total Points: " + totalpoints);
                                    System.out.println("   Average Score: " + average); 
        
        //9 ( Natalie's Example #5)
        testgrade = 90;           
            totalpoints += testgrade; 
                numTests++;
                    average = ((double)totalpoints / (double)numTests);
                         System.out.print(" Test # " + numTests);
                            System.out.print("   Test Grade: " + testgrade);
                                System.out.print("   Total Points: " + totalpoints);
                                    System.out.println("   Average Score: " + average); 
    }//end of main method
}//end of class
