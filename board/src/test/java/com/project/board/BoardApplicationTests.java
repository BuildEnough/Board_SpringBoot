package com.project.board;
import static org.junit.jupiter.api.Assertions.assertTrue;

import java.util.Optional;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.project.board.question.Question;
import com.project.board.question.QuestionRepository;
import com.project.board.question.QuestionService;

@SpringBootTest
class BoardApplicationTests {

	@Autowired
	private QuestionService questionService;
	
	@Test
	void testJpa() {
		for(int i=1; i<=300; i++) {
			String subject = String.format("테스트 Data:[%03d]", i);
			String content = "내용없음";
			this.questionService.create(subject, content);
		}
	}

}
