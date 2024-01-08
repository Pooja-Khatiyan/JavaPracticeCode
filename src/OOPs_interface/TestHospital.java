package OOPs_interface;

public class TestHospital {

	public static void main(String[] args) {
		FortisHospital fh = new FortisHospital();
		fh.dentalServises();
		fh.ENTServices();
		fh.gynoServices();
		fh.orthoServices();
		fh.oncologyServices();
		fh.pediaServices();
		fh.physioServices();
		fh.emergencyServices();
		fh.medicalNewsPublish();// inherited from parent class
		fh.covidvaccination();
		System.out.println("---------");

//TOP CASTING 
		USMedical us = new FortisHospital();
		us.emergencyServices();// common
		// method coming from us in other case reference type check fails
		us.oncologyServices();
		us.pediaServices();
		us.physioServices();
		System.out.println("----------");

		USMedical u = new ClevelandClinic();
		u.covidvaccination();
		u.emergencyServices();
		u.pediaServices();
		u.physioServices();
		u.physioServices(12);
		u.oncologyServices();
		u.RnD();
		USMedical.billing();
		System.out.println("----------");

		USMedical u1 = new UniversityOfChicagoMedicalCenter();
		u1.covidvaccination();
		u1.emergencyServices();
		u1.RnD();
		u1.oncologyServices();
		u1.pediaServices();
		u1.physioServices();
		USMedical.billing();
		System.out.println("----------");
//we can not create object of interface not allowed in java	--Cannot instantiate(object creation) the type UKMedical	
		// UKMedical uk = new UKMedical();

		UKMedical uk = new FortisHospital();
		uk.dentalServises();
		uk.orthoServices();
		uk.emergencyServices();// common

// to access interface & class variables
		System.out.println(USMedical.min_fee);
		System.out.println(fh.min_fee);// now it take inherited one//cross the stack to reach the static variable
		System.out.println(FortisHospital.min_fee);

//down casting not even allowed at compile time-- down casting means --creating parent interface object-which is strictly
//not allowed in java.
		FortisHospital.billing();
		USMedical.billing();

	}

}
