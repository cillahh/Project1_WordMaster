import java.util.Scanner;

public class WordManager {
    Scanner s = new Scanner(System.in);
    WordCRUD wordCRUD;
    WordManager() {
        wordCRUD = new WordCRUD(s);
    }
    public int selectMenu() {
        System.out.println("\n\n*** 영단어 마스터 ***\n"
        + "******************\n"
        + "1. 모든 단어 보기\n"
        + "2. 수준별 단어 보기\n"
        + "3. 단어 검색\n"
        + "4. 단어 추가\n"
        + "5. 단어 수정\n"
        + "6. 단어 삭제\n"
        + "7. 파일 저장\n"
        + "0. 나가기\n"
        + "******************");
        System.out.print("=> 원하는 메뉴는?");

        return s.nextInt();
    }

    public void start() {

        wordCRUD.loadFile();
        while (true) {
            int menu = selectMenu();

            //종료
            if(menu==0) break;
            //추가
            if(menu==4) {
                wordCRUD.addItem();
            }
            //확인
            else if(menu==1) {
                wordCRUD.listAll();
            }
            //수정
            else if(menu==5) {
                wordCRUD.updateItem();
            }
            //삭제
            else if(menu==6) {
                wordCRUD.deleteItem();
            }


        }
        System.out.println("\n프로그램 종료! 다음에 만나요~ :)");
    }
}
