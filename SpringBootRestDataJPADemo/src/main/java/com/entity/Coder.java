package com.entity;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.NotNull;



@Entity
@Table(name="Coder1")
public class Coder {
	
	@Id
	@GeneratedValue
	int cid;
	
	//@Column(name="codername")
	@NotNull
	@NotEmpty(message="Name can not be empty")
	String cname;
	String tech;
	
	@OneToOne(cascade = CascadeType.ALL)
	Laptop laptop;
	public Laptop getLaptop() {
		return laptop;
	}
	public void setLaptop(Laptop laptop) {
		this.laptop = laptop;
	}
	/*
	 * @OneToMany List<Laptop> laptops;
	 * 
	 * public List<Laptop> getLaptops() { return laptops; } public void
	 * setLaptops(List<Laptop> laptops) { this.laptops = laptops; }
	 */
	public int getCid() {
		return cid;
	}
	public void setCid(int cid) {
		this.cid = cid;
	}
	public String getCname() {
		return cname;
	}
	public void setCname(String cname) {
		this.cname = cname;
	}
	public String getTech() {
		return tech;
	}
	public void setTech(String tech) {
		this.tech = tech;
	}
	@Override
	public String toString() {
		return "Coder [cid=" + cid + ", cname=" + cname + ", tech=" + tech + "]";
	}
	
}
