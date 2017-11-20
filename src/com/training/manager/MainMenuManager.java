package com.training.manager;




import com.training.ui.AddAnimalMenu;
import com.training.ui.RemoveAnimalPage;
import com.training.ui.ViewAllAnimals;

public class MainMenuManager {
	public static void selectOption(int option) {

		switch (option) {
		case 1: 
			if(AddDog.getList().size() + AddCat.getList().size()+ AddParrot.getList().size() == 10){
				System.out.println("The Animal Shelter is now full. Thank you!");
			}else {
				AddAnimalMenu addAnimalPage = new AddAnimalMenu();
			
			int animalChoice = addAnimalPage.displayAddMenu(); 

			AnimalType animalType = new AnimalType();
			animalType.selectAnimalChoice(animalChoice);

			addAnimalPage.displaySuccessfulAdd();
			}
			break;
		case 2: 
			RemoveAnimalManager removeManager = new RemoveAnimalManager();
			removeManager.removeAnimal();
			RemoveAnimalPage removeAnimal = new RemoveAnimalPage();
			removeAnimal.displayRemovedAnimal();
			break;

		case 3: 
			if (AddDog.getList().size() == 0 && AddCat.getList().size() == 0
					&& AddParrot.getList().size() == 0) {
				System.out.println("The Animal Shelter is empty.");
			} else {
				ViewAllAnimals viewAllAnimalPage = new ViewAllAnimals();
				viewAllAnimalPage.dispalyAllAnimals();
			}
			break;
		}
	}
}
