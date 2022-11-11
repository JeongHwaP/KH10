package com.kh.spring22.restcontroller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.kh.spring22.entity.PocketMonsterDto;
import com.kh.spring22.repository.PocketMonsterDao;

import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.tags.Tag;

@Tag(name = "포켓몬스터 컨트롤러")
@RestController
@RequestMapping("/rest")
public class PocketmonController {
	
	@Autowired
	private PocketMonsterDao dao;
	
	@Operation(
		summary = "포켓몬 목록",
		responses = {
			@ApiResponse(responseCode = "200", description = "OK"),
			@ApiResponse(responseCode = "500", description = "ERROR")
		}
	)
	@GetMapping("/pocketmon")
	public List<PocketMonsterDto> list(){
		return dao.list();
	}
	
	@Operation(
			summary = "포켓몬 상세",
			responses = {
				@ApiResponse(responseCode = "200", description = "OK"),
				@ApiResponse(responseCode = "404", description = "Not found"),
				@ApiResponse(responseCode = "500", description = "ERROR")
			}
		)
	@GetMapping("/pocketmon/{no}")
	public PocketMonsterDto find(@PathVariable int no) {
		return dao.find(no);
	}
	
	@Operation(
			summary = "포켓몬 등록",
			responses = {
				@ApiResponse(responseCode = "200", description = "OK"),
				@ApiResponse(responseCode = "500", description = "ERROR")
			}
		)
	@PostMapping("/pocketmon")
	public void insert(@RequestBody PocketMonsterDto dto) {
		dao.insert(dto);
	}
	
	@Operation(
		summary = "포켓몬 수정",
		responses = {
			@ApiResponse(responseCode = "200", description = "OK"),
			@ApiResponse(responseCode = "404", description = "Not found"),
			@ApiResponse(responseCode = "500", description = "ERROR")
		}
	)
	//PUT 방식은 POST 처럼 데이터를 Body에 전송할 수 있는 방식
	@PutMapping("/pocketmon")
	public boolean edit(@RequestBody PocketMonsterDto dto) {
		return dao.edit(dto);
	}
	
	@Operation(
		summary = "포켓몬 삭제",
		responses = {
			@ApiResponse(responseCode = "200", description = "OK"),
			@ApiResponse(responseCode = "404", description = "Not found"),
			@ApiResponse(responseCode = "500", description = "ERROR")
		}
	)
	@DeleteMapping("/pocketmon/{no}")
	public boolean delete(@PathVariable int no) {
		return dao.delete(no);
	}
}