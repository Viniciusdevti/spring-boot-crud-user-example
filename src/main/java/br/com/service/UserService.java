package br.com.simplegym.simplegym.service;



import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.simplegym.simplegym.entity.User;
import br.com.simplegym.simplegym.repository.UserRepository;

@Service
public class UserService {
	
	@Autowired
	private UserRepository repository;
	
	public User saveUser (User user) {
		return repository.save(user);
		
	}
	
	
	
	public List<User> getUsers(){
		
		return repository.findAll();
	}

	public User getUserById(int id) {
        return repository.findById(id).orElse(null);
    }
	
	
	
	  public String deleteUser(int id) {
	        repository.deleteById(id);
	        return "user removed !! " + id;
	    }

	    public User updateUser(User user) {
	        User existingUser = repository.findById(user.getId()).orElse(null);
	        existingUser.setName(user.getName());
	        existingUser.setData(user.getData());
	        existingUser.setTypeUser(user.getTypeUser());
	        existingUser.setCpf(user.getCpf());
	        existingUser.setEmail(user.getEmail());
	        
	        return repository.save(existingUser);
	    }
	
}
