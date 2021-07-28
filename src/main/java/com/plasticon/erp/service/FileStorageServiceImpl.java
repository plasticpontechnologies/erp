package com.plasticon.erp.service;

import java.io.IOException;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.util.StringUtils;

import com.plasticon.erp.exception.FileStorageException;
import com.plasticon.erp.exception.MyFileNotFoundException;
import com.plasticon.erp.model.FileModel;
import com.plasticon.erp.repository.DBFileRepository;
@Service
public class FileStorageServiceImpl implements FileStorageService {

	@Autowired
	private DBFileRepository dbFileRepository;

	@Override
	public FileModel storeFile(MultipartFile file) {

		String fileName = StringUtils.cleanPath(file.getOriginalFilename());

		try {
			if (fileName.contains("..")) {
				throw new FileStorageException("Sorry! your file contails invalid characters...");
			}

			FileModel fileModel = new FileModel();
			fileModel.setFileName(fileName);
			//fileModel.setFileType(file.getContentType());
			fileModel.setData(file.getBytes());

			return dbFileRepository.save(fileModel);

		} catch (IOException ioe) {
			throw new FileStorageException("could not store file " + fileName + " Please try again, " + ioe);
		}

	}

	@Override
	public FileModel getFile(int fileId) {

		return dbFileRepository.findById(fileId)
		  .orElseThrow(() -> new MyFileNotFoundException("File not found with id " + fileId));
	}
	@Override
	public void deleteFile(int fileId) {
		// TODO Auto-generated method stub
		 dbFileRepository.deleteById(fileId);
	}
	@Override
	public Optional<FileModel> getFile1(int fileId) {
		// TODO Auto-generated method stub
		return  dbFileRepository.findById(fileId);
	}


	
}
