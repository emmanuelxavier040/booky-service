package com.booky.api.model;

import net.minidev.json.annotate.JsonIgnore;

import javax.validation.constraints.NotNull;


public class CreateCard {

    private long id;

    @NotNull
    private String title;

    @NotNull
    private String url;

    private String shortUrl;

    private String image;

    @NotNull
    private long groupId;

    @JsonIgnore
    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    @JsonIgnore
    public String getShortUrl() { return shortUrl; }

    public void setShortUrl(String shortUrl) { this.shortUrl = shortUrl; }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getUrl() {  return url; }

    public void setUrl(String url) {  this.url = url; }

    public String getImage() { return image;  }

    public void setImage(String image) {  this.image = image; }

    public long getGroupId() {  return groupId; }

    public void setGroupId(long groupId) { this.groupId = groupId; }
}