package com.training.manager;

import java.util.ArrayList;
import java.util.List;

import com.training.beans.AnimalShelterBean;

public class AddCat{
	public static List<AnimalShelterBean> listOfCats = new ArrayList<AnimalShelterBean>();

	public void AddCat(AnimalShelterBean animal) {
		listOfCats.add(animal);
		
	}

	public static List<AnimalShelterBean> getList() {
		return listOfCats;
	}
}
