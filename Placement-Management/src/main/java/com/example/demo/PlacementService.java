package com.example.demo;



	import java.util.List;

	import org.springframework.beans.factory.annotation.Autowired;
	import org.springframework.stereotype.Service;
	import org.springframework.transaction.annotation.Transactional;

	@Service
	@Transactional
	public class PlacementService {
		
		@Autowired
		private PlacementRepository repo;
		
		//to retrieve all the data of student class
		public List<Placement> listAll()
		{
			return repo.findAll();
		}
		//insert/create/update a data
		public void create(Placement p)
		{
			 repo.save(p);
		}
		//to retrieve a single record
		public Placement retrieve(Integer id)
		{
			return repo.findById(id).get();
			
		}
		//to delete a data
		public void delete(Integer id)
		{
			repo.deleteById(id);
		}

	}

