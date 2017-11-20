package com.training.ui;

import java.util.Scanner;

import com.training.manager.MainMenuManager;

public class AnimalShelterMainMenu {
	

	public void displayHomePage() {
		Scanner scan = new Scanner(System.in);
		int option;
		System.out.println("Welcome to the Animal Shelter");
		System.out.println("Please Select an Option:");
		System.out.println("[1] Add an Animal");
		System.out.println("[2] Remove an Animal");
		System.out.println("[3] View all Animals");
		
		option = scan.nextInt();
		
		MainMenuManager homePageManager = new MainMenuManager();
		homePageManager.selectOption(option);
	}
}
