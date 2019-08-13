package com.mqnic.persistence;

import lombok.Setter;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import javax.sql.DataSource;
import java.sql.Connection;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("file:src/main/resources/META-INF/spring/applicationContext.xml")
public class DataSourceTests {

	@Setter (onMethod_ = {@Autowired})
	private DataSource dataSource;
	@Test
	public void testConntection() {
		try (Connection con = dataSource.getConnection()) {
			System.out.println(con);
		}catch (Exception e ) {
			e.printStackTrace();
		}
	}
}
