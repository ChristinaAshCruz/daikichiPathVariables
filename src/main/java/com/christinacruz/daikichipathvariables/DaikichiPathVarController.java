package com.christinacruz.daikichipathvariables;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/daikichi")
public class DaikichiPathVarController {
	@RequestMapping("/{name}")
	public String index(@PathVariable("name") String name) {
		return "Welcome " + name + "!";
	}
	@RequestMapping("/today/{objectFound}")
	public String today(@PathVariable("objectFound") String objectFound) {
		return "Today you will find " + objectFound + " in all your endeavors!";
	}
	@RequestMapping("/tomorrow")
	public String tomorrow() {
		return "Tomorrow, an opportunity will arise, so be sure to be open to new ideas!";
	}
	
	// new routes:
	@RequestMapping("/travel/{location}")
	public String travelMessage(@PathVariable("location") String travel) {
		return "Congratulations! You will soon travel to " + travel + "!";
	}
	
	@RequestMapping("/lotto/{number}")
	public String lottoMessage(@PathVariable("number") Integer number) {
		if (number % 2 == 0) {
			return "You will take a grand journey in the near future, but be weary of tempting offers.";
		} else {
			return "You have enjoyed the fruits of your labor but now is a great time to spend time with family and friends.";
		}
	}
	
	
}
