package kodlamaio.HRMS.business.concretes;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import kodlamaio.HRMS.business.abstracts.JobTitlesService;
import kodlamaio.HRMS.dataAccess.abstracts.JobTitlesDao;
import kodlamaio.HRMS.entities.abstracts.JobTitles;

@Service
public class JobTitlesManager implements JobTitlesService {
    
	private JobTitlesDao jobTitlesDao;
	
	@Autowired
	public JobTitlesManager(JobTitlesDao jobTitlesDao) {
		super();
		this.jobTitlesDao = jobTitlesDao;
	}

	@Override
	public void add(JobTitles title) {
	    this.jobTitlesDao.save(title);

	}

	@Override
	public List<JobTitles> findAll() {
		return this.jobTitlesDao.findAll();
	}


}
