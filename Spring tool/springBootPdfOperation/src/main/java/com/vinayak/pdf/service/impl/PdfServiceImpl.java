package com.vinayak.pdf.service.impl;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;

import org.hibernate.engine.jdbc.Size;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

import com.lowagie.text.Chunk;
import com.lowagie.text.Document;
import com.lowagie.text.Element;
import com.lowagie.text.Font;
import com.lowagie.text.FontFactory;
import com.lowagie.text.Paragraph;
import com.lowagie.text.pdf.PdfWriter;

@Service
public class PdfServiceImpl {

	private Logger logger = LoggerFactory.getLogger(PdfServiceImpl.class);

	public ByteArrayInputStream createPdf() {
		logger.info("Create Pdf Strated :");

		String title = "JAVA Developer";
		String content = "There is no prerequisite Language to learn java language";

		ByteArrayOutputStream out = new ByteArrayOutputStream();

		Document document = new Document();
		PdfWriter.getInstance(document, out);
		document.open();

		Font titlefont = FontFactory.getFont(FontFactory.HELVETICA_BOLD);
		Paragraph titlePara = new Paragraph(title);
		titlePara.setAlignment(Element.ALIGN_CENTER);
		document.add(titlePara);

		Font paraFont = FontFactory.getFont(FontFactory.HELVETICA);
		Paragraph paragraph = new Paragraph(content);
		paragraph.add(new Chunk(
				"Content : Java is a high-level, class-based, object-oriented programming language that is designed to have as few implementation dependencies as possible."));
		document.add(paragraph);

		document.close();
		return new ByteArrayInputStream(out.toByteArray());

	}

}
