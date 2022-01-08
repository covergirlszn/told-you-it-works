import java.util.*;
class Main {
  public static void main(String[] args) {
    Scanner kb = new Scanner(System.in);
    System.out.println("enter 4 integers");
    String numString = kb.nextLine();
    //user enters the values for the list
    int cnt = 0;
    int[] nums = new int[4];
    for(int i=0;i<numString.length();i=i+3){
      String num1 = numString.substring(i,i+2);
      nums[cnt]=Integer.parseInt(num1);
      cnt++;
      
    }
    for (int i=0; i<nums.length;i++){
      System.out.println(nums[i]);
    }
  }
}

//this does not work bro, bin it
