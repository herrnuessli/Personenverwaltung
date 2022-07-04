package ch.bbw.personenverwaltung;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class MainController {
	private PersonRepository personRepository;

	@Autowired
	public MainController(PersonRepository personRepository){
		this.personRepository = personRepository;
	}

	/*@GetMapping("/")
	public String index() {
		return "index";
	}
	*/

	@GetMapping("/")
	public String homepage(Model model) {
		model.addAttribute("personlist", personRepository.findAll());
		return "index";
	}

}
