package com.plasticon.erp.controller;

import java.io.IOException;
import java.sql.Blob;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.io.ByteArrayResource;
import org.springframework.core.io.Resource;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.util.StreamUtils;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import com.plasticon.erp.model.FileModel;
import com.plasticon.erp.payload.UploadFileResponse;
import com.plasticon.erp.service.FileStorageService;

@RestController
@RequestMapping(value = "/up")
public class FileController {

	@Autowired
	private FileStorageService fileStorageService;

	@PostMapping(value = "/uploadFile")
	public String uploadFile(@RequestParam("file") MultipartFile file) {
		FileModel fileModel = fileStorageService.storeFile(file);
		return "Success";
/*
		String fileDownloadUri = ServletUriComponentsBuilder.fromCurrentContextPath().path("/downloadFile/")
				.path(fileModel.getId()).toUriString();
		UploadFileResponse uploadFileResponse = new UploadFileResponse();
		uploadFileResponse.setFileName(fileModel.getFileName());
		uploadFileResponse.setFileType(file.getContentType());
		uploadFileResponse.setSize(file.getSize());
		uploadFileResponse.setFileDownloadUri(fileDownloadUri);
		return uploadFileResponse;*/
	}

	@PostMapping(value = "/uploadMultipleFiles")
	public List<String> uploadMulitpleFiles(@RequestParam("file") MultipartFile[] files) {
		return Arrays.asList(files).stream().map(file -> uploadFile(file)).collect(Collectors.toList());
	}

/*	@GetMapping(value = "/downloadFile/{fileId}")
	public ResponseEntity<Resource> downloadFile(@PathVariable int fileId) {

		FileModel fileModel = fileStorageService.getFile(fileId);
		return ResponseEntity.ok().contentType(MediaType.parseMediaType(fileModel.getFileType()))
				.header(HttpHeaders.CONTENT_DISPOSITION, "attachment; filename=\"" + fileModel.getFileName() + "\"")
				.body(new ByteArrayResource(fileModel.getData()));
	}*/

	@DeleteMapping(value = "/delete/{fileId}")
	public void delete(@PathVariable int fileId) {
		fileStorageService.deleteFile(fileId);
	}

	@GetMapping(value = "/get/{fileId}")
	public void get(@PathVariable int fileId, HttpServletResponse response) throws IOException {
		response.setContentType("image/jpeg");
		Optional<FileModel> fil = fileStorageService.getFile1(fileId);
		if (fil.isPresent()) {

			byte[] image = fil.get().getData();

			StreamUtils.copy(image, response.getOutputStream());
		}

	}

	
	  @GetMapping(value="/getall")
	  public String getAll(HttpServletResponse response) throws IOException{ 
		 response.setContentType("image/jpeg");
	  for(FileModel file:fileStorageService.getFiles()) {
	  byte[] image = file.getData();
	  StreamUtils.copy(image, response.getOutputStream()); 
	  } 
	  return "ss";
		  
	  
	  }
		/*
		 * @GetMapping("/files") public ResponseEntity<List<FileModel>> getListFiles() {
		 * List<FileModel> files = fileStorageService.getFiles().map(dbFile -> { String
		 * fileDownloadUri = ServletUriComponentsBuilder .fromCurrentContextPath()
		 * .path("/files/") .fromPath(dbFile.getId()) .toUriString();
		 * 
		 * return new FileModel( dbFile.getName(), fileDownloadUri,
		 * 
		 * dbFile.getData().length); }).collect(Collectors.toList());
		 * 
		 * return ResponseEntity.status(HttpStatus.OK).body(files); }
		 */

}
