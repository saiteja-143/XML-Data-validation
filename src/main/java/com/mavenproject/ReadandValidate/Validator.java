package com.mavenproject.ReadandValidate;
import java.io.FileWriter;
import java.io.IOException;
import java.util.regex.Pattern;

import com.XML.javaObject.Students;


public class Validator {
	public void Validate(Students students) throws IOException {
		final String NAME_REGEX =  "^[a-zA-Z]+(([',. -][a-zA-Z ])?[a-zA-Z]*)*$";
		final Pattern NAME_PATTERN = Pattern.compile(NAME_REGEX);

		final String gender = "^(?:m|M|male|Male|f|F|female|Female)$";
		final Pattern gender_pattern = Pattern.compile(gender);

		final String Age = "^100|[1-9]?\\d$";
		final Pattern Age_pattern = Pattern.compile(Age);

		final String PHONE_REGEX = "^\\+[0-9]{2}\\s[6789]{1}\\d{9}$";

		final Pattern PHONE_PATTERN = Pattern.compile(PHONE_REGEX);

		int count = 0;
		int length = students.getStudent().size();

		for (int i = 0; i < length; i++) {

			if (NAME_PATTERN.matcher(students.getStudent().get(i).getName()).matches() && 
				gender_pattern.matcher(students.getStudent().get(i).getGender()).matches() &&
				Age_pattern.matcher(students.getStudent().get(i).getAge()).matches() &&
				PHONE_PATTERN.matcher(students.getStudent().get(i).getMobile()).matches()) 
			{

				count = count + 1;
			}

			else {
				System.out.print("Data is invalid at Xml Element with Student Name :" + "  "
						+ students.getStudent().get(i).getName() );
				System.exit(0);
			}

		}
		if (count == length) {
			String objToJson = new com.google.gson.Gson().toJson(students);

			FileWriter file = new FileWriter("output.json");
			file.write(objToJson.toString());
			file.close();

			System.out.println("JSON file created: " +"\n"+ objToJson);

		}
		else {
			System.out.println("Your data is Invalid,Check it once");
		}
		
		
	}

}
