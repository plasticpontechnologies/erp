package com.plasticon.erp.payload;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Data
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor

public class UploadFileResponse {
	
	private String fileName;
	private String fileDownloadUri;
	private String fileType;
	private long size;

}
