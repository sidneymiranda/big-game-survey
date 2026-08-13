package com.devsuperior.dspesquisa.dto;

import java.io.Serializable;

import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

public class RecordInsertDTO implements Serializable {
	private static final long serialVersionUID = 1L;

	@NotBlank(message = "Nome é obrigatório")
	@Size(max = 100, message = "Nome deve ter no máximo 100 caracteres")
	private String name;
	
	@NotNull(message = "Idade é obrigatória")
	@Min(value = 1, message = "Idade deve ser maior que 0")
	@Max(value = 150, message = "Idade deve ser menor que 150")
	private Integer age;
	
	@NotNull(message = "Game ID é obrigatório")
	private Long gameId;
	
	public RecordInsertDTO() {
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Integer getAge() {
		return age;
	}

	public void setAge(Integer age) {
		this.age = age;
	}

	public Long getGameId() {
		return gameId;
	}

	public void setGameId(Long gameId) {
		this.gameId = gameId;
	}
	
	
}
