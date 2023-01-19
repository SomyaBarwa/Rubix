package b;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import b.MprService;

@RestController
@RequestMapping("/add")
public class MprController {
	
	@Autowired
	MprService service;

	@GetMapping("/{id}/{msg}/{link}")
	public void createUser(@PathVariable String id, @PathVariable String msg, @PathVariable Long link) {
		service.createUser(id,msg,link);
	}
	@GetMapping("/1")
	public void BasAbBohotHogaya() {
		ItsShowTime.main(null);
	}
}


//@GetMapping("/loginid/{email}/{password}")
//public void login(@PathVariable String email, @PathVariable String password) {
//	service.checkUser(email, password);
//}
//
//@PostMapping("/loginidpost/")
//public void loginPost(@RequestBody Mpr mpr) {
//	service.checkUser(mpr.getEmail(), mpr.getPassword());
//}
//