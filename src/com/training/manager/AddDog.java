package com.training.manager;

import java.util.ArrayList;
import java.util.List;

import com.training.beans.AnimalShelterBean;

public class AddDog {
	public static List<AnimalShelterBean> listOfDogs = new ArrayList<AnimalShelterBean>();

	public void AddDog(AnimalShelterBean animal) {
		listOfDogs.add(animal);

	}

	public static List<AnimalShelterBean> getList() {
		return listOfDogs;
	}

}
