package kodlamaio.HRMS.business.abstracts;

import java.util.List;


import kodlamaio.HRMS.entities.abstracts.JobTitles;

public interface JobTitlesService {
	void add(JobTitles title);
	
	List<JobTitles> findAll();

}
