package com.example.jdbc.domain;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Board {
    private int bno;
    private String title;
    private String content;
    private String writer;
    private LocalDateTime createdAt;
    private String fileName;
    private byte[] fileData;

    public Board(String title, String content, String writer, String fileName, byte[] fileData) {
        this.title = title;
        this.content = content;
        this.writer = writer;
        this.fileName = fileName;
        this.fileData = fileData;
    }
}
