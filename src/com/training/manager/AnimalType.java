package com.training.manager;

import com.training.beans.AnimalShelterBean;
import com.training.ui.AnimalDetails;

public class AnimalType {
	AnimalDetails animalDetails = new AnimalDetails();
	AnimalShelterBean typeOfAnimal = new AnimalShelterBean();

	public void selectAnimalChoice(int animalType) {

		switch (animalType) {
		case 1:
			AddDog addDog = new AddDog();
			typeOfAnimal = AnimalDetails.displayDogDetails();
			typeOfAnimal.setAnimalId(getDogAnimalId());
			addDog.AddDog(typeOfAnimal);
			break;
		case 2:
			AddCat addCat = new AddCat();

			typeOfAnimal = AnimalDetails.displayCatDetails();
			typeOfAnimal.setAnimalId(getCatAnimalId());
			addCat.AddCat(typeOfAnimal);
			break;

		case 3:
			AddParrot addParrot = new AddParrot();
			typeOfAnimal = AnimalDetails.displayParrotDetails();
			typeOfAnimal.setAnimalId(getParrotAnimalId());
			addParrot.AddParrot(typeOfAnimal);
			break;
		}
	
			
	}
	public static int getDogAnimalId() {
		int dogAnimalId;
		if (AddDog.getList().size() == 0) {
			dogAnimalId = 1000;
		} else {
			dogAnimalId = AddDog.getList().size() + 1000;
		}
		dogAnimalId++;
		return dogAnimalId;
	}

	public static int getCatAnimalId() {
		int catAnimalId;
		if (AddCat.getList().size() == 0) {
			catAnimalId = 2000;
		} else {
			catAnimalId = AddCat.getList().size() + 2000;
		}
		catAnimalId++;
		return catAnimalId;
	}

	public static int getParrotAnimalId() {
		int parrotAnimalId;
		if (AddParrot.getList().size() == 0) {
			parrotAnimalId = 3000;
		} else {
			parrotAnimalId = AddParrot.getList().size() + 3000;
		}
		parrotAnimalId++;
		return parrotAnimalId;
	}
}
