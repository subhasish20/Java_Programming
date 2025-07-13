import java.util.Scanner;

class cgpa
{
    static Scanner s = new Scanner(System.in);
    public static void main(String[] args)
    {   
        // declaring all the variables required for the calculation of the cgpa and percentage. 
        int sem_name, core_1, core_2, elective, Ethiscs_and__value, AECC;

        // taking the semester name input from the user.
        System.out.println("Enter the semester name :");
        sem_name = s.nextInt();

        // taking the marks input from the user
        System.out.println("Enter the marks secure on core_1 :");
        core_1 = s.nextInt();
        System.out.println("Enter the marks secure on core_2 :");
        core_2 = s.nextInt();
        System.out.println("Enter the marks secure on elective :");
        elective = s.nextInt();
        System.out.println("Enter the marks secure on Ethics_and__value :");
        Ethiscs_and__value = s.nextInt();
        System.out.println("Enter the marks secure on AECC :");
        AECC = s.nextInt();

        // declaring the variables for the calculation of the percentage and cgpa.
        float percentage ;
        float cgpa ;
        int secure ;

        // calculating the secure marks
        secure = (core_1 + core_2 + elective + Ethiscs_and__value + AECC);

        // calculating the percentage
        percentage = (float)secure/500 * 100;

        // calculating the cgpa
        cgpa = ((float)percentage / 10) - 0.5f ;

        // displaying the secure marks , percentage and cgpa
        System.out.println("Your semester number is : "+sem_name);
        System.out.println("Total marks secure  is :"+secure+" from 500");
        System.out.println("The percentage that you secure in semester " +sem_name+" is  :"+percentage+" %");
        System.out.println("The cgpa that you  have secure in the semester  " +sem_name+" is  :"+cgpa);

        // now showing the grade
       if (cgpa > 9.0) 
       {
        System.out.println("Your grade according to Your cgpa is A");
       }
       else if (cgpa > 6.0) 
       {
        System.out.println("Your grade according to Your cgpa is B");
       }
       else if (cgpa > 3.0) 
       {
        System.out.println("Your grade according to Your cgpa is C");
       }
       else
       {
        System.out.println("Your grade according to Your cgpa is O");
       }

       System.out.println("THANK YOU VISIT AGAIN");

    }
    ;
    
}
