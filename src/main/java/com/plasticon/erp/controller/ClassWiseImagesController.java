package com.plasticon.erp.controller;

import java.io.IOException;
import java.util.List;
import java.util.Optional;

import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.util.StreamUtils;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import com.plasticon.erp.model.ClassDetails;
import com.plasticon.erp.model.ClassWiseImages;
import com.plasticon.erp.model.FileModel;
import com.plasticon.erp.service.ClassWiseImagesService;

@RestController
@RequestMapping(value = "/claimg")
public class ClassWiseImagesController {
	@Autowired
	ClassWiseImagesService classWiseImagesService;

	@PostMapping(value = "/uploadFile")
	public String uploadFile(@RequestParam("file") MultipartFile file,@RequestParam String title,@RequestParam int clId) throws IOException {
		//ClassWiseImages cl=classWiseImagesService.storeFile(file,title);
		ClassDetails cd=new ClassDetails();
		cd.setClId(clId);
		ClassWiseImages cl=new ClassWiseImages();
		cl.setTitle(title);
		cl.setImg(file.getBytes());
		cl.setClimg(cd);
		classWiseImagesService.save(file,cl,clId);
		//FileModel fileModel = fileStorageService.storeFile(file);
		return "Success";
	}
	/*
	 * @PostMapping(value = "/save") public String uploadFile(@RequestParam("file")
	 * MultipartFile file,@RequestParam("title") String title) throws IOException {
	 * 
	 * 
	 * ClassDetails cdt=new ClassDetails(); cdt.setClId(cdt.getClId());
	 * cw.setTitle(cw.getTitle());
	 * 
	 * //cw.setClimg(cdt); ClassWiseImages cl=classWiseImagesService.save(file);
	 * return "ss";
	 * 
	 * }
	 */
	@GetMapping(value = "/get/{clImageId}")
	public void get(@PathVariable int clImageId, HttpServletResponse response) throws IOException {
		response.setContentType("image/jpeg");
		//ClassWiseImages cwi = new ClassWiseImages();
		//cwi.setTitle(cwi.getTitle());
		// cwi.setClimg(cwi.getClimg());

		Optional<ClassWiseImages> fil = classWiseImagesService.get(clImageId);
		if (fil.isPresent()) {

			byte[] image = fil.get().getImg();

			StreamUtils.copy(image, response.getOutputStream());
		}

	}

	@GetMapping(value = "/getall")
	public List<ClassWiseImages> getAll(HttpServletResponse response) throws IOException {
		response.setContentType("image/jpeg");

		List<ClassWiseImages> lis = classWiseImagesService.getAll();

		byte[] image = lis.get(0).getImg();

		StreamUtils.copy(image, response.getOutputStream());

		return lis;
	}
}
