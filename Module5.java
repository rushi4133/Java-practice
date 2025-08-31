import java.util.Scanner;

 class Module5 
{
    public static void main(String[] args)
     {
     
                        //average by input values 
     int a = 10;
     int b = 20;
     int c = 30;  

     int avg = (a + b + c) / 3;
     System.out.println("Average is: " + avg);

     //average by user input values
         
        
       int x; 
        
        Scanner sc1 = new Scanner(System.in);   
        System.out.println("Enter the value of x: ");
        x = sc1.nextInt();

        int y;
        Scanner sc2= new Scanner(System.in);
        System.out.println("Enter the value of y: ");
        y = sc2.nextInt();

        int z;
        Scanner sc3 = new Scanner(System.in);
        System.out.println("Enter the value of z: ");
        z = sc3.nextInt();

        int average = (x + y + z) / 3;
        System.out.println("Average is: " + average);






    

     
     
    }
}
