package com.demo.collection.iteration;

public class User implements Comparable<User> {

	private String name;
	private int age;
	private int id;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public User(String name, int age, int id) {
		super();
		this.name = name;
		this.age = age;
		this.id = id;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public User(String name) {
		super();
		this.name = name;
	}

	@Override
	public int compareTo(User o) {
		int last = this.name.compareTo(o.name);
		return last == 0 ? this.name.compareTo(o.name) : last;
	}

	@Override
	public String toString() {
		return "User [name=" + name + ", age=" + age + ", id=" + id + "]";
	}

}
