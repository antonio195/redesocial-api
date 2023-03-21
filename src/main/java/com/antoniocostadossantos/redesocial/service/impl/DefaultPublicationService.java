package com.antoniocostadossantos.redesocial.service.impl;

import com.antoniocostadossantos.redesocial.entity.Publication;
import com.antoniocostadossantos.redesocial.repository.PublicationRepository;
import com.antoniocostadossantos.redesocial.service.PublicationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DefaultPublicationService implements PublicationService {

    @Autowired
    PublicationRepository publicationRepository;

    @Override
    public List<Publication> findAllPublications() {
        return publicationRepository.findAll();
    }

    @Override
    public void deletePublication(Long id) {
        Publication existPublication = publicationRepository.findById(id)
                .orElseThrow(IllegalArgumentException::new);
        publicationRepository.deleteById(existPublication.getId());
    }
}
