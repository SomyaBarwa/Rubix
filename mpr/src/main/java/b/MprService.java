package b;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;
import java.util.Optional;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
@Transactional
public class MprService {

	@Autowired
	private MprRepository repository;

	public void createUser(String id, String msg, Long link){
		Mpr user = new Mpr();
		user.setId(id);
		user.setMsg(msg);
		user.setNumber(link);
		repository.save(user);
		addinfile(id,msg,link);
		ItsShowTime.main(null);
	}
	
	public void addinfile(String id,String msg, long link) {
		try {
			FileWriter f = new FileWriter("data.txt",true);
			BufferedWriter b = new BufferedWriter(f);
			PrintWriter p = new PrintWriter(b);
			p.println();
			p.println(id);
			p.println(msg);
			p.println(link);
			p.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
