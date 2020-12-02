package org.zerock.domain;

import java.time.LocalDateTime;

import lombok.Data;

@Data // lombok에서 getter, setter 만들어줌
public class BoardVO {
	private Long bno;
	private String title;
	private String content;
	private String writer;
	private LocalDateTime regdate;
	private LocalDateTime updateDate;
}
