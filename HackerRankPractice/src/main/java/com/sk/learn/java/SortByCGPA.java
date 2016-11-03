package com.sk.learn.java;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

/**
 * 
 * @author Shankar Modi
 *
 *         HackerRank Problem : Sorting student by CGPA in decreasing order if
 *         CGPA is same then sorting by Name in alphabetical order and if Name
 *         is also same then Sortng by ID.
 */
public class SortByCGPA {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		List<Student> list = new ArrayList<Student>();
		while (n > 0) {
			int id = sc.nextInt();
			String name = sc.next();
			double cgpa = sc.nextDouble();
			Student student = new Student(id, name, cgpa);
			list.add(student);
			n--;
		}
		Collections.sort(list, new Student.sortByCGPA());
		for (Student students : list) {
			System.out.println(students.name);
		}
		sc.close();
	}
}

class Student {
	int id;
	String name;
	double cgpa;

	public Student() {

	}

	public Student(int id, String name, double cgpa) {
		this.id = id;
		this.name = name;
		this.cgpa = cgpa;
	}

	public int getId() {
		return id;
	}

	public String getName() {
		return name;
	}

	public double getCgpa() {
		return cgpa;
	}

	static class sortByCGPA implements Comparator<Student> {
		public int compare(Student s1, Student s2) {
			if (s2.getCgpa() != s1.getCgpa()) {
				return Double.compare(s2.getCgpa(), s1.getCgpa());
			} else {
				if (s1.getName() == s2.getName()) {
					return Integer.compare(s1.getId(), s2.getId());
				} else {
					return s1.getName().compareTo(s2.getName());
				}
			}

		}
	}
}