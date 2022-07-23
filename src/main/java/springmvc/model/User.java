package springmvc.model;

public class User {
	
	private String emailV;
	private String userNameV;
	private String passwordV;
	
	
	
	
	
	
	public String getEmailV() {
		return emailV;
	}
	public String getUserNameV() {
		return userNameV;
	}
	public String getPasswordV() {
		return passwordV;
	}
	public void setEmailV(String emailV) {
		this.emailV = emailV;
	}
	public void setUserNameV(String userNameV) {
		this.userNameV = userNameV;
	}
	public void setPasswordV(String passwordV) {
		this.passwordV = passwordV;
	}
	@Override
	public String toString() {
		return "User [emailV=" + emailV + ", userNameV=" + userNameV + ", passwordV=" + passwordV + "]";
	}

}
