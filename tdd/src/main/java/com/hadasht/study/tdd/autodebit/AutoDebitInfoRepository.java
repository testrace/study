package com.hadasht.study.tdd.autodebit;

public interface AutoDebitInfoRepository {

	void save(AutoDebitInfo info);
	AutoDebitInfo findOne(String userId);
}
