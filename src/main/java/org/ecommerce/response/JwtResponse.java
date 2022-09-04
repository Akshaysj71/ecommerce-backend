package org.ecommerce.response;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class JwtResponse {
	public JwtResponse() {
		super();
		// TODO Auto-generated constructor stub
	}
	public JwtResponse(String status, String jwtToken, String message, String userType) {
		super();
		this.status = status;
		this.jwtToken = jwtToken;
		this.message = message;
		this.userType = userType;
	}
	@Override
	public String toString() {
		return "JwtResponse [status=" + status + ", jwtToken=" + jwtToken + ", message=" + message + ", userType="
				+ userType + "]";
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	public String getJwtToken() {
		return jwtToken;
	}
	public void setJwtToken(String jwtToken) {
		this.jwtToken = jwtToken;
	}
	public String getMessage() {
		return message;
	}
	public void setMessage(String message) {
		this.message = message;
	}
	public String getUserType() {
		return userType;
	}
	public void setUserType(String userType) {
		this.userType = userType;
	}
	private String status;
	private String jwtToken;
	private String message;
	private String userType;

}
