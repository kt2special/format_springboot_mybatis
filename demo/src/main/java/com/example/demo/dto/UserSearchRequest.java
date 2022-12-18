package com.example.demo.dto;

import java.io.Serializable;

import lombok.Data;

//検索用のリクエストデータ
@Data
public class UserSearchRequest implements Serializable {

  private Long id;
}