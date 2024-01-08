package oopsConcept;

//for static method/variable(s) only 1 copy will be created &store in CMA/metaspace
//for 100 objects --100 copies of non-static method(s)/variable(s) is created & store in respective memory.
public class FileConceptStaticNonstatic {
//Different ways of calling static methods
//a)Directly          b)using class name

	static String Companyname = "INFOSIS";// class static variable

	public static void readfile() {
		System.out.println("Read File");
	}

	int filesize;// instance variable-- as it is part of object

	public void writefile() {
		System.out.println("Write File");
	}

	public static void main(String[] args) {
		readfile(); // static method
		System.out.println(Companyname);// static variable
		FileConceptStaticNonstatic.readfile();// static method

		FileConceptStaticNonstatic fc = new FileConceptStaticNonstatic();
		fc.writefile();// non-static method
		System.out.println(fc.filesize);// non-static variable
		fc.filesize = 10;// to assign non-static variable
		System.out.println(fc.filesize);
		//fc.readfile();// The static method readfile() from the type FileConceptStaticNonstatic should
						// be accessed in a static way

	}

}
