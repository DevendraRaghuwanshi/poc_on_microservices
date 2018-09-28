package org.raml;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStream;
import java.util.List;

import org.raml.parser.rule.ValidationResult;
import org.raml.parser.visitor.RamlValidationService;

public class Validator {
	public static void main(String[] arguments) throws FileNotFoundException {
		File file = new File(
				"/path/to/myramlfile.raml");
		InputStream stream = new FileInputStream(file);
		List<ValidationResult> results = RamlValidationService.createDefault()
				.validate(stream);
		System.out.println("Validation Results:");
		for (ValidationResult item : results) {
			printResult(item);
		}
	}

	private static void printResult(ValidationResult item) {
		StringBuilder stringBuilder = new StringBuilder();
		stringBuilder.append("\t");
		stringBuilder.append(item.getLevel());
		stringBuilder.append(" ");
		stringBuilder.append(item.getMessage());
		stringBuilder.append(" (line ");
		stringBuilder.append(item.getLine());
		if (item.getStartColumn() != -1) {
			stringBuilder.append(", col ");
			stringBuilder.append(item.getStartColumn());
			if (item.getEndColumn() != item.getStartColumn()) {
				stringBuilder.append(" to ");
				stringBuilder.append(item.getEndColumn());
			}
			stringBuilder.append(")");
			System.out.println(stringBuilder.toString());
		}
	}
}
