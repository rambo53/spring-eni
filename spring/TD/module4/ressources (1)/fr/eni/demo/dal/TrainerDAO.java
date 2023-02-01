package fr.eni.demo.dal;

import java.util.List;

import fr.eni.demo.bo.Trainer;

public interface TrainerDAO {
	void create(Trainer trainer);

	Trainer read(String email);

	void update(Trainer trainer);

	void delete(String email);

	List<Trainer> findAll();
}
