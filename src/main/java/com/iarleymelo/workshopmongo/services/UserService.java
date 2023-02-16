package com.iarleymelo.workshopmongo.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.iarleymelo.workshopmongo.domain.User;
import com.iarleymelo.workshopmongo.dto.UserDTO;
import com.iarleymelo.workshopmongo.repository.UserRepository;
import com.iarleymelo.workshopmongo.services.exception.ObjectNotFoundException;

@Service
public class UserService {

	@Autowired
	private UserRepository repo;

	public List<User> findAll() {
		return repo.findAll();
	}

	public User findById(String id) {
		Optional<User> obj = repo.findById(id);
		return obj.orElseThrow(() -> new ObjectNotFoundException("Objeto não encontrado"));
	}
	
	public User insert(User obj) {
		return repo.insert(obj);
	}
	
	public void Delete(String id) {
		findById(id);
		repo.deleteById(id);
	}
	
	public User Update(User obj) {
		User newobj = findById(obj.getId());
		updateData(newobj, obj);
		return repo.save(newobj);
	}
	
	private void updateData(User newobj, User obj) {
		newobj.setName(obj.getName());
		newobj.setEmail(obj.getEmail());
	}

	public User fromDTO(UserDTO objDTO) {
		return new User(objDTO.getId(), objDTO.getName(), objDTO.getEmail());
	}
	
}
