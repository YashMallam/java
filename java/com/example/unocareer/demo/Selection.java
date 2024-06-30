package com.example.unocareer.demo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface Selection extends JpaRepository<SelectionModel,Integer > {
	

}
