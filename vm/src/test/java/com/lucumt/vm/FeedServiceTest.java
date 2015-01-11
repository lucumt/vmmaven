package com.lucumt.vm;

import static org.junit.Assert.assertTrue;

import javax.inject.Inject;

import org.junit.Test;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.AbstractJUnit4SpringContextTests;

import com.lucumt.vm.service.IFeedService;

@ContextConfiguration("classpath:spring/spring-context-*.xml")
public class FeedServiceTest extends AbstractJUnit4SpringContextTests { 
 
	@Inject
	public IFeedService feedService;
	
	@Test
	public void test(){
		int size=feedService.getFeeds().size();
		System.out.println("----------size:\t"+size);
		assertTrue(size>0);
	}
}
