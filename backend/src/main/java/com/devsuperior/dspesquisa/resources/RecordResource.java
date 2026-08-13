package com.devsuperior.dspesquisa.resources;

import java.time.Instant;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Sort.Direction;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.devsuperior.dspesquisa.dto.RecordDTO;
import com.devsuperior.dspesquisa.dto.RecordInsertDTO;
import com.devsuperior.dspesquisa.services.RecordService;

@RestController
@RequestMapping(value = "/records")
public class RecordResource {

	@Autowired
	private RecordService service;

	@PostMapping
	public ResponseEntity<RecordDTO> insert(@Valid @RequestBody RecordInsertDTO dto) {
		RecordDTO newDTO = service.insert(dto);
		return ResponseEntity.ok().body(newDTO);
	}

	@GetMapping
	public ResponseEntity<Page<RecordDTO>> findAll(
			@RequestParam(value = "min", defaultValue = "") String min,
			@RequestParam(value = "max", defaultValue = "") String max,
			@RequestParam(value = "page", defaultValue = "0") Integer page,
			@RequestParam(value = "linesPerPage", defaultValue = "12") Integer linesPerPage,
			@RequestParam(value = "orderBy", defaultValue = "moment") String orderBy,
			@RequestParam(value = "direction", defaultValue = "DESC") String direction) {
		
		Instant minDate = null;
		Instant maxDate = null;
		
		try {
			minDate = ("".equals(min)) ? null : Instant.parse(min);
			maxDate = ("".equals(max)) ? null : Instant.parse(max);
		} catch (Exception e) {
			return ResponseEntity.badRequest().build();
		}
		
		if (linesPerPage <= 0 || linesPerPage > 1000) {
			linesPerPage = 12;
		}
		
		Direction sortDirection;
		try {
			sortDirection = Direction.fromString(direction.toUpperCase());
		} catch (Exception e) {
			sortDirection = Direction.DESC;
		}
		
		PageRequest pageRequest = PageRequest.of(page, linesPerPage, sortDirection, orderBy);
		
		Page<RecordDTO> list = service.findByMoments(minDate, maxDate, pageRequest);
		return ResponseEntity.ok().body(list);
	}
}
