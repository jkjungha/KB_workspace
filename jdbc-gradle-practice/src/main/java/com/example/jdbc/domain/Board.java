package com.example.jdbc.domain;

import java.time.LocalDateTime;

public class Board {
    private int bno;
    private String title;
    private String content;
    private String writer;
    private LocalDateTime createdAt;
    private String fileName;
    private byte[] fileData;

    public Board() {}

    public Board(String title, String content, String writer, String fileName, byte[] fileData) {
        this.title = title;
        this.content = content;
        this.writer = writer;
        this.fileName = fileName;
        this.fileData = fileData;
    }

    public int getBno() { return bno; }
    public void setBno(int bno) { this.bno = bno; }
    public String getTitle() { return title; }
    public String getContent() { return content; }
    public String getWriter() { return writer; }
    public LocalDateTime getCreatedAt() { return createdAt; }
    public void setCreatedAt(LocalDateTime createdAt) { this.createdAt = createdAt; }
    public String getFileName() { return fileName; }
    public byte[] getFileData() { return fileData; }
}
