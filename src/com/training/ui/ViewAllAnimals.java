package com.training.ui;


import com.training.manager.AddCat;
import com.training.manager.AddDog;
import com.training.manager.AddParrot;
import com.training.manager.ViewAllAnimalsManager;

public class ViewAllAnimals extends AddDog{


	public void dispalyAllAnimals() {
		ViewAllAnimalsManager.viewAllDogs(AddDog.getList());
		ViewAllAnimalsManager.viewAllCats(AddCat.getList());
		ViewAllAnimalsManager.viewAllParrots(AddParrot.getList());
	}
}
