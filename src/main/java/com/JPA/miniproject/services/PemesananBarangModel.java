package com.JPA.miniproject.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.JPA.miniproject.entity.PemesananBarang;
import com.JPA.miniproject.repository.PemesananBarangRepository;

@Service
public class PemesananBarangModel implements PemesananBarangInterface {
	
	@Autowired
	PemesananBarangRepository pemesananRepo;

	@Override
	public List<PemesananBarang> getAllPemesananBarang() {
		// TODO Auto-generated method stub
		return (List<PemesananBarang>) this.pemesananRepo.findAll();
	}

	@Override
	public PemesananBarang getByIdPemesananBarang(String NomorRegister) {
		// TODO Auto-generated method stub
		return this.pemesananRepo.findById(Long.parseLong(NomorRegister)).get();
	}

	@Override
	public void deletePemesananBarang(String NomorRegister) {
		// TODO Auto-generated method stub
		this.pemesananRepo.deleteById(Long.parseLong(NomorRegister));
	}

	@Override
	public PemesananBarang addPemesananBarang(PemesananBarang pemesananbarang) {
		// TODO Auto-generated method stub
		return this.pemesananRepo.save(pemesananbarang);
	}

	@Override
	public List<PemesananBarang> getPemesananBarangByNamaPemesan(String nama_pemesan) {
		// TODO Auto-generated method stub
		return this.pemesananRepo.findByNamaPemesan(nama_pemesan);
	}

	@Override
	public List<PemesananBarang> getNomorRegister(String nomor_register) {
		// TODO Auto-generated method stub
		return this.pemesananRepo.getClass();
	}

	

	


	
}
