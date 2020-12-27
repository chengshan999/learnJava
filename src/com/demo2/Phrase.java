package com.demo2;
public class Phrase
{
  public static void main(String[] args)
  {
    String[] wordListOne = {"11","22","33","44","55"};

    String[] wordListTwo = {"aa","bb","cc","dd","ee","ff"};

    String[] wordListThree = {"AA","BB","CC","DD","EE","FF"};

    int oneLength = wordListOne.length;
    int twoLength = wordListTwo.length;
    int threeLength = wordListThree.length;

    int randOne = (int) (Math.random() * oneLength);
    int randTwo = (int) (Math.random() * twoLength);
    int randThree = (int) (Math.random() * threeLength);

    String phrase = wordListOne[randOne] + " " +
                    wordListTwo[randTwo] + " " +
                    wordListThree[randThree];

    System.out.print("What we need is a " + phrase);
  }
}
