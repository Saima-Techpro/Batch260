package day11loops;

public class ForLoop02 {
    public static void main(String[] args) {

        // Find the sum of the integers from 3 to 9

        int sum = 0; // 0 is considered identity element for addition operations
        for (int i= 3; i<9; i++){
            sum += i;   // sum + i;

        }
        System.out.println("sum = " + sum);


        // Find the multiplication of the integers from 3 to 9

        int multiplication = 1; // 1 is considered identity element for addition operations

        for (int i= 3; i<9;  i++){

            multiplication = multiplication * i;

        }
        System.out.println("multiplication = " + multiplication);


        // Interview question
        // Calculate the total value of the digits in the given integer
        // 678 => 6+7+8 => 21
        // HINT:  Use % and division operation

        int sum1 =0;

        for (int i = 678; i >0; i /=10){  // i = i/10 , i = i-1; OR  i -= 1;

              sum1 = sum1+i%10;
        }
        System.out.println("sum1 = " + sum1);

        //Homework: Calculate total value of first two digits and last two digits in the given integer
        // 1997 => 19 + 97 = 116
        //decrement can be done by dividing by 100



    }
}
