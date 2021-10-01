package com.JPA.miniproject.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor

@Entity
@Table (name="pemasaranbarang")
public class PemesananBarang {
	@Id
	@GeneratedValue (strategy=GenerationType.IDENTITY)
	private long nomorRegister;
	private String namaBarang;
	private String keteranganPemesanan;
	private String jumah, UnitBarang;
	private String namaPemesan;
	private String alamatPemesan;
	private String tanggalPemesan;
	
//	PemesananBarang (long NomorRegister){
//		this.Id=NomorRegister;
//	}
//	
//	public long getId() {
//		return this.Id;
//	}
	
}
