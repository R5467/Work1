/**
 * Java 5. Home work #5
 *
 * @avthor Inna
 * @version 22.2.2022
 */
class HomeWork5 {
	public static void main(String[] args) {
		Employee[] empCorp = new Employee[5];
			empCorp[0] = new Employee("Ivanov Ivan", "Engineer", "ivivan@mailbox.com", "892312312",30000,30);
			empCorp[1] = new Employee("Sidorov Sergei", "Engineer", "sidorov@mailbox.com", "89991122333",10000,40);
			empCorp[2] = new Employee("Petrov Pavel", "Engineer", "petrov@mailbox.com", "891278456",100000,47);
			empCorp[3] = new Employee("Novikova Ulyana", "Engineer", "novikova@mailbox.com", "89957788999",120000,29);
			empCorp[4] = new Employee("Solnova Maria", "Engineer", "solnova@mailbox.com", "89269944555",1000,49);
        for (Employee employee: empCorp) {
            if (employee.getAge()>40) {
    		System.out.println(employee);}
        }
    }
}
class Employee {
    private String name;
    private String position;
    private String email;
    private String phone;
    private int salary;
    private int age;

	public Employee(String name, String position, String email, String phone, int salary, int age) {
	this.name = name;
    this.position = position;
    this.email = email;
    this.phone = phone;
    this.salary = salary;
    this.age = age;
	} 
    public int getAge() {
		return age;
	}
	@Override
	public String toString(){
		return(name+ "\n-"
			+position+ "\n-"
			+email+ "\n-"
			+phone+ "\n-"
			+salary+ "\n-"
			+age);
	}
} 