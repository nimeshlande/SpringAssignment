package financialproductsreviewappproject.financialproductsreviewapp;

public class User {
	private String userName;
	private String emailId;
	private String password;
	private String mobileNo;
	public User() {
		super();
		// TODO Auto-generated constructor stub
	}
	public User(String userName, String emailId, String password, String mobileNo) {
		super();
		this.userName = userName;
		this.emailId = emailId;
		this.password = password;
		this.mobileNo = mobileNo;
	}
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public String getEmailId() {
		return emailId;
	}
	public void setEmailId(String emailId) {
		this.emailId = emailId;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getMobileNo() {
		return mobileNo;
	}
	public void setMobileNo(String mobileNo) {
		this.mobileNo = mobileNo;
	}
	
	

}
