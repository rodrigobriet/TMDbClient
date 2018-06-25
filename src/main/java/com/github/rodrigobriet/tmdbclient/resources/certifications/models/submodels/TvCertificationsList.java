package com.github.rodrigobriet.tmdbclient.resources.certifications.models.submodels;

import java.util.List;

import com.google.gson.annotations.SerializedName;

public class TvCertificationsList {

	@SerializedName("RU")
	List<Certification> RU;
	
	@SerializedName("US")
	List<Certification> US;
	
	@SerializedName("CA")
	List<Certification> CA;
	
	@SerializedName("AU")
	List<Certification> AU;
	
	@SerializedName("FR")
	List<Certification> FR;
	
	@SerializedName("DE")
	List<Certification> DE;
	
	@SerializedName("TH")
	List<Certification> TH;
	
	@SerializedName("KR")
	List<Certification> KR;
	
	@SerializedName("GB")
	List<Certification> GB;
	
	@SerializedName("BR")
	List<Certification> BR;
	
	@SerializedName("SK")
	List<Certification> SK;
	
	@SerializedName("NL")
	List<Certification> NL;
	
	@SerializedName("PT")
	List<Certification> PT;
	
	@SerializedName("CA-QC")
	List<Certification> CA_QC;
	
	@SerializedName("HU")
	List<Certification> HU;
	
	@SerializedName("LT")
	List<Certification> LT;

	public List<Certification> getRU() {
		return RU;
	}

	public List<Certification> getUS() {
		return US;
	}

	public List<Certification> getCA() {
		return CA;
	}

	public List<Certification> getAU() {
		return AU;
	}

	public List<Certification> getFR() {
		return FR;
	}

	public List<Certification> getDE() {
		return DE;
	}

	public List<Certification> getTH() {
		return TH;
	}

	public List<Certification> getKR() {
		return KR;
	}

	public List<Certification> getGB() {
		return GB;
	}

	public List<Certification> getBR() {
		return BR;
	}

	public List<Certification> getSK() {
		return SK;
	}

	public List<Certification> getNL() {
		return NL;
	}

	public List<Certification> getPT() {
		return PT;
	}

	public List<Certification> getCA_QC() {
		return CA_QC;
	}

	public List<Certification> getHU() {
		return HU;
	}

	public List<Certification> getLT() {
		return LT;
	}
	
}
