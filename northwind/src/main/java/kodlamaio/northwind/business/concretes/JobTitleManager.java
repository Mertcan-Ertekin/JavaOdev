package kodlamaio.northwind.business.concretes;

import java.util.List;

import org.springframework.stereotype.Service;

import kodlamaio.northwind.business.abstracts.JobTitleService;
import kodlamaio.northwind.dataAccess.abstracts.JobTitleDao;
import kodlamaio.northwind.entities.concretes.JobTitles;

@Service
public class JobTitleManager implements JobTitleService {

	private JobTitleDao jobTitleDao;
	public JobTitleManager(JobTitleDao jobTitleDao) {
		this.jobTitleDao = jobTitleDao;
		
	}
	
	@Override
	public void save(JobTitles titles) {
		this.jobTitleDao.save(titles);
		
	}

	@Override
	public List<JobTitles> findAll() {
		return this.jobTitleDao.findAll();
	}

}
