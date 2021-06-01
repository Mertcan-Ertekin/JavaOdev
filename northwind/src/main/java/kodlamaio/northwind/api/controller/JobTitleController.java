package kodlamaio.northwind.api.controller;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import kodlamaio.northwind.business.abstracts.JobTitleService;
import kodlamaio.northwind.entities.concretes.JobTitles;

@RestController
@RequestMapping("/api/jobTitles")
public class JobTitleController {
	
	private JobTitleService jobTitleService;
	public JobTitleController(JobTitleService jobTitleService) {
		this.jobTitleService = jobTitleService;
	}
	
	@GetMapping("/getall")
	public List<JobTitles> getAll() {
		return this.jobTitleService.findAll();
	}

}
