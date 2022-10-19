package com.example.demo;



	import java.util.List;

	import org.springframework.beans.factory.annotation.Autowired;
	import org.springframework.stereotype.Service;
	import org.springframework.transaction.annotation.Transactional;

	@Service
	@Transactional
	public class CertificateService
	{
		
		@Autowired
		private CertificateRepository repo;
		
		//to retrieve all the data of student class
		public List<Certificate> listAll()
		{
			return repo.findAll();
		}
		//insert/create/update a data
		public void create(Certificate c)
		{
			 repo.save(c);
		}
		//to retrieve a single record
		public Certificate retrieve(Integer id)
		{
			return repo.findById(id).get();
			
		}
		//to delete a data
		public void delete(Integer id)
		{
			repo.deleteById(id);
		}

	}


