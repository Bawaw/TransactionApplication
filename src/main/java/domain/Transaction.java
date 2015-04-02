package domain;

public class Transaction {
	private double bedrag;
	private String region; 
	private String countryCode;
	private String guarantor;
	private String loanNumber;
	
	public Transaction(double bedrag,String region, String countryCode, String guarantor,String loanNumber) {
		setBedrag(bedrag);
		setGuarantor(guarantor);
		setRegion(region);
		setCountryCode(countryCode);
	}
	
	public double getBedrag() {
		return bedrag;
	}
	public String getLoanNumber() {
		return loanNumber;
	}

	public void setLoanNumber(String loanNumber) {
		this.loanNumber = loanNumber;
	}

	public void setBedrag(double bedrag) {
		this.bedrag = bedrag;
	}
	public String getRegion() {
		return region;
	}
	public void setRegion(String region) {
		this.region = region;
	}
	public String getCountryCode() {
		return countryCode;
	}
	public void setCountryCode(String countryCode) {
		this.countryCode = countryCode;
	}
	public String getGuarantor() {
		return guarantor;
	}
	public void setGuarantor(String guarantor) {
		this.guarantor = guarantor;
	}
	
}
