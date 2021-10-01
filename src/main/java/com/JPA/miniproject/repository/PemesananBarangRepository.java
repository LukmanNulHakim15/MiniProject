package com.JPA.miniproject.repository;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import com.JPA.miniproject.entity.PemesananBarang;

public interface PemesananBarangRepository extends CrudRepository<PemesananBarang, Long> {

	 List<PemesananBarang>findByNamaPemesan (String namaPemesan);
	 
	 List <PemesananBarang> getNomorRegister (String nomorRegister);
}
