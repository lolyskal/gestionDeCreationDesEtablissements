package model;

import java.io.Serializable;
import java.time.Instant;

import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.LastModifiedDate;

import com.fasterxml.jackson.annotation.JsonIgnore;

import jakarta.persistence.Column;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;

public class AbstractEntity implements Serializable {
	
/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
@Id
@GeneratedValue
private Integer id;
@CreatedDate
@Column (name = "creationDate" , nullable = false )
@JsonIgnore
private Instant creationDate ;

@LastModifiedDate
@Column (name = "LastModifiedDate" , nullable = false )
@JsonIgnore
private Instant LastModifiedDate ;

}
