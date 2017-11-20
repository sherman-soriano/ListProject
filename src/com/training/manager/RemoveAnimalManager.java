package com.training.manager;


import com.training.beans.AnimalShelterBean;
import com.training.ui.RemoveAnimalPage;


public class RemoveAnimalManager {
	public void removeAnimal() {
		RemoveAnimalPage removeAnimal = new RemoveAnimalPage();
		int refID = removeAnimal.displayRemove();
		boolean isFound = false;
		
		if (refID < 2000 && refID > 1000) {
		
			for(AnimalShelterBean dog: AddDog.getList()) {
				if(refID == dog.getAnimalId()) {
					isFound = true;
					break;
				}
			}
			if(isFound) {
			AddDog.getList().remove(refID - 1001);
			}else {
				System.out.println("Animal ID not found!");
			}
				
		}else if(refID < 3000 && refID > 2000) {
			for(AnimalShelterBean dog: AddCat.getList()) {
				if(refID == dog.getAnimalId()) {
					isFound = true;
					break;
				}
			}
			if(isFound) {
			AddCat.getList().remove(refID - 2001);
			}else {
				System.out.println("Animal ID not found!");
			}
		}else if(refID < 4000 && refID > 3000) {
			for(AnimalShelterBean dog: AddParrot.getList()) {
				if(refID == dog.getAnimalId()) {
					isFound = true;
					break;
				}
			}
			if(isFound) {
			AddParrot.getList().remove(refID - 3001);
			}else {
				System.out.println("Animal ID not found!");
			}
		}
	}
}
