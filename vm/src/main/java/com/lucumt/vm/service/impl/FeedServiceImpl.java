package com.lucumt.vm.service.impl;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Service;

import com.lucumt.vm.model.FeedModel;
import com.lucumt.vm.service.IFeedService;

@Service
public class FeedServiceImpl implements IFeedService {

	private Map<Integer, FeedModel> storage = new HashMap<Integer, FeedModel>();

	public FeedServiceImpl() {
		storage.put(1, new FeedModel(1, "Spring Tutorial"));
		storage.put(2, new FeedModel(2, "Velocity Tutorial"));
		storage.put(3, new FeedModel(3, "Java Tutorial"));
	}

	public List<FeedModel> getFeeds() {
		List<FeedModel> list = new ArrayList<FeedModel>();
		list.addAll(storage.values());
		return list;
	}

	public FeedModel getFeedById(int id) {
		return storage.get(id);
	}

}
