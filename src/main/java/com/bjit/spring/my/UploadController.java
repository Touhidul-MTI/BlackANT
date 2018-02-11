package com.bjit.spring.my;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.io.Resource;
import org.springframework.http.HttpHeaders;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.servlet.mvc.method.annotation.MvcUriComponentsBuilder;

import freemarker.core.Environment;

@Controller
public class UploadController {

	@GetMapping("/up")
	public String listUploadedFiles(Model model) {
		// model.addAttribute("message","up");
		return "img";
	}

	@PostMapping(value = "/upi")
	public String upi(@RequestParam("file") MultipartFile file) {
		String fileName = createCustomFileName(file.getOriginalFilename());

		String filePath = "E:\\BJIT_work\\J2EE\\BlackANT\\src\\main\\resources\\static\\product-images";
		File path = new File(filePath);

		if (!path.exists()) {
			path.mkdirs();
		}

		// System.out.println(path.getAbsolutePath());
		// System.out.println(fileName);
		try {
			Files.copy(file.getInputStream(), Paths.get(filePath, fileName));
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return "img";
	}

	public String createCustomFileName(String fileName_old) {
		String[] fileName_array = fileName_old.split("\\.");
		String fileName_postFix = fileName_array[fileName_array.length - 1];
		String fileName_new = "blackant" + (++ImageSerial.fileName_id) + "." + fileName_postFix;

		return fileName_new;
	}

	@GetMapping(value = "/g")
	public String g(Model model) {
		model.addAttribute("image", "/product-images/blackant1.jpg");
		return "down";
	}
}