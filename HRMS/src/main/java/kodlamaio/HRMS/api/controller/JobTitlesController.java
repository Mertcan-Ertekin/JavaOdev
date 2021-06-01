package kodlamaio.HRMS.api.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import kodlamaio.HRMS.business.abstracts.JobTitlesService;
import kodlamaio.HRMS.entities.abstracts.JobTitles;

@RestController
@RequestMapping(value = "/api/jobTitles")
public class JobTitlesController {
	
	private JobTitlesService jobTitlesService;

	@Autowired
	public JobTitlesController(JobTitlesService jobTitlesService) {
		super();
		this.jobTitlesService = jobTitlesService;
	}
	
	@PostMapping(value = "/add")
	public void add(@RequestBody JobTitles title) {
		this.jobTitlesService.add(title);
		
	}


	@GetMapping(value = "/getall")
	public List<JobTitles> getAll() {
		return this.jobTitlesService.findAll();
	}

}
