package com.training.ui;

import java.util.Scanner;

import com.training.manager.AddDog;

public class AddAnimalMenu {
	public int displayAddMenu() {
		int animalChoice;
	System.out.println("What Animal are you trying to add?");
	System.out.println("[1] A Dog");
	System.out.println("[2] A Cat");
	System.out.println("[3] A Parrot");
	Scanner animalType = new Scanner(System.in);
	animalChoice = animalType.nextInt();
	
	return animalChoice;
	}
	
	public void displaySuccessfulAdd() {
		System.out.println("Animal is now Added to the Animal Shelter!");
		
	}
}
