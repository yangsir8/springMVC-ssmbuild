package com.yang.pojo;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data  //(Data表示除了有参构造全有了(无参构造， getter,setter,tostring...)， 但是设置了有参构造后， 无参构造会自动消除， 还需手动加入注解)
@AllArgsConstructor
@NoArgsConstructor
public class Books {
    private  int bookID;
    private String bookName;
    private int bookCounts;
    private String detail;
}
