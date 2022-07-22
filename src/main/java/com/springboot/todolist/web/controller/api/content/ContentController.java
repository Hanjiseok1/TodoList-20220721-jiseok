package com.springboot.todolist.web.controller.api.content;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.springboot.todolist.web.dto.content.CreateContentReqDto;

import lombok.RequiredArgsConstructor;

@RestController
@RequestMapping("/api/v1/todolist/content")
@RequiredArgsConstructor
public class ContentController {
	
	
	
	public ResponseEntity<?> addContent(@RequestBody CreateContentReqDto createContentReqDto){
		return null;
	}
}
