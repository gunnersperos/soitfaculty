package com.soit.soitfaculty.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.soit.soitfaculty.entity.Faculty;

public interface FacultyRepository extends JpaRepository<Faculty, Integer> {
	
	
	//Method to sort the results by last name ascending
	public List<Faculty>findAllByOrderByLastNameAsc();

}
