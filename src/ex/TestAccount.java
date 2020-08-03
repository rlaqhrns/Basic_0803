package ex;

import java.util.Scanner;

public class TestAccount {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Account account = new Account();
//		System.out.print("이름 : ");
		account.setOwnerName("홍길동");
//		System.out.print("계좌번호 : ");
		account.setAccountNumber(101);
//		System.out.print("잔고 : ");
		account.setBalance(10000);
		System.out.println(account);
		while (true) {
			System.out.println();
			System.out.print("입금하려면 '1', 출금하려면 '2' : ");
			int N = sc.nextInt();
			if (N == 1) {
				System.out.print("입금 : ");
				account.deposit(sc.nextInt());
				System.out.println("잔액 : " + account.getBalance());
			} else if (N == 2) {
				System.out.print("출금 : ");
				account.withdraw(sc.nextInt());
				System.out.println("잔액 : " + account.getBalance());
			} else {
				break;
			}
		}
		System.out.println();
		System.out.println(account);
	}
}
