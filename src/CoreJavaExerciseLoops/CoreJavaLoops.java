package CoreJavaExerciseLoops;

public class CoreJavaLoops {
    public static void main(String[] args) {
//        Write a program that uses a for-loop to loop through the numbers 1-10 and
//        prints out each number.
          for(int i = 1; i <= 10; i++) {
              System.out.println(i);
          }
//
//        Write a program that uses a while loop to loop through the numbers 0-100 in
//        increments of 10 and prints out each number.
          int j = 0;
          while(j <= 100) {
              System.out.println(j);
              j = j+10;
          }
//
//        Write a program that uses a do-while-loop to loop through the numbers 1-10 and
//        prints out each number.
          int k = 0;
          do {
              k++;
              System.out.println(k);

          } while (k <= 9);

//        Write a program that uses a for-loop to loop through the numbers 1-100.
//        Print out each number if is a multiple of 5, but do not print out any numbers
//        between 25 and 75. Use the “continue” statement to accomplish this.
          for(int m = 1; m <= 100; m++) {
              if(m > 25 && m < 75) {
                  m++;
              }
              else if(m % 5 == 0) {
                  System.out.println(m);
                  m++;
              }
          } // not sure how to use the continue statement here.
//
//        Write a program that uses a for-loop to loop through the numbers 1-100.
//        Print out each number if is a multiple of 5, but do not print out any numbers
//        greater than 50. Use the “break” keyword to accomplish this.
          for(int n = 1; n <= 100; n++) {
              if(n % 5 == 0) {
                  System.out.println(n);
                  n++;
              } else if (n > 50) {
                  break;
              }
          }

//        Write a program that uses nested for-loops to output the following:
//        Week 1:
//        Day 1
//        Day 2
//        Day 3
//        Day 4
//        Day 5
//        Week 2:
//        Day 1
//        Day 2
//        Day 3
//        Day 4
//        Day 5

          for(int w = 1; w <= 2; ++w) {
              System.out.println("Week " + w + ":");
              for(int day = 1; day <= 5; ++day) {
                  System.out.println("Day " + day);
              }
          }
//        Write a program that returns all the available palindromes within 10 and 200.
//        The following output will be produced:
//        11, 22, 33, 44, 55, 66, 77, 88, 99, 101, 111, 121, 131, 141, 151, 161, 171, 181, 191,t num1;
          int num;
          int numRev;

//        Write a program that prints the Fibonacci Sequence from 0 to 50. The following output
//        will be produced: 0, 1, 1, 2, 3, 5, 8, 13, 21, 34,
          int firstNum = 0;
          int secondNum = 1;
          for(int p = 1; p <= 50; ++p) {
              System.out.print(firstNum + " + ");
              int sum = firstNum + secondNum;
              firstNum = secondNum;
              secondNum = sum;
              if(sum > 50) {
                  break;
              }
          }
          System.out.print("34\n");
//
//        Write a program that nests a for-loop inside another. Print out the inner and outer
//        variable (e.g., i or j) in the inner loop (e.g.,
//        System.out.println("Inner loop: i: " + i + ", j: " + j);).
          for(int r = 1; r <= 10; ++r) {
              System.out.println(r);
              for(int s = 1; s <= 10; ++s) {
                  System.out.println(s);
              }
          }
    }
}
