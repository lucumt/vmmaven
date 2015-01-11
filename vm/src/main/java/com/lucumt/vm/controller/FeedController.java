package com.lucumt.vm.controller;

import javax.inject.Inject;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import com.lucumt.vm.service.IFeedService;

@Controller
public class FeedController {

	@Inject
	private IFeedService feedService;

	@RequestMapping("/")
	public String list(ModelMap model) {
		model.put("feeds", feedService.getFeeds());
		return "list";
	}

	@RequestMapping("/feed/{id}")
	public String detail(@PathVariable(value = "id") int feedId,ModelMap model) {
		model.put("feed", feedService.getFeedById(feedId));
		return "detail";
	}

}
