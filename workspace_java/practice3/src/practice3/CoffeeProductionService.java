package practice3;

import java.util.Scanner;

public class CoffeeProductionService {

    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        startMenu();
    }
    // 1단계: 시작 메뉴
    public static void startMenu() {
        while (true) {
            System.out.println("\n=== 커피 생산 관리 시스템 ===");
            System.out.println("1. 커피 종류 선택");
            System.out.println("2. 시스템 종료");
            System.out.print("번호 선택 > ");
            int choice = sc.nextInt();

            switch (choice) {
                case 1:
                    selectMainType();
                    break;
                case 2:
                    System.out.println("시스템을 종료합니다.");
                    return;
                default:
                    System.out.println("잘못된 입력입니다.");
            }
        }
    }

    // 2단계: 커피 종류 선택
    public static void selectMainType() {
        while (true) {
            System.out.println("\n[커피 종류 선택]");
            System.out.println("1. 에스프레소 계열");
            System.out.println("2. 콜드브루 계열");
            System.out.println("3. 처음으로 돌아가기");
            System.out.println("4. 종료");
            System.out.print("선택 > ");
            int choice = sc.nextInt();

            switch (choice) {
                case 1:
                    selectEspressoType();
                    break;
                case 2:
                    selectColdBrewType();
                    break;
                case 3:
                    return;
                case 4:
                    System.out.println("시스템을 종료합니다.");
                    System.exit(0);
                default:
                    System.out.println("잘못된 입력입니다.");
            }
        }
    }

    // 3단계: 에스프레소 계열 선택
    public static void selectEspressoType() {
        while (true) {
            System.out.println("\n[에스프레소 세부 선택]");
            System.out.println("1. 아메리카노 - 3000원");
            System.out.println("2. 카페라떼 - 3500원");
            System.out.println("3. 카푸치노 - 4000원");
            System.out.println("4. 처음으로 돌아가기");
            System.out.println("5. 종료");
            System.out.print("선택 > ");
            int choice = sc.nextInt();

            switch (choice) {
                case 1:
                    confirmSelection("아메리카노", 3000);
                    break;
                case 2:
                    confirmSelection("카페라떼", 3500);
                    break;
                case 3:
                    confirmSelection("카푸치노", 4000);
                    break;
                case 4:
                    return;
                case 5:
                    System.out.println("시스템을 종료합니다.");
                    System.exit(0);
                default:
                    System.out.println("잘못된 입력입니다.");
            }
        }
    }

    // 3단계: 콜드브루 계열 선택
    public static void selectColdBrewType() {
        while (true) {
            System.out.println("\n[콜드브루 세부 선택]");
            System.out.println("1. 기본 콜드브루 - 3500원");
            System.out.println("2. 콜드브루 라떼 - 4000원");
            System.out.println("3. 바닐라 콜드브루 - 4500원");
            System.out.println("4. 처음으로 돌아가기");
            System.out.println("5. 종료");
            System.out.print("선택 > ");
            int choice = sc.nextInt();

            switch (choice) {
                case 1:
                    confirmSelection("기본 콜드브루", 3500);
                    break;
                case 2:
                    confirmSelection("콜드브루 라떼", 4000);
                    break;
                case 3:
                    confirmSelection("바닐라 콜드브루", 4500);
                    break;
                case 4:
                    return;
                case 5:
                    System.out.println("시스템을 종료합니다.");
                    System.exit(0);
                default:
                    System.out.println("잘못된 입력입니다.");
            }
        }
    }

    // 최종 확인 및 출력
    public static void confirmSelection(String coffeeName, int price) {
        System.out.println("\n✔️ 선택한 커피: " + coffeeName + " / 가격: " + price + "원");
        System.out.println("계속하려면 Enter를 누르세요...");
        sc.nextLine(); // 이전 입력 버퍼 제거
        sc.nextLine(); // 엔터 대기
    }
}


