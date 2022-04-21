package com.codingdojo.models;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.OneToMany;
import javax.persistence.Transient;
import javax.validation.constraints.Email;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.Size;

@Entity
public class User
{
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Long id;

	@NotEmpty(message="Email is required!")
	@Email(message="Please enter a valid email!")
	private String email;

	@NotEmpty(message="Password is required!")
	@Size(min=8, max=128, message="Password must be between 8 and 128 characters")
	private String password;
	
	@Transient
	@NotEmpty(message="Confirm Password is required!")
	@Size(min=8, max=128, message="Confirm Password must be between 8 and 128 characters")
	private String confirm;
	
	@OneToMany(mappedBy="owner",fetch=FetchType.LAZY)
	private List<Project> ownedProjects;

	public void setOwnedProjects(List<Project> projects)
	{
		this.ownedProjects=projects;
	}

	public List<Project> getOwnedProjects()
	{
		return ownedProjects;
	}

	@ManyToMany(fetch=FetchType.LAZY)
	@JoinTable(
		name="users_projects",
		joinColumns=@JoinColumn(name="user_id"),
		inverseJoinColumns=@JoinColumn(name="project_id")
	)
	private List<Project> projects;

	public void setProjects(List<Project> projects)
	{
		this.projects=projects;
	}

	public List<Project> getProjects()
	{
		return projects;
	}

	@OneToMany(mappedBy="user",fetch=FetchType.LAZY)
	private List<Task> tasks;

	public void setTasks(List<Task> tasks)
	{
		this.tasks=tasks;
	}

	public List<Task> getTasks()
	{
		return tasks;
	}

	public User()
	{
		
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
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
	
	
};