package thi.PhanLapCong;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n;
		do {
			System.out.print("Nhap vao so nguyen duong n: ");
			n= sc.nextInt();
		}while(n<0);
		
		double S = (n*(n+1)*(2*n+1))/6.0;
		System.out.println("Tong binh phuong cac so nguyen tu 1 den n: "+ S);
		
		
	}

}
