package com.plasticon.erp.service;

import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import com.plasticon.erp.model.FileModel;

@Service
public interface FileStorageService {
	
	public FileModel storeFile(MultipartFile file);
	public FileModel getFile(String fileId);

}
