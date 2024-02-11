package WeeklyQuiz.phonebook;

import java.util.Scanner;

public class Main {
    static int number;
    static String name;
    static String phoneNumber;
    static String company;
    static String realationship;
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        BusinessContact businessContact = new BusinessContact();
        PersonalContact personalContact = new PersonalContact();
        AddressBook addressBook = new AddressBook();
        int N;
        while(true){
            System.out.println("=========================");
            System.out.println("1. 비즈니스 연락처 추가");
            System.out.println("2. 개인 연락처 추가");
            System.out.println("3. 연락처 출력");
            System.out.println("4. 연락처 검색");
            System.out.println("5. 종료");
            System.out.println("=========================");
            System.out.print(">> 메뉴를 선택해주세요 : ");
            N = sc.nextInt();

            switch(N){
                case 1:
                    System.out.print("이름을 입력하세요 :");
                    name = sc.next();
                    System.out.print("전화번호를 입력하세요 :");
                    phoneNumber = sc.next();
                    System.out.print("회사명을 입력하세요 :");
                    company = sc.next();
                    addressBook.addContact(new BusinessContact(name,phoneNumber,company));
                    break;
                case 2:
                    System.out.print("이름을 입력하세요 :");
                    name = sc.next();
                    System.out.print("전화번호를 입력하세요 :");
                    phoneNumber = sc.next();
                    System.out.print("관계를 입력하세요 :");
                    realationship = sc.next();
                    addressBook.addContact(new PersonalContact(name,phoneNumber,realationship));
                    break;
                case 3:
                    addressBook.displayContacts();
                    break;
                case 4:
                    System.out.print("검색할 이름을 입력하세요:");
                    name=sc.next();
                    addressBook.searchContact(name);
                    break;
                case 5:
                    System.exit(0);
            }

        }
    }
}
