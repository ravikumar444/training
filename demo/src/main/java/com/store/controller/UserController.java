package com.store.controller;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.store.model.User;
import com.store.repository.UserRepo;

@RestController
@CrossOrigin(origins = "http://localhost:4200")
@RequestMapping("/api/v1")

public class UserController {
	@Autowired
    private UserRepo ur;
	
	@GetMapping("/users")
	public List<User> getAllUsers() {
        return ur.findAll();
    }
	@GetMapping("/users/{id}")
    public ResponseEntity<User> getUserById(@PathVariable(value = "id") Long userId)
        throws Exception {
        User user = ur.findById(userId)
          .orElseThrow(() -> new Exception("user not found for this id :: " + userId));
        return ResponseEntity.ok().body(user);
    }
	@PostMapping("/users")
    public User createUser(@Valid @RequestBody User user) {
        return ur.save(user);
    }
	@PutMapping("/users/{id}")
    public ResponseEntity<User> updateUser(@PathVariable(value = "id") Long userId,
         @Valid @RequestBody User userDetails) throws Exception {
        User user = ur.findById(userId)
        .orElseThrow(() -> new Exception("user not found for this id :: " + userId));

        user.setUsername(userDetails.getUsername());
        user.setPassword(userDetails.getPassword());
        user.setCardtype(userDetails.getCardtype());
        final User updatedUser = ur.save(user);
        return ResponseEntity.ok(updatedUser);
    }
	@DeleteMapping("/users/{id}")
    public Map<String, Boolean> deleteUser(@PathVariable(value = "id") Long userId)
         throws Exception {
        User user = ur.findById(userId)
       .orElseThrow(() -> new Exception("user not found for this id :: " + userId));

        ur.delete(user);
        Map<String, Boolean> response = new HashMap<>();
        response.put("deleted", Boolean.TRUE);
        return response;
    }
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

//@PostMapping("/checkuser")
//public String checkuser(@RequestParam String unm, @RequestParam String pwd) { 
//	if(unm.equalsIgnoreCase(pwd)) { 
//		return "valid user"; 
//		}
//		return "Invalid user";
//		}
//
//@GetMapping("/register")
//public String showRegistrationForm(Model model) {
//    model.addAttribute("user", new User());
//     
//    return "signup_form";
//}


}


