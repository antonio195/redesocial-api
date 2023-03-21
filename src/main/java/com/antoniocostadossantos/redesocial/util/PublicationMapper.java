package com.antoniocostadossantos.redesocial.util;

import com.antoniocostadossantos.redesocial.builder.PublicationBuilder;
import com.antoniocostadossantos.redesocial.dto.PublicationDTO;
import com.antoniocostadossantos.redesocial.entity.Publication;

public class PublicationMapper {

    public Publication publicationDTOToPublication(PublicationDTO publicationDTO) {
        Publication newPublication = PublicationBuilder.create()
                .addMessage(publicationDTO.getMessage())
                .addDate()
                .addOwner(publicationDTO.getOwnerId())
                .build();
        return newPublication;
    }

}
