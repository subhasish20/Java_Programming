import java.util.Scanner;

public class sem_calculator {
    static Scanner s = new Scanner(System.in);

    public static void main(String[] args)
    {
        int take_sem_num = 0;
        System.out.println("Enter the semster number :");
        take_sem_num = s.nextInt();

        if(take_sem_num == 1)
        {
            semester_1();
        }
        else if (take_sem_num == 2)
        {
            //semester_2();
        }
        else if (take_sem_num == 3)
        {
            //semester_3();
            System.out.println("hiii");
        }
        else if (take_sem_num == 4)
        {
            //semester_4();
        }
        else if (take_sem_num == 5)
        {
            //semester_5();
        }
        else if (take_sem_num == 6)
        {
           //semester_6();
        }
        else
        {
            System.out.println("Invalid semester number , \n Thank You visit again");
        }

    }
    static void take_input_data()
    {
        
    }
        // declaring the funnctions for taking the data input from the user
    static void semester_1()
    {
        int sub_1_1,sub_1_2,sub_1_3,sub_1_4,sub_1_5,sub_1_6;
        System.out.println("Enter the marks of subject one :");
        sub_1_1 = s.nextInt();
        System.out.println("Enter the marks of subject two :");
        sub_1_2 = s.nextInt();
        System.out.println("Enter the marks of subject three :");
        sub_1_3 = s.nextInt();
        System.out.println("Enter the marks of subject four :");
        sub_1_4 = s.nextInt();
        System.out.println("Enter the maarks of subject five :");
        sub_1_5 = s.nextInt();
        System.out.println("Enter the marks of subject six :");

        sub_1_6 = s.nextInt();
        int secure_sem1;
        float percentage_sem1;
        float cgpa_sem1;
        secure_sem1 = (sub_1_1 + sub_1_2 + sub_1_3 + sub_1_4 + sub_1_5 + sub_1_6);

        percentage_sem1 = (float)secure_sem1 / 600 * 100;

        cgpa_sem1 = ((float)percentage_sem1 / 10 ) - 0.5f;

    }

}
