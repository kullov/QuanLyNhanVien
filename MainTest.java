package nga.oop4.updated;

import java.util.Scanner;

public class MainTest {
	public static void main(String[] args) {
		String u, t, name;
		int value, numberOfWorker, numberOfEngineer, numberOfOfficer, numberOfEmployee;
		Worker[] workers = null;
		Engineer[] engineers = null;
		Officer[] officers = null;
		Employee[] employees = null;
		MainTest mt = new MainTest();
		Menu m = new Menu();
		Scanner scan = new Scanner(System.in);

		System.out.println("Enter the list of employees: ");
		System.out.println("=========================================================");
		System.out.println("Enter a list of workers");
		System.out.println("Enter number of Worker: ");
		numberOfWorker = Integer.parseInt(scan.nextLine());
		workers = mt.enterWorkers(numberOfWorker);
		System.out.println("=========================================================");
		System.out.println("Enter a list of engineers");
		System.out.println("Enter number of engineer: ");
		numberOfEngineer = Integer.parseInt(scan.nextLine());
		engineers = mt.enterEngineers(numberOfEngineer);
		System.out.println("=========================================================");
		System.out.println("Enter a list of officers");
		System.out.println("Enter number of officer: ");
		numberOfOfficer = Integer.parseInt(scan.nextLine());
		officers = mt.enterOfficers(numberOfOfficer);

		numberOfEmployee = engineers.length + officers.length + workers.length;
		employees = mt.enterEmployees(engineers, workers, officers, numberOfEmployee);
		do {
			m.menu();
			System.out.println("Enter request: ");
			value = Integer.parseInt(scan.nextLine());
			switch (value) {
			case 1:
				if (employees != null) {
					System.out.println("Show list of employee: ");
					System.out.println("=========================================================");
					mt.showEmployees(employees);
				} else {
					System.out.println("This employees is null!");
				}
				break;
			case 2:
				System.out.println("Show list of engineers: ");
				System.out.println("=========================================================");
				for (Engineer engineer : engineers) {
					System.out.println(engineer.toString());
				}
				break;
			case 3:
				System.out.println("Show list of officers: ");
				System.out.println("=========================================================");
				for (Officer officer : officers) {
					System.out.println(officer.toString());
				}
				break;
			case 4:
				System.out.println("Show list of workers: ");
				System.out.println("=========================================================");
				for (Worker worker : workers) {
					System.out.println(worker.toString());
				}
				break;
			case 5:
				do {
					System.out.println("Show employees by name: ");
					System.out.println("=========================================================");
					System.out.println("Enter name of employee: ");
					name = scan.nextLine();
					if (employees != null) {
						mt.showEmployeeByName(employees, name);
					} else {
						System.out.println("This employees is null!");
					}
					System.out.println("=====================================================");
					System.out.println("Do you want to continue? Y or N");
					t = scan.nextLine();
				} while (!t.equalsIgnoreCase("N"));
				break;
			default:
				System.out.println("Invalid!");
				break;
			}

			System.out.println("=====================================================");
			System.out.println("Do you want to continue this program? Y or N");
			u = scan.nextLine();
		} while (!u.equalsIgnoreCase("N"));
	}

	private Officer[] enterOfficers(int numberOfOfficer) {
		Officer[] officers = new Officer[numberOfOfficer];
		for (int i = 0; i < officers.length; i++) {
			System.out.println("Enter officer [" + (i + 1) + "] :");
			officers[i] = enterOfficer();
		}
		return officers;
	}

	private Engineer[] enterEngineers(int numberOfEngineer) {
		Engineer[] engineers = new Engineer[numberOfEngineer];
		for (int i = 0; i < engineers.length; i++) {
			System.out.println("Enter engineer [" + (i + 1) + "] :");
			engineers[i] = enterEngineer();
		}
		return engineers;
	}

