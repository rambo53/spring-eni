package fr.eni.demo.bll;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import fr.eni.demo.bo.Trainer;
import fr.eni.demo.dal.TrainerDAO;

@Service
public class TrainerServiceImpl implements TrainerService {
	private TrainerDAO trainerDAO;
	
	@Autowired
	public TrainerServiceImpl(TrainerDAO trainerDAO) {
		this.trainerDAO = trainerDAO;
	}
	
	@Override
	public void add(String firstName, String lastName, String email) {
		Trainer trainer = new Trainer(firstName, lastName, email);
		trainerDAO.create(trainer);
	}

	@Override
	public List<Trainer> findAll() {
		return trainerDAO.findAll();
	}
}
