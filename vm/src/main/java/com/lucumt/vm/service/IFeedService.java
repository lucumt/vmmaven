package com.lucumt.vm.service;

import java.util.List;

import com.lucumt.vm.model.FeedModel;

public interface IFeedService {

	public List<FeedModel> getFeeds();
	
	public FeedModel getFeedById(int id);
}
