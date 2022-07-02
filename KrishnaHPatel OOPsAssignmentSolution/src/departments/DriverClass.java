package departments;



public class DriverClass {

	
	public static void main(String[] args) 
	{
		SuperDepartment SD = new SuperDepartment();
		SuperDepartment AD = new AdminDepartment();
		SuperDepartment HD = new HrDepartment();
		SuperDepartment TD = new TechDepartment();
		HrDepartment hd = new HrDepartment();
		TechDepartment td = new TechDepartment();
		
		
		System.out.println(AD.departmentName());
		System.out.println(AD.getTodaysWork());
		System.out.println(AD.getWorkDeadline());
		System.out.println(SD.isTodayAHoliday());
		
		System.out.println("\n");
		
		System.out.println(HD.departmentName());
		System.out.println(hd.doActivity());
		System.out.println(HD.getTodaysWork());
		System.out.println(HD.getWorkDeadline());
		System.out.println(SD.isTodayAHoliday());
		
		System.out.println("\n");
	
		System.out.println(TD.departmentName());
		System.out.println(TD.getTodaysWork());
		System.out.println(TD.getWorkDeadline());
		System.out.println(td.getTechStackInformation());
		System.out.println(SD.isTodayAHoliday());
		
	}

}
