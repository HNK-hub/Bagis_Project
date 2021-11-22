package com.takim4.bagisProject.business.abstarcts;

import java.util.List;

import com.takim4.bagisProject.core.utilities.results.DataResult;
import com.takim4.bagisProject.core.utilities.results.Result;
import com.takim4.bagisProject.entities.concretes.User;


public interface UserService {
	DataResult<List<User>> getAll();
	DataResult<User> getByEmail(String email);
	DataResult<User> getById(int id);
	Result add(User user);
	Result delete(User user);
	Result update(User user);
}
