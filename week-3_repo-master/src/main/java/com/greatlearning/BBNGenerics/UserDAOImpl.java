package com.greatlearning.BBNGenerics;

import java.util.ArrayList;
import java.util.List;

public class UserDAOImpl<T extends User> implements UserDAO<T> {

	List<T> objects = new ArrayList<>();

	// To get any one record of any of the three Users(Employee, Visitor or Customer
	// by email)
	@Override
	public T get(String email) {
		for (T object: objects) {
			if (object.getEmail().equalsIgnoreCase(email)) {
				return object;
			}
		}
		return null;
	}

	// To get all records of any of the three Users(Employee, Visitor or Customer)
	@Override
	public List<T> getAll() {
		return objects;
	}

	// To save a new User
	@Override
	public void save(T t) {
		objects.add(t);
	}

	// To update the existing user
	@Override
	public void update(T t) {
		for (T object: objects) {
			if (object.getEmail().equalsIgnoreCase(t.getEmail())) {
				object.setEmail(t.getEmail());
				object.setName(t.getName());
			}
		}
	}

	// Delete an existing user
	@Override
	public void delete(T t) {
		objects.remove(t);
	}

}
