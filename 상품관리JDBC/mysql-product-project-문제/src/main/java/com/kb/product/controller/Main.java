package com.kb.product.controller;

import com.kb.product.dao.ProductDao;
import com.kb.product.vo.Product;
import java.io.*;

/** TODO: BufferedReader 기반 콘솔 UI를 완성하세요. */
public class Main {
    private final ProductDao productDao = new ProductDao();
    private final BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    public static void main(String[] args) throws IOException { new Main().run(); }
    private void run() throws IOException {
        while (true) {
            printMenu(); System.out.print("메뉴 선택: "); String menu = br.readLine();
            switch (menu) {
                case "1" -> insertData(); case "2" -> showList(); case "3" -> showOne(); case "4" -> showProductDetail();
                case "0" -> { System.out.println("프로그램을 종료합니다."); return; }
                default -> System.out.println("잘못된 메뉴입니다.");
            }
        }
    }
    private void printMenu() {
        System.out.println("\n==================================");
        System.out.println("상품관리 JDBC 모듈평가");
        System.out.println("==================================");
        System.out.println("1. 상품등록\n2. 상품목록\n3. 상품조회\n4. 상품상세조회\n0. 종료");
        System.out.println("==================================");
    }
    private void insertData() throws IOException { // TODO 문제 5번 구현 }
    private void showList() throws IOException { // TODO 문제 6번 구현 }
    private void printProduct(Product product) { // TODO 문제 6번 구현 }
    private void showOne() throws IOException { // TODO 문제 7번 구현 }
    private void showProductDetail() throws IOException { // TODO 문제 8번 구현 }
}
