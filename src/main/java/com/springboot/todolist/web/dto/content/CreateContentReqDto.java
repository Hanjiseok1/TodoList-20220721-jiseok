package com.springboot.todolist.web.dto.content;

import com.springboot.todolist.domain.content.Content;

import lombok.Builder;
import lombok.Data;

@Builder
@Data
public class CreateContentReqDto {

	private int usercode;
	private String content;
	private int contentcode;
	
	public Content toEntity() {
		return Content.builder()
				.contentcode(contentcode)
				.content(content)
				.usercode(usercode)
				.build();
	}
}
