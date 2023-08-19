package com.eqipped.productService.helper;

import java.util.Date;

public class ProductRequest {


    private String vendorId;

    private Date date;

    private String vendorName;

    private String vendorEmail;

    private String productName; // product Type also

    private String productDescription;
    private String category;
    private Long productQuantity; // no. of products

    private float individualProductPrice;

    private float TotalProductPrice;

    private String status;

    private String action;

    private String imageName;

    private String imagePath;

    public String getVendorId() {
        return vendorId;
    }

    public void setVendorId(String vendorId) {
        this.vendorId = vendorId;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public String getVendorName() {
        return vendorName;
    }

    public void setVendorName(String vendorName) {
        this.vendorName = vendorName;
    }

    public String getVendorEmail() {
        return vendorEmail;
    }

    public void setVendorEmail(String vendorEmail) {
        this.vendorEmail = vendorEmail;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public String getProductDescription() {
        return productDescription;
    }

    public void setProductDescription(String productDescription) {
        this.productDescription = productDescription;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public Long getProductQuantity() {
        return productQuantity;
    }

    public void setProductQuantity(Long productQuantity) {
        this.productQuantity = productQuantity;
    }

    public float getIndividualProductPrice() {
        return individualProductPrice;
    }

    public void setIndividualProductPrice(float individualProductPrice) {
        this.individualProductPrice = individualProductPrice;
    }

    public float getTotalProductPrice() {
        return TotalProductPrice;
    }

    public void setTotalProductPrice(float totalProductPrice) {
        TotalProductPrice = totalProductPrice;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getAction() {
        return action;
    }

    public void setAction(String action) {
        this.action = action;
    }

    public String getImageName() {
        return imageName;
    }

    public void setImageName(String imageName) {
        this.imageName = imageName;
    }

    public String getImagePath() {
        return imagePath;
    }

    public void setImagePath(String imagePath) {
        this.imagePath = imagePath;
    }
}
