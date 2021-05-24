package kodlamaio.northwind.business.abstracts;

import java.util.List;

import kodlamaio.northwind.entities.concretes.JobTitles;

public interface JobTitleService {
	void save(JobTitles titles);
	
	List<JobTitles> findAll();


	

}
