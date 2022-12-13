package com.example.lastmodifiedproblem;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

import java.time.Instant;
import java.util.UUID;

@Entity
public class EntityWithInstant {
	@Id
	UUID id;
	Instant instant;
}
