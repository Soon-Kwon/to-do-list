package com.example.demo.dto;

import com.example.demo.model.TodoEntity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@Data
public class TodoDTO {
	// �ʵ��� �̸��� �𵨰� �ٸ��� ���´ٸ� ĸ��ȭ �� �� �ִ�. 
	private String id;
	private String title;
	private boolean done;
	
	public TodoDTO(final TodoEntity entity) {
		// ������ Model ��ü�� �;� ������, ���� ������Ʈ������ 
		// Entity ��ü�� Model�� ���ҵ� �Բ� �����ϰ� �ִ�. 
		this.id = entity.getId();
		this.title = entity.getTitle();
		this.done = entity.isDone();
	}
	
	public static TodoEntity toEntity(final TodoDTO dto) {
		return TodoEntity.builder()
				.id(dto.getId())
				.title(dto.getTitle())
				.done(dto.isDone())
				.build();
	}
}
