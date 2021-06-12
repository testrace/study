package com.hadasht.study.tdd.user;

public interface UserRepository {

	void save(User user);

	User findOne(String userId);
}
