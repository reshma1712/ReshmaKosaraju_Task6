package com.task2.maven.mavenproject;
import java.util.*;
public class customListExample {
	static boolean retrieve(ArrayList<Integer> al , int ele){
		for(int i=0;i<al.size();i++){
			if(al.get(i)== ele){
				return true;
			}
		}
		return false;
	}
	static void remove(ArrayList<Integer> al , int ele){
		for(int i=0;i<al.size();i++){
			if(al.get(i) ==ele){
				al.remove(i);
				System.out.println("Element Deleted Succesfuly");
				return;
			}
		}
	}
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		ArrayList<Integer> al = new ArrayList<Integer>(10);
		for(int i=0;i<10;i++){
			al.add(i);
		}
		System.out.println("List od Created nad Initialized to 10 elements");
		int p =1;
		while(p==1){
			System.out.println("Operations that we can perform on the list are:");
			System.out.println("1.Retrieval of element");
			System.out.println("2.Adding an element into the list");
			System.out.println("3.Removing an element in the list");
			System.out.println("4.Printing the elements in the list");
			int op = sc.nextInt();
			if(op==1){
				System.out.println("Enter a number to Retrieve from the list:");
				int ele = sc.nextInt();
				if(retrieve(al,ele)){
					System.out.println("Element is present in the list:");
				}
				else{
					System.out.println("Element is not present in the list:");
				}
			}
			else if(op==2){
				System.out.println("Enter a number to add to the list:");
				int ele = sc.nextInt();
				al.add(ele);
				System.out.println("Element is added in the list:");
			}
			else if(op==3){
				System.out.println("Enter a number to Remove from the list:");
				int ele = sc.nextInt();
				remove(al,ele);
			}
			else if(op==4){
				System.out.println("Elements in the Array List are: "+al);
				
			}
			else{
				System.out.println("Invalid Option.....");
			}
						
				
			
			System.out.println("press 1 to continue else 0 to break");
 			p = sc.nextInt();
		}
		
	}
}
