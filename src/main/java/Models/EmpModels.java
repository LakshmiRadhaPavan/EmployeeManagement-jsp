package Models;
public class EmpModels{
		private int id;
		private String name;
		private int salary;
		private int age;
		private float phno;
		private String email;
		public int getId() {
			return id;
		}
		public void setId(int id) {
			this.id = id;
		}
		public String getName() {
			return name;
		}
		public void setName(String name) {
			this.name = name;
		}
		public int getSalary() {
			return salary;
		}
		public void setSalary(int salary) {
			this.salary = salary;
		}
		public int getAge() {
			return age;
		}
		public void setAge(int age) {
			this.age = age;
		}
		public float getPhno() {
			return phno;
		}
		public void setPhno(float phno) {
			this.phno = phno;
		}
		public String getEmail() {
			return email;
		}
		public void setEmail(String email) {
			this.email = email;
		}
		public EmpModels(int id, String name, int salary, int age, float phno, String email) {
			super();
			this.id = id;
			this.name = name;
			this.salary = salary;
			this.age = age;
			this.phno = phno;
			this.email = email;
		}
		public EmpModels() {
			super();
			// TODO Auto-generated constructor stub
		}
}
