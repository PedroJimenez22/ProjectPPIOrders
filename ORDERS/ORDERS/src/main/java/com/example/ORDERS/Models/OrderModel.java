package com.example.ORDERS.Models;

import jakarta.persistence.*;

@Entity
@Table(name = "orders")

public class OrderModel {
        @Id
        @GeneratedValue(strategy = GenerationType.IDENTITY)
        @Column(nullable = false, unique = true)

        private long id;

        private String nameC;

        private Integer code;

        private String size;

        private String milk;

        public long getId() {
                return id;
        }

        public void setId(long id) {
                this.id = id;
        }

        public String getNameC() {
                return nameC;
        }

        public void setNameC(String nameC) {
                this.nameC = nameC;
        }

        public Integer getCode() {
                return code;
        }

        public void setCode(Integer code) {
                this.code = code;
        }

        public String getSize() {
                return size;
        }

        public void setSize(String size) {
                this.size = size;
        }

        public String getMilk() {
                return milk;
        }

        public void setMilk(String milk) {
                this.milk = milk;
        }

        public String getName() {
                return name;
        }

        public void setName(String name) {
                this.name = name;
        }

        private String name;

}
