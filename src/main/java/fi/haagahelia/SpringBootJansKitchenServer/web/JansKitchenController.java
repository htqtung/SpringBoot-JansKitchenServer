package fi.haagahelia.SpringBootJansKitchenServer.web;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import fi.haagahelia.SpringBootJansKitchenServer.domain.User;
import fi.haagahelia.SpringBootJansKitchenServer.domain.UserRepository;

@Controller
public class JansKitchenController {
	@Autowired
    private UserRepository uRepo;
    
    @RequestMapping(value="/userlist")
    public String userList(Model model) {	
        // Fetch all students
        List<User> users = uRepo.findAll();
        
        // Add user list to model and return to view
        model.addAttribute("users", users);
        return "userlist";
    }
}
