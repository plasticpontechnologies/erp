package com.plasticon.erp.service;

import java.io.IOException;
import java.util.Base64;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.StringUtils;
import org.springframework.web.multipart.MultipartFile;

import com.plasticon.erp.exception.FileStorageException;
import com.plasticon.erp.model.ClassWiseImages;
import com.plasticon.erp.model.FileModel;
import com.plasticon.erp.repository.ClassWiseImagesRepository;

@Service
public class ClassWiseImagesService {
	@Autowired
	ClassWiseImagesRepository classWiseImagesRepository;

	public ClassWiseImages storeFile(MultipartFile file,String title) {

		String fileName = StringUtils.cleanPath(file.getOriginalFilename());

		try {
			if (fileName.contains("..")) {
				throw new FileStorageException("Sorry! your file contails invalid characters...");
			}
			ClassWiseImages clw=new ClassWiseImages();
			clw.setTitle(clw.getTitle());
			clw.setImg(file.getBytes());
			//FileModel fileModel = new FileModel();
			//fileModel.setFileName(fileName);
			//fileModel.setFileType(file.getContentType());
			//fileModel.setData(file.getBytes());

			return classWiseImagesRepository.save(clw);

		} catch (IOException ioe) {
			throw new FileStorageException("could not store file " + fileName + " Please try again, " + ioe);
		}

	}
	
	/*
	 * public void saveProductToDB(MultipartFile file,String title) throws
	 * IOException { ClassWiseImages cl=new ClassWiseImages(); String fileName =
	 * StringUtils.cleanPath(file.getOriginalFilename());
	 * if(fileName.contains("..")) { System.out.println("not a a valid file"); } try
	 * { cl.setImage(Base64.getEncoder().encodeToString(file.getBytes())); } catch
	 * (IOException e) { e.printStackTrace(); }
	 * 
	 * cl.setImage(title);; classWiseImagesRepository.save(cl); }
	 */
	
	  public ClassWiseImages save(MultipartFile file,ClassWiseImages cl,int clId) throws  IOException {
	  
	  String fileName = StringUtils.cleanPath(file.getOriginalFilename());
	  
	  if (fileName.contains("..")) { throw new
	  FileStorageException("Sorry! your file contails invalid characters..."); }
	  cl.setImg(file.getBytes());
	  cl.setTitle(cl.getTitle()); //cl.setClimg(cl.getClimg()); return
	  return classWiseImagesRepository.save(cl); 
	  }
	 

	public Optional<ClassWiseImages> get(int clImageId) {
		return classWiseImagesRepository.findById(clImageId);
	}

	public List<ClassWiseImages> getAll() {
		return classWiseImagesRepository.findAll();

	}
}
