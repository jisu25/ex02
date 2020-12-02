package org.zerock.mapper;

import java.util.List;

import org.junit.After;
import org.junit.Assert;
import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.MethodSorters;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.zerock.domain.BoardVO;

import lombok.Setter;
import lombok.extern.log4j.Log4j2;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = {org.zerock.config.RootConfig.class})
@Log4j2
@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class BoardMapperTest {

	@After
	public void tearDown() throws Exception {
		System.out.println();
	}
	
	@Setter(onMethod_ = @Autowired)
	private BoardMapper mapper;
	
	@Test
	public void test01GetList() {
		List<BoardVO> list = mapper.getList();
		Assert.assertNotNull(list);
		list.forEach(board -> log.info(board));
	}
	
	@Test
	public void test02Insert() {
		BoardVO board = new BoardVO();
		board.setTitle("새로 작성하는 글");
		board.setContent("새로 내용");
		board.setWriter("newbie");
		
		mapper.insertSelectKey(board);
		log.info(board);
	}
	
	@Test
	public void test03Read() {
		BoardVO board = mapper.read(5L);
		log.info(board);
	}
	
	@Test
	public void test04Delete() {
		log.info("DELETE COUNT: " + mapper.delete(4L));
	}
	
	@Test
	public void test05Update() {
		BoardVO board = new BoardVO();
		board.setBno(5L);
		board.setTitle("수정된 제목");
		board.setContent("수정된 내용");
		board.setWriter("user00");
		
		int count = mapper.update(board);
		log.info("UPDATE COUNT: " + count);
	}
	
}
