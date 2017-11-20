package com.training.manager;

import java.util.List;

import com.training.beans.AnimalShelterBean;

public class ViewAllAnimalsManager {

	public static void viewAllDogs(List<AnimalShelterBean> listOfAnimals) {
		List<AnimalShelterBean> animalListDogs = listOfAnimals;
		for (AnimalShelterBean dog : animalListDogs) {

			System.out.println(dog.getAnimalId() + " Arf...arf I'm " + dog.getName() + " the Dog and I am " + dog.getAge()
					+ " yrs old.");

		}
	}

	public static void viewAllCats(List<AnimalShelterBean> listOfAnimals) {

		List<AnimalShelterBean> animalListCats = listOfAnimals;
		for (AnimalShelterBean cat : animalListCats) {

			System.out.println(cat.getAnimalId() + " Meow...meow I'm " + cat.getName() + " the Cat  and I am "
					+ cat.getAge() + " yrs old.");

		}
	}

	public static void viewAllParrots(List<AnimalShelterBean> listOfAnimals) {

		List<AnimalShelterBean> animalListCats = listOfAnimals;
		for (AnimalShelterBean parrot : animalListCats) {

			System.out.println(parrot.getAnimalId() + " sqwak...sqwak I'm " + parrot.getName() + " the Parrot and I am "
					+ parrot.getAge() + " yrs old.");
		}
	}
}
