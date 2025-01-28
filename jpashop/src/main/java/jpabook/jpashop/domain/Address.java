package jpabook.jpashop.domain;

import jakarta.persistence.Embeddable;
import lombok.Getter;


@Embeddable // jpa 내장 타입
@Getter
public class Address {

    private String city;
    private String street;
    private String zipcode;

    protected Address() {
    }

    public Address(String street, String zipcode, String city) {
        this.street = street;
        this.zipcode = zipcode;
        this.city = city;
    }
}
