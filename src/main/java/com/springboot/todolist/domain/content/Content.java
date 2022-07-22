package com.springboot.todolist.domain.content;

import java.time.LocalDateTime;

import com.springboot.todolist.web.dto.content.CreateContentRespDto;
import com.springboot.todolist.web.dto.content.ReadContentRespDto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@Data
@Builder
public class Content {
	private int contentcode;
	private String content;
	private int usercode;
	private LocalDateTime createdate;
	private LocalDateTime updatedate;

	public CreateContentRespDto toCreateContentDto() {
		return CreateContentRespDto.builder()
				.content(content)
				.contentcode(contentcode)
				.usercode(usercode)
				.build();
	}
	
	public ReadContentRespDto toReadContentDto() {
		return ReadContentRespDto.builder()
				.content(content)
				.contentcode(contentcode)
				.usercode(usercode)
				.createdate(createdate)
				.build();
	}
}
