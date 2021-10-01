package com.JPA.miniproject.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.JPA.miniproject.entity.PemesananBarang;
import com.JPA.miniproject.services.PemesananBarangModel;

@RestController
public class PemesananBarangController {

	@Autowired
	PemesananBarangModel modelPesan;
	
	@GetMapping ("/API/pesan/")
	public List<PemesananBarang> getAll(){
		return (List<PemesananBarang>) modelPesan.getAllPemesananBarang();
	}
	
	@PostMapping ("/API/pesan/add")
	public String addPemesananBarang (@RequestBody PemesananBarang pemesananbarang, String nomorregister) {
		modelPesan.addPemesananBarang(pemesananbarang);
		return "Pesanan telah diterima dengan nomor register" + (List<PemesananBarang>) modelPesan.getNomorRegister(nomorregister) ;  
	}
	
	@PutMapping ("/API/pesan/update/{NomorRegister}")
	public String updatePemesananBarang (@PathVariable String NomorRegister, @RequestBody PemesananBarang pemesananbarang ) {
		pemesananbarang.setNomorRegister(Long.parseLong(NomorRegister));
		modelPesan.addPemesananBarang(pemesananbarang);
		return "Update Berhasil";
	}
	
	@GetMapping ("/API/pesan/cari/{nama}")
	public List<PemesananBarang> getAllByNamaPemesan (@PathVariable String nama){
		System.out.println(nama);
		return modelPesan.getPemesananBarangByNamaPemesan(nama);
	}
	
	
}
