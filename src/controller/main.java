package controller;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

import model.Student;
import model.Teacher;

public class main {
	private static ArrayList<Teacher> ListTeaCher = new ArrayList<Teacher>();
	private static ArrayList<Student> ListStudent = new ArrayList<Student>();
	private static Scanner sc;
	
	public static void Menu() {

		sc = new Scanner(System.in);
		System.out.println(
				"\n1.Nhap thong tin sinh vien" +
				"\n2.Nhap thong tin hoc sinh" +
				"\n3.hien thi thong tin sinh vien" + 
				"\n4.Hien thi thong tin hoc sinh." + 
				"\n5.luong giao vien" + 
				"\n6.diem trung binh" + 
				"\n7.sap xep diem trung binh" + 
				"\n8.sap xep giao vien theo bang chu cai");
		switch (sc.nextInt()) {
		case 1:
			NhapThongTinGiaoVien();
			break;
		case 2:
			NhapThongTinHocSinh();
			break;
		case 3:
			HienThiThongTinGiaoVien();
			break;
		case 4:
			HienThiThongTinHocSinh();
			break;
		case 5:
			LuongGiaoVien();
			break;
		case 6:
			DiemTrungBinh();
			break;
		case 7:
			SapXepDiemTB();
			break;
		case 8:
			SapXepGVTheoBangChuCai();
			break;

		default:
			break;
		}


	}
	private static void BackMenu() {
		System.out.println("Enter Menu");
		sc.nextLine();
		Menu();
	}
	private static void SapXepGVTheoBangChuCai() {
		for(int i = 0 ; i < ListTeaCher.size();i++) {
			Collections.sort(ListTeaCher,new Comparator<Teacher>() {

				@Override
				public int compare(Teacher o1, Teacher o2) {
					return o1.getTeacherName().compareToIgnoreCase(o2.getTeacherName());
				}
			});


		}	
		for (int i = 0 ; i < ListTeaCher.size();i++) {
			System.out.println(ListTeaCher.get(i).toString() + "\nSap xep alpha ten : " + ListTeaCher.get(i).getTeacherName());
		}
		BackMenu();








	}

	private static void SapXepDiemTB() {
		for (int i = 0; i < ListStudent.size();i++) {
			Collections.sort(ListStudent,new Comparator<Student>() {

				@Override
				public int compare(Student o1, Student o2) {
					// TODO Auto-generated method stub
					return o1.DiemTB() >= o2.DiemTB() ? -1:1;
				}
			});
		}
		for (int i = 0 ; i < ListStudent.size();i++) {
			System.out.println(ListStudent.get(i).toString() + "\nDiem trung binh : " + ListStudent.get(i).DiemTB());
		}
		BackMenu();

	}
	private static void DiemTrungBinh() {
		for (int i = 0; i < ListStudent.size(); i++) {
			System.out.println("Diem trung binh" + ListStudent.get(i).DiemTB());


		}
		BackMenu();

	}
	private static void LuongGiaoVien() {
		for (int i = 0; i < ListTeaCher.size(); i++) {
			System.out.println("Luong giao vien" + ListTeaCher.get(i).Luong());


		}
		BackMenu();

	}
	private static void HienThiThongTinHocSinh() {
		for (Student student : ListStudent) {
			System.out.println(student.toString());
		}
		BackMenu();
	}
	private static void HienThiThongTinGiaoVien() {
		for (Teacher teacher : ListTeaCher) {
			System.out.println(teacher.toString());

		}
		BackMenu();


	}
	private static void NhapThongTinHocSinh() {
		Student student1 = new Student();
		System.out.println("Nháº­p mÃ£ há»�c sinh");
		student1.setStudentId(sc.nextInt());
		sc.nextLine();
		System.out.println("Nháº­p tÃªn HS");
		student1.setStudentName(sc.nextLine());
		System.out.println("Nháº­p sdt HS");
		student1.setNumberPhone(sc.nextLine());
		System.out.println("Nháº­p Ä‘á»‹a chá»‰ HS: ");
		student1.setAddress(sc.nextLine());
		System.out.println("Nháº­p Batch HS");
		student1.setBatch(sc.nextLine());

		System.out.println("Nháº­p Ä‘iá»ƒm sá»‘ 1: ");
		student1.setMark1(sc.nextDouble());
		sc.nextLine();
		System.out.println("Nháº­p Ä‘iá»ƒm sá»‘ 2: ");
		student1.setMark2(sc.nextDouble());
		sc.nextLine();
		ListStudent.add(student1);
		BackMenu();

	}
	private static void NhapThongTinGiaoVien() {
		Teacher teacher1 = new Teacher();
		System.out.println("Nháº­p mÃ£ giÃ¡o viÃªn");


		teacher1.setTeacheerId(sc.nextInt());
		sc.nextLine();
		System.out.println("TÃªn giao viÃªn lÃ : ");
		teacher1.setTeacherName(sc.nextLine());
		System.out.println("Phone GV: ");
		teacher1.setNumberPhone(sc.nextLine());
		System.out.println("Ä�á»‹a chá»‰ gv: ");

		teacher1.setAddress(sc.nextLine());

		System.out.println("Sá»‘ ngÃ y lÃ m: ");
		teacher1.setNumberWorkDay(sc.nextInt());
		sc.nextLine();
		ListTeaCher.add(teacher1);
		BackMenu();


	}



}
