package com.training.manager;

import java.util.ArrayList;
import java.util.List;

import com.training.beans.AnimalShelterBean;

public class AddParrot{
	public static List<AnimalShelterBean> listOfParrots = new ArrayList<AnimalShelterBean>();

	public void AddParrot(AnimalShelterBean animal) {
		listOfParrots.add(animal);	
		
	}
	public static List<AnimalShelterBean> getList() {
		return listOfParrots;
	}
}
