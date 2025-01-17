package com.upemor.petsorerest.restcontroller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.upemor.petsorerest.model.Tag;
import com.upemor.petsorerest.service.TagService;

@RestController
@RequestMapping("/api/tag")
public class TagController {
	
	@Autowired
	private TagService tagService;
	
	@GetMapping("/")
	public ResponseEntity<List<Tag>> listallTags(){
		List<Tag> tags = tagService.listAllTags();
		return new ResponseEntity<List<Tag>>(tags, HttpStatus.OK);
	}

}
