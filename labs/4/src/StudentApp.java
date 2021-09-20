
public class StudentApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student[] st_arr = new Student[5];
		st_arr[0] = new Student("Thulina" , "BSc Data Science" , "0768912345");
		st_arr[1] = new Student("Chanakya" , "BSc Software Engineering" , "0239871735");
		st_arr[2] = new Student("Vindilani" , "Law" , "6879798553");
		st_arr[3] = new Student("Avindhya" , "Hotel Management" , "9784897182");
		st_arr[4] = new Student("Thewmini" , "Visual Arts" , "5523351782");
		
		//changing details of Thewmini aka Heshani
		st_arr[4].setDegree("Engineering");
		st_arr[4].setMobile("0712077071");
		st_arr[4].setName("Heshani");
		
		for(int i = 0; i < st_arr.length; i++) {
			st_arr[i].print();
		}
	}

}
