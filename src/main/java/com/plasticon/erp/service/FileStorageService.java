package com.plasticon.erp.service;


import java.util.List;
import java.util.Optional;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;
import com.plasticon.erp.model.FileModel;
@Service
public interface FileStorageService {
	
	public FileModel storeFile(MultipartFile file);
	public FileModel getFile(int fileId);
	public void deleteFile(int fileId);
	public Optional<FileModel> getFile1(int fileId); 
	public List<FileModel> getFiles();
}
