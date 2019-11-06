package com.baizhi.Action;



import org.apache.commons.io.FileUtils;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.multipart.MultipartFile;

import javax.servlet.http.HttpSession;
import java.io.File;

@Controller
@RequestMapping("/first")
public class FristAction {
    
    //这是远程连接


	//这是git
	
    @RequestMapping("/a")
    public String a(MultipartFile upload, HttpSession session)throws Exception{
        String realPath = session.getServletContext().getRealPath("/upload");
        File file = new File(realPath + "/" + upload.getOriginalFilename());
        upload.transferTo(file);
        return "index";
    }

    @RequestMapping("/b")
    public ResponseEntity<byte[]> b(String filename,HttpSession session)throws Exception{
        String realPath = session.getServletContext().getRealPath("/upload");
        File file = new File(realPath + "/" + filename);
        byte[] bytes = FileUtils.readFileToByteArray(file);
        //http请求头
        HttpHeaders httpHeaders = new HttpHeaders();
        String s = new String(filename.getBytes("utf-8"), "ISO-8859-1");
        httpHeaders.setContentDispositionFormData("attachment",s);
        httpHeaders.setContentType(MediaType.APPLICATION_OCTET_STREAM);
        return new ResponseEntity<byte[]>(bytes,httpHeaders, HttpStatus.CREATED);
    }
}
