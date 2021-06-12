package com.hadasht.study.tdd.user;

public class UserRegister {

	private WeakPasswordChecker weakPasswordChecker;
	private UserRepository userRepository;

	private String id;
	private String pw;
	private String email;

	public UserRegister(WeakPasswordChecker weakPasswordChecker) {
		this.weakPasswordChecker = weakPasswordChecker;
	}

	public UserRegister(WeakPasswordChecker weakPasswordChecker, UserRepository userRepository) {
		this.weakPasswordChecker = weakPasswordChecker;
		this.userRepository = userRepository;
	}

	public void register(String id, String pw, String email) {
		if (weakPasswordChecker.checkPasswordWeak(pw)) {
			throw new WeakPasswordException();
		}
		User one = userRepository.findOne(id);
		if (one != null) {
			throw new DupIdException();
		}
		userRepository.save(new User(id, pw, email));

	}

}
