package com.JPA.miniproject.services;

import java.util.List;

import com.JPA.miniproject.entity.PemesananBarang;

public interface PemesananBarangInterface {

	public List<PemesananBarang> getAllPemesananBarang();
	
	public PemesananBarang getByIdPemesananBarang (String nomorregister);
	
	public void deletePemesananBarang (String nomorregister);
	
	public PemesananBarang addPemesananBarang (PemesananBarang pemesananbarang);
	
	public List<PemesananBarang> getPemesananBarangByNamaPemesan (String nama_pemesan);	
	
	public List<PemesananBarang> getNomorRegister (String nomor_register);

	
}
