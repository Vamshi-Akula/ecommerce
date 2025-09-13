package com.akula.ecommerce.model;

import com.fasterxml.jackson.annotation.JsonFilter;
import com.fasterxml.jackson.annotation.JsonFormat;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Product {

            @Id
            @GeneratedValue(strategy = GenerationType.IDENTITY)
            private int id;
            private String name;
            private String description;
            private String brand;
            private int price;
            private String category;

            @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "dd-MM-yyyy")
            private Date releaseDate;
            private boolean productAvailable;
            private int stockQuantity;

            private String imageName;



    private String imageType;


    @Lob
            private byte[] imageDate;

    public void setImageName(String originalFilename) {
    }

//    public void setImageType(String contentType) {
//    }

    public byte[] getImageDate() {
        return imageDate;
    }

    public void setImageDate(byte[] imageDate) {
        this.imageDate = imageDate;
    }

    public String getImageType() {
        return imageType;
    }

    public void setImageType(String imageType) {
        this.imageType = imageType;
    }

}