	private Worker[] enterWorkers(int numberOfWorker) {
		Worker[] workers = new Worker[numberOfWorker];
		for (int i = 0; i < workers.length; i++) {
			System.out.println("Enter worker [" + (i + 1) + "] :");
			workers[i] = enterWorker();
		}
		return workers;
	}

	private Address enterAddress() {
		Scanner scan = new Scanner(System.in);
		Address address = new Address();

		System.out.println("Enter number of house: ");
		address.setNumberOfHouse(Integer.parseInt(scan.nextLine()));
		System.out.println("Enter alley: ");
		address.setAlley(Integer.parseInt(scan.nextLine()));
		System.out.println("Enter lane: ");
		address.setLane(Integer.parseInt(scan.nextLine()));
		System.out.println("Enter street: ");
		address.setStreet(scan.nextLine());
		System.out.println("Enter subDistrict: ");
		address.setSubDistrict(scan.nextLine());
		System.out.println("Enter district: ");
		address.setDistrict(scan.nextLine());
		System.out.println("Enter city: ");
		address.setCity(scan.nextLine());

		return address;
	}

	private Officer enterOfficer() {
		Scanner scan = new Scanner(System.in);
		Officer officer = new Officer();
		System.out.println("Enter name: ");
		officer.setName(scan.nextLine());
		System.out.println("Enter year of birth: ");
		officer.setYOB(Integer.parseInt(scan.nextLine()));
		System.out.println("Enter gender: ");
		officer.setGender(scan.nextLine());
		System.out.println("Enter address: ");
		officer.setAddress(enterAddress());
		System.out.println("Enter work: ");
		officer.setWork(scan.nextLine());
		return officer;
	}

	private Worker enterWorker() {
		Scanner scan = new Scanner(System.in);
		Worker worker = new Worker();
		System.out.println("Enter name: ");
		worker.setName(scan.nextLine());
		System.out.println("Enter year of birth: ");
		worker.setYOB(Integer.parseInt(scan.nextLine()));
		System.out.println("Enter gender: ");
		worker.setGender(scan.nextLine());
		System.out.println("Enter address: ");
		worker.setAddress(enterAddress());
		System.out.println("Enter rank: ");
		worker.setRank(scan.nextLine());
		return worker;
	}

	private Engineer enterEngineer() {
		Scanner scan = new Scanner(System.in);
		Engineer engineer = new Engineer();
		System.out.println("Enter name: ");
		engineer.setName(scan.nextLine());
		System.out.println("Enter year of birth: ");
		engineer.setYOB(Integer.parseInt(scan.nextLine()));
		System.out.println("Enter gender: ");
		engineer.setGender(scan.nextLine());
		System.out.println("Enter address: ");
		engineer.setAddress(enterAddress());
		System.out.println("Enter training sector: ");
		engineer.setTrainingSector(scan.nextLine());
		System.out.println("Enter diploma: ");
		engineer.setDiploma(scan.nextLine());
		return engineer;
	}

	private Employee[] enterEmployees(Engineer[] engineers, Worker[] workers, Officer[] officers,
			int numberOfEmployee) {
		int i = 0;
		Employee[] employees = new Employee[numberOfEmployee];
		for (Worker worker : workers) {
			employees[i] = worker;
			i++;
		}
		for (Engineer engineer : engineers) {
			employees[i] = engineer;
			i++;
		}
		for (Officer officer : officers) {
			employees[i] = officer;
			i++;
		}
		return employees;
	}

	private void showEmployees(Employee[] employees) {
		for (Employee employee : employees) {
			System.out.println(employee.toString());
		}
	}

	private void showEmployeeByName(Employee[] employees, String name) {
		int count = 0;
		for (Employee employee : employees) {
			if (name.equalsIgnoreCase(employee.getName())) {
				System.out.println(employee.toString());
				count++;
			}
		}
		if (count == 0) {
			System.out.println("No  one has named : " + name + "!");
		}
	}

}
