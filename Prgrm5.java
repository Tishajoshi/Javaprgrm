importjava.util.Scanner;

class Staff {

	String staffID, name, phone, salary;

	Scanner input = newScanner(System.in);

	voidread() {

		System.out.println("Enter StaffID");

		staffID = input.next();

		name = input.next();

		phone = input.next();

		salary = input.next();

	}

	voiddisplay() 

        {

System.out.print(staffID+"\t"+name+"\t"+phone+"\t"+salary+"\t");

}

}

class Teaching extends Staff {

	String domain, publication;

	voidread() {

		super.read(); // call super class read method

		System.out.println("Enter Domain");

		domain = input.next();

		System.out.println("Enter Publication");

		publication = input.next();	

	}

	voiddisplay() {

		super.display(); // call super class display() method

		System.out.println(domain+"\t"+publication);

	}

}

class Technical extends Staff {

	String Skills;

	voidread() {

		super.read(); // call super class read method

		System.out.println("Enter Skills");

		Skills = input.next();

	}

	voiddisplay() {

		super.display(); // call super class display() method

		System.out.println(Skills);

	}

}

class Contract extends Staff {

	String period;

	voidread() {

		super.read(); // call super class read method

		System.out.println("Enter Period");

		period = input.next();

	}

        @Override

	voiddisplay() {

		super.display(); // call super class display() method

		System.out.println(period);

	}

}

publicclassStaffDemo {

	publicstaticvoidmain(String[] args) {

		Scanner input = newScanner(System.in);

		System.out.println("Enter number of staff details to be created");

		int n = input.nextInt();

		Teaching ts[] = new Teaching[n];

		Technical tech[] = new Technical[n];

		Contract c[] = new Contract[n];

		// Read Staff information under 3 categories

		for (inti = 0; i< n; i++) {

			System.out.println("Enter Teaching staff information");

			ts[i] = newTeaching();

			ts[i].read();

		}

		for (inti = 0; i< n; i++) {

			System.out.println("Enter Technical staff information");

			tech[i] = newTechnical();

			tech[i].read();

		}

		for (inti = 0; i< n; i++) {

			System.out.println("Enter Contract staff information");

			c[i] = newContract();

			c[i].read();

		}

		// Display Staff Information

		System.out.println("\n STAFF DETAILS: \n");

		System.out.println("-----TEACHING STAFF DETAILS----- ");

		for (inti = 0; i< n; i++) 

			ts[i].display();

		System.out.println("-----TECHNICAL STAFF DETAILS-----");

		for (inti = 0; i< n; i++) 

			tech[i].display();

		System.out.println("-----CONTRACT STAFF DETAILS-----");

		for (inti = 0; i< n; i++) 

			c[i].display();

		input.close();	

		}

}

