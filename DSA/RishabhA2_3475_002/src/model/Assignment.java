/**
 * Author: Rishabh Banerjee
 * Date: Nov 29 2023
 */

package model;

import java.util.Date;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Scanner;

import driver.Launcher;

/**
 * The {@code Assignment} class represents an assignment with a course name,
 * task description, and due date. It implements the {@code Comparable}
 * interface to allow comparisons based on due dates.
 */

public class Assignment implements Comparable<Assignment> {

	private String course; // Course name for the assignment
	private String task; // Task description for the assignment
	private Date date; // Due date of the assignment

	/**
	 * Constructs an {@code Assignment} object by taking input from the user for
	 * course name, task, and due date. The due date input is validated to ensure it
	 * is in the format "YYYY-MM-DD".
	 */
	public Assignment() {

		boolean validDateProvided = false;
		Scanner scanner = Launcher.scanner;

		System.out.print("\n\nEnter Course Name: ");
		this.course = scanner.nextLine();

		System.out.print("\nEnter Assignment Task: ");
		this.task = scanner.nextLine();

		// Loop to ensure a valid date is provided
		while (!validDateProvided) {
			System.out.println("Enter Due Date(YYYY-MM-DD):");
			try {
				this.date = parseDate(scanner.nextLine());
				validDateProvided = true;
//			System.out.println("Date Entered: " + selectedDate);
			} catch (ParseException e) {
				System.out.println("Invalid date format. Please use YYYY-MM-DD.");
			}
		}
	}

	/**
	 * Constructs an {@code Assignment} object with the provided course name, task,
	 * and due date.
	 *
	 * @param course The course name.
	 * @param task   The task description.
	 * @param date   The due date.
	 */
	public Assignment(String course, String task, Date date) {
		super();
		this.course = course;
		this.task = task;
		this.date = date;
	}

	/**
	 * Gets the course name of the assignment.
	 *
	 * @return The course name.
	 */
	public String getCourse() {
		return course;
	}

	/**
	 * Sets the course name of the assignment.
	 *
	 * @param course The course name to set.
	 */
	public void setCourse(String course) {
		this.course = course;
	}

	/**
	 * Gets the task description of the assignment.
	 *
	 * @return The task description.
	 */
	public String getTaskString() {
		return task;
	}

	/**
	 * Sets the task description of the assignment.
	 *
	 * @param task The task description to set.
	 */
	public void setTaskString(String task) {
		this.task = task;
	}

	/**
	 * Gets the due date of the assignment.
	 *
	 * @return The due date.
	 */
	public Date getDate() {
		return date;
	}

	/**
	 * Sets the due date of the assignment.
	 *
	 * @param date The due date to set.
	 */
	public void setDate(Date date) {
		this.date = date;
	}

	/**
	 * Compares this assignment to another based on their due dates.
	 *
	 * @param o The assignment to compare to.
	 * @return A negative integer, zero, or a positive integer as this assignment is
	 *         before, equal to, or after the specified assignment.
	 */
	@Override
	public int compareTo(Assignment o) {
		return this.date.compareTo(o.getDate());
	}

	/**
	 * Returns a string representation of the assignment.
	 *
	 * @return A string containing the course name, due date, and task description.
	 */
	@Override
	public String toString() {
		String dateString = new SimpleDateFormat("yyyy-MM-dd").format(this.date);
		return "\n" + this.course + "\t\t\t\t" + getMonthName(Integer.parseInt(dateString.substring(5, 7))) + "-" + dateString.substring(8) + "-"
				+ dateString.substring(0, 4) + "\n" + this.task + "\n";
	}

	/**
	 * Parses a date string into a {@code Date} object.
	 *
	 * @param input The date string to parse.
	 * @return A {@code Date} object representing the parsed date.
	 * @throws ParseException If the date string is not in the expected format.
	 */
	private static Date parseDate(String input) throws ParseException {
		SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
		return dateFormat.parse(input);
	}
	
	public static String getMonthName(int monthNumber) {
        String[] monthNames = {
                "January", "February", "March", "April", "May", "June",
                "July", "August", "September", "October", "November", "December"
        };

        return monthNames[--monthNumber];
    }

}
