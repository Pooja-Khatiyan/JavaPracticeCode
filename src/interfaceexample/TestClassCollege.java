package interfaceexample;

public class TestClassCollege {

	public static void main(String[] args) {

		UniversityCourses u = new UniversityCourses();
		u.AccountingnFinance();
		u.AccountingnFinancialManagement();
		u.AppliedPublicHistory();
		u.ArtHistoryCuratorshipandRenaissanceCulture();
		u.BachelorofLaws();
		u.BrandManagement();
		u.BScBusinessAdministration();
		u.CommercialLaw();
		u.EduactionPolicy();
		u.UniversityProtocol();

		System.out.println("------");

//top casting 
		LondonUniversity l = new UniversityCourses();
		l.ArtHistoryCuratorshipandRenaissanceCulture();
		l.BachelorofLaws();
		l.BrandManagement();

		GermanyUniversity g = new UniversityCourses();
		g.EduactionPolicy();

		System.out.println("----------------");

		LondonUniversity lu = new ImperialCollegeLondon();
		lu.ArtHistoryCuratorshipandRenaissanceCulture();
		lu.BachelorofLaws();
		lu.BrandManagement();

		ImperialCollegeLondon i = new ImperialCollegeLondon();
		i.AdmissionCell();
		i.ArtHistoryCuratorshipandRenaissanceCulture();

	}

}