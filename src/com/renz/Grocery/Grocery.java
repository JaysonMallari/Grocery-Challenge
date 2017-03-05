package com.renz.Grocery;
/*
 * Grocery Challenge 
 * Jayson Mallari
 */
import java.util.Scanner;
import java.util.ArrayList;
public class Grocery {
	
	public static void main(String[] args){
		Scanner in = new Scanner(System.in);
		ArrayList<String> item = new ArrayList<String>();
		String userItem;
		boolean exist;
		
		// Add 5 item using .add method.
		item.add("hotdogs");
		item.add("soda");
		item.add("meat");
		item.add("bread");
		item.add("rice");
		
		System.out.println(item);
		
		//Ask the user to enter an Item name to search
		System.out.println("Enter your Item");
		userItem = in.next();
		
		
		//pass the return boolean value if the item is found or not
		exist = searchItem(item, userItem);
		
		//if its not found
		if (exist == false){
			//then add the item
			item.add(userItem);
			System.out.println("Item NOT found");
			System.out.println(" :Item \""+userItem+"\" will be added to the list!");
		}
		
		//print the new list
		System.out.println(item);
		
			
	}
	
	public static boolean searchItem(ArrayList<String> item, String key){
		int position = 0;
		
		while((!item.get(position).equals(key)) && (position<item.size())){
			
			System.out.println(position+" : "+item.size());
			System.out.println((item.get(position))+" : "+ key);
			
			 if(position == 4){
				return false;
			}
				position = position + 1	;
		}
		System.out.println("Item FOUND: item#:"+ position);
	return true;
	}

}
