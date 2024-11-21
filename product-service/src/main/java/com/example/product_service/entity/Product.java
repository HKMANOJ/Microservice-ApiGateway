package com.example.product_service.entity;

public class Product {

    private int productID;
    private String productName;
    private String productArea;

    public Product() {
    }

    public Product(int productID, String productName, String productArea) {
        this.productID = productID;
        this.productName = productName;
        this.productArea = productArea;
    }

    public int getProductID() {
        return productID;
    }

    public void setProductID(int productID) {
        this.productID = productID;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public String getProductArea() {
        return productArea;
    }

    public void setProductArea(String productArea) {
        this.productArea = productArea;
    }

    @Override
    public String toString() {
        return "Product{" +
                "productID=" + productID +
                ", productName='" + productName + '\'' +
                ", productArea='" + productArea + '\'' +
                '}';
    }
}
