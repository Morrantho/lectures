package com.codingdojo.models;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Transient;
import javax.validation.constraints.Email;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

@Entity
public class User
{
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Long id;
	
	@Size(min=3,max=30,message="Name must be between 3-30 characters.")
	private String name;
	
//	@NotNull(message="Email Required")
	@NotEmpty(message="Email Required")
	@Email(message="Invalid Email. Example: example@example.com")
	private String email;

	@Size(min=8,max=128,message="Password must be between 8-128 characters")
	private String password;

//	@NotNull(message="Age must be between 18-60")
//	@Min(value=18,message="Age must be between 18-60")
//	@Max(value=60,message="Age must be between 18-60")
//	private Integer age;
	
    @Transient
    @NotEmpty(message="Confirm Password is required!")
    @Size(min=8, max=128, message="Confirm Password must be between 8 and 128 characters")
    private String confirm;	
	
	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getConfirm() {
		return confirm;
	}

	public void setConfirm(String confirm) {
		this.confirm = confirm;
	}

	public User()
	{
		
	}
};