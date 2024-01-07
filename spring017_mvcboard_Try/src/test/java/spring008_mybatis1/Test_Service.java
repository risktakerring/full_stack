package spring008_mybatis1;

import org.junit.Ignore;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.company.dao.BDao;
import com.company.dto.BDto;
import com.company.service.BoardService;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations="classpath:config/root-context.xml")
public class Test_Service {
	@Autowired  ApplicationContext context;
	@Autowired  BDao dao;
	@Autowired  BoardService service;
	
	@Test @Ignore public void test0() {  System.out.println(context);}
	@Test @Ignore  public void test1() {
		//5. delete
		//System.out.println( dao.delete(12));
		//4. select
		//System.out.println( dao.read(12));
		//3. update
		//BDto dto = new BDto();  
		//dto.setName("test-new");  dto.setAge(1);  dto.setNo(12);
		//System.out.println(  dao.update(dto));
		//2. insert
		//UserDto dto = new UserDto();  
		//dto.setName("test");  dto.setAge(100);
		//System.out.println(  dao.insert(dto));
		//1. readAll
		System.out.println(  dao.readAll() );
	}

	@Test  public void test2() {
		//5. delete
		//System.out.println( service.delete(13));
		//4. select
		//System.out.println( service.read(13));
		//3. update
		//UserDto dto = new UserDto();  
		//dto.setName("test-new");  dto.setAge(1);  dto.setNo(13);
		//System.out.println(  service.update(dto));
		//2. insert
		//UserDto dto = new UserDto();  
		//dto.setName("test");  dto.setAge(100);
		//System.out.println(  service.insert(dto));
		//1. readAll
		System.out.println(  service.readAll() );
	}
}









