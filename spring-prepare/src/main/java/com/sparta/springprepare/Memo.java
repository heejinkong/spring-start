package com.sparta.springprepare;


import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.Setter;


@Getter
@Setter
//@AllArgsConstructor
//@NoArgsConstructor
@RequiredArgsConstructor
public class Memo {
    private final String username;
    private String contents;

//    public void setUsername(String username) {
//        this.username = username;
//    }
//
//    public String getUsername() {
//        return username;
//    }
}

class Main {
    public static void main(String[] args) {
        Memo memo = new Memo("Ho");
//        memo.setUsername("kong");
        System.out.println(memo.getUsername());

    }
}