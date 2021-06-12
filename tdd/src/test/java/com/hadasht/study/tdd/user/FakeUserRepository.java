package com.hadasht.study.tdd.user;

import java.util.HashMap;
import java.util.Map;

public class FakeUserRepository implements UserRepository {

	private Map<String, User> users = new HashMap<>();

	@Override
	public void save(User user) {
		users.put(user.getId(), user);
	}

	@Override
	public User findOne(String userId) {
		return users.get(userId);
	}

}
