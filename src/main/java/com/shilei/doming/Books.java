package com.shilei.doming;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

/**
 * @Author sl
 * @date 2021/4/13 10:36
 */
@Data
@AllArgsConstructor //有参构造
@NoArgsConstructor //无参构造
public class Books {
    private int id;
    private String bookName;
    private int bookCounts;
    private Date storageTime;
    private String detail;
}
