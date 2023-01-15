package user_eb9;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class User {
	@Id
	private int id;
	private String name;
	private String password;
	private String email;
	private long phone;
	private String facebookPassword;
	private String instagramPassword;
	private String twitterPassword;
	private String snapchatPassword;
	private String whatsappPassword;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public long getPhone() {
		return phone;
	}
	public void setPhone(long phone) {
		this.phone = phone;
	}
	
	public String getFacebookPassword() {
		return facebookPassword;
	}
	public void setFacebookPassword(String facebookPassword) {
		this.facebookPassword = facebookPassword;
	}
	public String getInstagramPassword() {
		return instagramPassword;
	}
	public void setInstagramPassword(String instagramPassword) {
		this.instagramPassword = instagramPassword;
	}
	public String getTwitterPassword() {
		return twitterPassword;
	}
	public void setTwitterPassword(String twitterPassword) {
		this.twitterPassword = twitterPassword;
	}
	public String getSnapchatPassword() {
		return snapchatPassword;
	}
	public void setSnapchatPassword(String snapchatPassword) {
		this.snapchatPassword = snapchatPassword;
	}
	public String getWhatsappPassword() {
		return whatsappPassword;
	}
	public void setWhatsappPassword(String whatsappPassword) {
		this.whatsappPassword = whatsappPassword;
	}
	@Override
	public String toString() {
		return "User [id=" + id + ", name=" + name + ", password=" + password + ", email=" + email + ", phone=" + phone
				+ ", facebookPassword=" + facebookPassword + ", instagramPassword=" + instagramPassword
				+ ", twitterPassword=" + twitterPassword + ", snapchatPassword=" + snapchatPassword
				+ ", whatsappPassword=" + whatsappPassword + "]";
	}
	

	

}
