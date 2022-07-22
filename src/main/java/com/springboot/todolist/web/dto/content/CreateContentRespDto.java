package com.springboot.todolist.web.dto.content;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@Data
@Builder
public class CreateContentRespDto {
	private int usercode;
	private String content;
	private int contentcode;
}
