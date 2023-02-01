package fr.eni.demo.bll;

import java.util.List;

import fr.eni.demo.bo.Trainer;

public interface TrainerService {
	void add(String firstName, String lastName, String email);

	List<Trainer> findAll();
}
