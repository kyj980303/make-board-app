/*
 * 게시판관리 애플리케이션 만들기!
 */
package com.bitcamp.board;

public class App {
    public static void main(String[] args) {
        System.out.println("[ 게시판 애플리케이션 만들기 ]");
        System.out.println("환영합니다!!");
        java.util.Scanner keyboardInput = new java.util.Scanner(System.in);
        while(true) {
          System.out.println("메뉴 :");
          System.out.println("  1: 게시글 목룍");
          System.out.println("  2: 게시글 상세보기");
          System.out.println("메뉴를 선택하세요[1..2](0:종료)");
          int menuNo = keyboardInput.nextInt();
          if(menuNo == 0) {
            break;
          }
          
          if(menuNo == 1){
            System.out.println();
            System.out.println("[ 게시글 목록 ]");
            System.out.println("--------------------------------------------------");
            System.out.println();
            System.out.print("번호 \t");
            System.out.print("제목 \t\t");
            System.out.print("조회수 \t");
            System.out.print("작성자 \t");
            System.out.print("등록일 \t\n");
            System.out.println("1\t"+"제목입니다1\t"+"20\t"+"홍길동\t"+"2022-07-08");
            System.out.println("2\t"+"제목입니다2\t"+"11\t"+"홍길동\t"+"2022-07-08");
            System.out.println("3\t"+"제목입니다3\t"+"11\t"+"홍길동\t"+"2022-07-08");
            System.out.println("4\t"+"제목입니다4\t"+"45\t"+"홍길동\t"+"2022-07-08");
            System.out.println();
            System.out.println("--------------------------------------------------");
          }else if (menuNo == 2){
            System.out.println();
            System.out.println("[ 게시판 상세보기 ]");
            System.out.println("--------------------------------------------------");
            System.out.println();
            System.out.println("번호   : 1");
            System.out.println("제목   : 제목입니다1");
            System.out.println("내용   : 내용입니다.");
            System.out.println("조회수 : 100");
            System.out.println("작성자 : 홍길동");
            System.out.println("등록일 : 2022-07-08");
            System.out.println();
            System.out.println("--------------------------------------------------");
          }
        } //while문 끝
        System.out.println("게시판 애플리케이션을 종료합니다!");
        keyboardInput.close();
    }
}
