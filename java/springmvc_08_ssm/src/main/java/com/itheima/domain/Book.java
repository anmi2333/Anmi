package com.itheima.domain;

/**
 * @projectName:    springmvc_01_quickstart
 * @package:        com.itheima.domain
 * @className:      User
 * @NAME:     WANG CHAO
 * @date:    2023/09/02 23:10
 */
 @SuppressWarnings({"all"})
public class Book {
 private Integer id;
 private String type;
 private String name;
 private String description;

 @Override
 public String toString() {
  return "Book{" +
          "id=" + id +
          ", type='" + type + '\'' +
          ", name='" + name + '\'' +
          ", description='" + description + '\'' +
          '}';
 }

 public Integer getId() {
  return id;
 }

 public void setId(Integer id) {
  this.id = id;
 }

 public String getType() {
  return type;
 }

 public void setType(String type) {
  this.type = type;
 }

 public String getName() {
  return name;
 }

 public void setName(String name) {
  this.name = name;
 }

 public String getDescription() {
  return description;
 }

 public void setDescription(String description) {
  this.description = description;
 }
}
