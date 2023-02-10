package Bill;

import java.util.Scanner;

public class FriendsBill {
	public static void main(String[] args) {
	    Scanner scan = new Scanner(System.in);

	    int numFriends = 3;

	    
	    String[] names = new String[numFriends];
	    double[] bills = new double[numFriends];

	    
	    names[0] = "Alamin And Nadia";
	    bills[0] = 51.40 + (8.366 + 8.366);
	    names[1] = "Intishar";
	    bills[1] = 25.50 + 8.366;
	    names[2] = "Mahfuz and Zinia";
	    bills[2] = 45.5 + (8.366 + 8.366);
	        // Git 2nd Update 
	    // >>>>>>>>Bangbang + Tax + tips bills = 41.83 * 5 = 8.36 

	    for (int i = 0; i < numFriends; i++) {
	    	  System.out.println(names[i] + ": $" + bills[i]);
	    	}


	    }
	  }

