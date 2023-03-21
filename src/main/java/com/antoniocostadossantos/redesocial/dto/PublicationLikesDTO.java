package com.antoniocostadossantos.redesocial.dto;

public class PublicationLikesDTO {

    private Long onwerId;
    private Long publicationId;

    public Long getOnwerId() {
        return onwerId;
    }

    public void setOnwerId(Long onwerId) {
        this.onwerId = onwerId;
    }

    public Long getPublicationId() {
        return publicationId;
    }

    public void setPublicationId(Long publicationId) {
        this.publicationId = publicationId;
    }
}
