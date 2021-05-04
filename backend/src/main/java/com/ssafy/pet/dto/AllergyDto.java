package com.ssafy.pet.dto;

public class AllergyDto {

	//반려동물 알레르기 
	
	private String peid;
	private String al_name;
	private int al_flag;
	public AllergyDto(String peid, String al_name, int al_flag) {
		super();
		this.peid = peid;
		this.al_name = al_name;
		this.al_flag = al_flag;
	}
	public String getPeid() {
		return peid;
	}
	public void setPeid(String peid) {
		this.peid = peid;
	}
	public String getAl_name() {
		return al_name;
	}
	public void setAl_name(String al_name) {
		this.al_name = al_name;
	}
	public int getAl_flag() {
		return al_flag;
	}
	public void setAl_flag(int al_flag) {
		this.al_flag = al_flag;
	}
	@Override
	public String toString() {
		return "AllergyDto [peid=" + peid + ", al_name=" + al_name + ", al_flag=" + al_flag + "]";
	}
	
	
}
