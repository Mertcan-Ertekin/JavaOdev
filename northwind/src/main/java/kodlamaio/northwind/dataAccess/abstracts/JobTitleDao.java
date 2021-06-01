package kodlamaio.northwind.dataAccess.abstracts;

import org.springframework.data.jpa.repository.JpaRepository;

import kodlamaio.northwind.entities.concretes.JobTitles;

public interface JobTitleDao extends JpaRepository<JobTitles, Integer>{

}
