package com.antoniocostadossantos.redesocial.service;

import com.antoniocostadossantos.redesocial.builder.PublicationBuilder;
import com.antoniocostadossantos.redesocial.entity.Publication;

import java.util.List;

public interface PublicationService {

    List<Publication> findAllPublications();

    void deletePublication(Long publicationId);

}
