package com.example.oauth20.models;

import jakarta.persistence.*;
import lombok.Data;

@Data
@Entity
public class DBUser {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
	private String username;
	private String password;
	private String role;

}
