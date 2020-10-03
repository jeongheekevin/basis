package org.spring.sample.dto;

public class LicenseInfoVO {

	private String serialNumber;
	private String licenseType;
	private String licenseName;
	
	public String getSerialNumber() {
		return serialNumber;
	}
	
	public void setSerialNumber(String serialNumber) {
		this.serialNumber = serialNumber;
	}
	
	public String getLicenseType() {
		return licenseType;
	}
	
	public void setLicenseType(String licenseType) {
		this.licenseType = licenseType;
	}
	
	public String getLicenseName() {
		return licenseName;
	}
	
	public void setLicenseName(String licenseName) {
		this.licenseName = licenseName;
	}
	
	public String toString() {
		return "LicenseInfoVO [serialNumber=" + serialNumber + ", licenseType=" + licenseType + ", licenseName="
				+ licenseName + "]";
	}
}
