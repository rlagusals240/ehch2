package sec06.StudentExam;

public class StudentExam0006 {

	public static void main(String[] args) {
		
	
//			Student st1 = new Student();
//			st1.nam = "������";
//			st1.age = 24;
		
		Student st1 = new Student();
		st1.name = "������";
		st1.age = 24;				
		
		System.out.println(st1.name);
			System.out.println(st1.age);
			
			Student st2 = new Student();
			st2.name = "��";
			st2.age = 23;
			
			System.out.println(st2.name);
			System.out.println(st2.age);
			
			st1.setname("������",30);
			st1.age = 30;
			
			
//			System.out.println(st1.name);
			
			String name = st1.Getname();
			System.out.println(name);
			
			st1.reup("���");
				System.out.println();
			
				st1.taric("Ÿ��",24);
				System.out.println(st1.name);
				System.out.println(st1.age);
	}		

}
