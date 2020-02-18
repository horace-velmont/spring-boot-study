package info.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
public class School {
	@Id
	@Column(name = "SCHOOL_ID")
	private Long id;
	private String name;
	private String address;
	private String telNumber;
	
	public School(String name) {
		this.name = name;
	}
}
