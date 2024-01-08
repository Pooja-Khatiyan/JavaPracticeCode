package interfaceexample;

public class UniversityCourses extends University implements LondonUniversity, ParisUniversity, GermanyUniversity, JapanUniversity {

	@Override
	public void BusinessAdministration() {
		System.out.println("University Courses--Business Administration");

	}

	@Override
	public void BusinessandManagement() {
		System.out.println("University Courses--Businessand Management");

	}

	@Override
	public void CitizenshipandtheRuleofLaw() {
		System.out.println("University Courses--Citizenship and the Rule of Law");

	}

	@Override
	public void AccountingnFinance() {
		System.out.println("University Courses-- Accountingn Finance");
	}

	@Override
	public void AccountingnFinancialManagement() {
		System.out.println("University Courses--Accountingn Financial Management");

	}

	@Override
	public void AppliedPublicHistory() {
		System.out.println("University Courses--Applied Public History");

	}

	@Override
	public void BScBusinessAdministration() {
		System.out.println("University Courses--BSc Business Administration");

	}

	@Override
	public void BuildingInteractive3DCharactersandSocialVR() {
		System.out.println("University Courses--Building Interactive 3D Characters and Social VR");

	}

	@Override
	public void ArtHistoryCuratorshipandRenaissanceCulture() {
		System.out.println("University Courses--Art History Curatorship and Renaissance Culture");
	}

	@Override
	public void BachelorofLaws() {
		System.out.println("University Courses--Bachelor of Laws");

	}

	@Override
	public void BrandManagement() {
		System.out.println("University Courses--Brand Management");

	}

	public void CommercialLaw() {
		System.out.println("University Courses--Commercial Law");
	}

	@Override
	public void EduactionPolicy() {
		System.out.println("University Courses--Education Policy");

	}

}
