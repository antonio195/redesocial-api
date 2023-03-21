package com.antoniocostadossantos.redesocial.controller;

import com.antoniocostadossantos.redesocial.entity.Publication;
import com.antoniocostadossantos.redesocial.service.PublicationLikeService;
import com.antoniocostadossantos.redesocial.service.PublicationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/publication")
public class PublicationController {

    @Autowired
    private PublicationService publicationService;

    @Autowired
    private PublicationLikeService publicationLikeService;

    @GetMapping("/get-all-publications")
    public ResponseEntity<List<Publication>> getAllPublications() {
        List<Publication> publications = publicationService.findAllPublications();
        if (publications.isEmpty()) {
            return ResponseEntity.status(HttpStatus.NO_CONTENT).build();
        }
        return ResponseEntity.ok(publications);
    }

    @PostMapping("/like-post/{ownerId}/{publicationId}")
    public ResponseEntity<String> likePost(@RequestBody Long ownerId, @RequestBody Long publicationId){
        Boolean publicationLiked = publicationLikeService.
    }

}
