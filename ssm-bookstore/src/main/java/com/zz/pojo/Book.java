package com.zz.pojo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Book {
    private Long id;

    private String bookName;

    private String bookDesc;

    private BigDecimal bookPrice;

    private String imgUrl;

    private String author;

    private Integer catId;

    private java.sql.Timestamp issueDate;

    private java.sql.Timestamp shelveOperatedAt;

    private Byte isOnShelf;

    private Long inventoryQuantity;

    private java.sql.Timestamp createdAt;

    private java.sql.Timestamp updatedAt;
}
