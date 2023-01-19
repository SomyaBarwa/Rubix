package b;

import java.io.Serializable;
import javax.persistence.*;

@Entity
@NamedQuery(name="Mpr.findAll", query="SELECT m FROM Mpr m")
public class Mpr implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	private String id;
	private String msg;
	private Long number;

	public Mpr() {
	}

	public String getId() {
		return this.id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getMsg() {
		return this.msg;
	}

	public void setMsg(String msg) {
		this.msg = msg;
	}
	
	public Long getNumber() {
		return this.number;
	}
	
	public void setNumber(Long number) {
		this.number = number;
	}
	

}