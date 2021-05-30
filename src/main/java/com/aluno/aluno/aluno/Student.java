package com.aluno.aluno.aluno;

import java.time.LocalDate;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.validation.constraints.NotEmpty;

@Entity
public class Student{

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;

	@NotEmpty(message = "the rga is mandatory")
	private String rga;

	@NotEmpty(message = "the name is mandatory")
	private String nome;

	private String curso;
	private String situacao;
	private LocalDate registrado_em = LocalDate.now();;

	public Student(String rga, String nome, String curso, String situacao, LocalDate registrado_em) {
		this.rga = rga;
		this.nome = nome;
		this.curso = curso;
		this.situacao = situacao;
		this.registrado_em = registrado_em;
	}

	public Student() {
	}

	public String getRga() {
		return rga;
	}

	public void setRga(String rga) {
		this.rga = rga;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getCurso() {
		return curso;
	}

	public void setCurso(String curso) {
		this.curso = curso;
	}

	public String getSituacao() {
		return situacao;
	}

	public void setSituacao(String situacao) {
		this.situacao = situacao;
	}

	public LocalDate getRegistrado_em() {
		return registrado_em;
	}

	public void setRegistrado_em(LocalDate registrado_em) {
		this.registrado_em = registrado_em;
	}

	public Long getId() {
		return id;
	}

}
