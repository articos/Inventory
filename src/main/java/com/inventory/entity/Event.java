package com.inventory.entity;

import javax.persistence.*;

import lombok.Data;

import java.util.Date;

@Entity
@Table(name = "EVENT")
public class Event {

    @Id
    @Column(name = "EVENT_ID", unique = true, nullable = false)
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "NAME")
    private String name;

    @Column(name = "EVENT_TYPE")
    private String eventType;

    @Column(name = "DESCRIPTION")
    private String description;

    @Column(name = "CREATION_DATE")
    private Date creationDate;

    @ManyToOne
    @JoinColumn(name="ITEM_ID")
    private Item item;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Item getItem() {
        return item;
    }

    public void setItem(Item item) {
        this.item = item;
    }

    public String getEventType() {
        return eventType;
    }

    public void setEventType(String eventType) {
        this.eventType = eventType;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Date getCreationDate() {
        return creationDate;
    }

    public void setCreationDate(Date creationDate) {
        this.creationDate = creationDate;
    }
}
