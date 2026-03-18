package ntu.thomc;

import java.util.ArrayList;
import java.util.Scanner;

public class runMain {

	public static void main(String[] args) {
		ArrayList<Integer> dsSoNguyen = new ArrayList<Integer>();
		Scanner banPhim = new Scanner(System.in);
		
		for(int i=0;i<10;i++) {
			System.out.print("a[" + i + "]=");
			Integer tam = banPhim.nextInt();
			dsSoNguyen.add(tam);
		}
		System.out.println("Danh sách số nguyên vừa nhập:");
//		for(int i=0;i<dsSoNguyen.size();i++) {
//			Integer tam = dsSoNguyen.get(i);
//			System.out.print(tam + " ");
//		}
		for(Integer x: dsSoNguyen) {
			System.out.print(x + " ");
		}
		
		int soLuongSoChan = 0;
		for(Integer x: dsSoNguyen) {
			if(x%2==0) soLuongSoChan++;
		}
		System.out.print("\nSố lượng phần tử chẵn trong danh sách: " + soLuongSoChan);
//		hoặc
//		for(int i=0;i<dsSoNguyen.size();i++) {
//			Integer tam = dsSoNguyen.get(i);
//			if(tam%2==0) soLuongSoChan++;
//		}
		int tong = 0;
		for(Integer x: dsSoNguyen) {
			tong+=x;
		}
		System.out.print("\nTổng các phần tử của danh sách: " + tong);
		
	}

}
