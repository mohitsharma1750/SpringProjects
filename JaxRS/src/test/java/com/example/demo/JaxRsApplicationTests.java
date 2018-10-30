package com.example.demo;

import static org.junit.Assert.assertEquals;

import org.junit.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvFileSource;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class JaxRsApplicationTests {

	@Test
	public void contextLoads() {
	}
	
	 @ParameterizedTest
     @CsvFileSource(resources = "temp.csv")
    public static void testGetTriangleType( String expectedResult,int l1,int l2,int l3, int a1,int a2,int a3) {
          assertEquals(expectedResult,TestTriangle.getTriangleType(l1,l2,l3,a1,a2,a3));

    }

}
