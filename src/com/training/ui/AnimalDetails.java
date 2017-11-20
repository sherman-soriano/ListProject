package com.training.ui;

import java.util.Scanner;

import com.training.beans.AnimalShelterBean;

public class AnimalDetails extends AnimalShelterBean {

	public static AnimalShelterBean displayDogDetails() {
		Scanner scan = new Scanner(System.in);
		AnimalShelterBean dogDetails = new AnimalShelterBean();

		System.out.println("Enter Name of dog:");
		dogDetails.setName(scan.nextLine());

		System.out.println("Input age of dog:");
		dogDetails.setAge(scan.nextInt());

		return dogDetails;

	}

	public static AnimalShelterBean displayCatDetails() {
		Scanner scan = new Scanner(System.in);
		AnimalShelterBean catDetails = new AnimalShelterBean();

		System.out.println("Enter Name of cat:");
		catDetails.setName(scan.nextLine());

		System.out.println("Input age of cat:");
		catDetails.setAge(scan.nextInt());

		return catDetails;
	}

	public static AnimalShelterBean displayParrotDetails() {
		Scanner scan = new Scanner(System.in);
		AnimalShelterBean parrotDetails = new AnimalShelterBean();

		System.out.println("Enter Name of parrot:");
		parrotDetails.setName(scan.nextLine());

		System.out.println("Input age of parrot:");
		parrotDetails.setAge(scan.nextInt());

		return parrotDetails;
	}
}
