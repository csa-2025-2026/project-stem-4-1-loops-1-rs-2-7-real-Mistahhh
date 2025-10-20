import java.util.Scanner;

public class Main
{
  public static void main(String[] args)
  {
    int count = 3;
    while (count <= 25)
    {
      System.out.println(count);
      count = count + 2;
    }
    // write solutions to problems here
    // Problem 1
    Scanner sc = new Scanner(System.in);
    int num;

    System.out.println("Enter positive numbers and -1 to stop")
    while (num != -1)
    {
      x = sc.nextInt();
      sum += x;
    }
    sum++;
    
    System.out.println("The sum of the numbers is " + num);

    // Problem 2

    int N;
    System.out.println("How many numbers do you want to enter");
    N = sc.nextInt();

    int max;
    int counter = 0;
    int userInput;
    while (counter < N);
    {
      userInput = sc.nextIn();
      if (userInput > max)
      {
        max = input;
      }
      counter++;
    }
    System.out.println("The max is " + max);






    // Problem 3
    String word = Calculator;
    int index = 0;
    while (index < word.length());
    {
      String currentLetter = word.substring(index, index+1);
      if (index = 3)
      {
        currentLetter = "";
        index = 0;
      }
      System.out.print(currentLetter);
      index++;
    }

    sc.close();
  }
}
