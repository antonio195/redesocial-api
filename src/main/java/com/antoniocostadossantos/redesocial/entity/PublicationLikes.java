package com.antoniocostadossantos.redesocial.entity;

import javax.persistence.*;

@Entity
@Table(name = "postLikesEntity")
public class PublicationLikes {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private Long onwerId;

    private Long publicationId;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

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
