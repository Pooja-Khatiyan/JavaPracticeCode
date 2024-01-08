package OOPs_interface;

public class FortisHospital extends Medical implements USMedical, UKMedical, IndianMedical {
//now we have 4 parent for fortis hospital 1 parent class & 3 parent interfaces
//it is class variable by default it is not final or static 
// int min_fee = 50;
//Deliberately we can also declare variable as static & final
//CONCLUSION : it can extends only one class but can implements 'n' no of classes	

	static final int min_fee = 50;

//US Medical
	@Override
	public void physioServices() {
		System.out.println("FH-- PhysioServices");
	}

	@Override
	public void oncologyServices() {
		System.out.println("FH-- OncologyServices");

	}

	@Override
	public void pediaServices() {
		System.out.println("FH-- PediaServices");
	}

//UK Medical
	@Override
	public void dentalServises() {
		System.out.println("FH--DenatlServices");

	}

	@Override
	public void orthoServices() {
		System.out.println("FH--OrthoServices");

	}
//Indian Medical

	@Override
	public void gynoServices() {
		System.out.println("FH-- GynoServices");

	}

	@Override
	public void ENTServices() {
		System.out.println("FH--ENTServices");

	}

//common --3 same method --single implementation comes from last interface separated by comma
	@Override
	public void emergencyServices() {
		String Country = "";
		if (Country.equals("USMedical")) {
			System.out.println("F-US--Emergency Services");
		} else if (Country.equals("UKMedical")) {
			System.out.println("F-UK--Emergency Services");
		} else if (Country.equals("IndianMedical")) {
			System.out.println("F--Indian--Emergency Services");
		} else {
			System.out.println("FH--Emergency Services");
		}
	}

////Individual Methods
	public void MedicalInsurance() {
		System.out.println("FH--Medical Insurance");
	}

	public void MedicalTraining() {
		System.out.println("FH--Medical Training");
	}

//method hiding
	// @Override
	public static void billing() {
		System.out.println("FH-- billing");
	}

	@Override
	public void physioServices(int a) {
		System.out.println("FH--1 parameter");

	}

//default  modifier is not allowed in class to override interface default to class we should only & only use public modifier
//default void RnD() {
	@Override
	public void RnD() {
		System.out.println("FH-- RnD");
	}
//WHO
	@Override
	public void covidvaccination() {
		System.out.println("FH-- Covid Vaccination");
		
	}
	

}
