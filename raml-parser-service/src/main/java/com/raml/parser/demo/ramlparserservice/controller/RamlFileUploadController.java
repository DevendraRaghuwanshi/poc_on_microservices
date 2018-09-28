package com.raml.parser.demo.ramlparserservice.controller;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

import org.raml.v2.internal.impl.RamlValidator;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;

/**
 * @author draghuwanshi
 *
 */

@Controller
public class RamlFileUploadController {

	

	// Save the uploaded file to this folder
	private static String UPLOADED_FOLDER = "D://temp//";

	@RequestMapping(value = "/")
	public String uploadRaml() {
		return "upload";
	}

	@PostMapping(value = "/upload")
	public String validateRaml(@RequestParam("file") MultipartFile file, ModelMap modelMap) {
		if (file.isEmpty()) {
			modelMap.put("message", "Please select a file to upload");
			return "uploadStatus";
		}
		try {

			// Get the file and save it somewhere
			byte[] bytes = file.getBytes();
			Path path = Paths.get(UPLOADED_FOLDER + file.getOriginalFilename());
			Files.write(path, bytes);
			RamlValidator rpv = new RamlValidator(true, UPLOADED_FOLDER + file.getOriginalFilename());
			rpv.validate();
			modelMap.put("message", "You successfully uploaded '" + file.getOriginalFilename() + "'");

		} catch (IOException e) {
			e.printStackTrace();
		}

		return "uploadStatus";
	}
}
