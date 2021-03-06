package kodlamaio.HRMS.entities.abstracts;

import javax.persistence.Column;
import javax.persistence.Id;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Table;

import lombok.Data;

@Data
@Entity
@Table(name = "jobTitles")
public class JobTitles {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "Id")
	private int Id;
	
	@Column(name = "title")
	private String title;
}