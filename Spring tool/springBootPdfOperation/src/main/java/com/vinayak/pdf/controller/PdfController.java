package com.vinayak.pdf.controller;

import java.io.ByteArrayInputStream;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.io.InputStreamResource;
import org.springframework.http.HttpHeaders;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.vinayak.pdf.service.impl.PdfServiceImpl;

@RestController
@RequestMapping("/pdf")
public class PdfController {

	// Inject the ServiceImpl Here
	@Autowired
	private PdfServiceImpl pdfServiceImpl;

	@PostMapping("/createPdf")
	public ResponseEntity<InputStreamResource> createPdf() {

		ByteArrayInputStream pdf = pdfServiceImpl.createPdf();

		HttpHeaders httpHeaders = new HttpHeaders();
		return ResponseEntity.ok().headers(httpHeaders).contentType(MediaType.APPLICATION_PDF)
				.body(new InputStreamResource(pdf));

	}

}
