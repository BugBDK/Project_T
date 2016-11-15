import java.util.Scanner;
public class A_cal_salary {

	public static void main(String[] args) {
		int salary ;
		int sales ;
		System.out.println("------ This Project is Calculate Salary -------");
		Scanner scan = new Scanner(System.in);
		System.out.print("Input Employee's Name : ");
		String name = scan.nextLine();
		System.out.print("Input Employee's Salary : ");
		salary = scan.nextInt();
		while(salary < 1 ){
			System.out.println("--Error Employee's Salary--");
			System.out.print("Please Input Employee's Salary : ");
			salary = scan.nextInt();
			} 
		System.out.print("Input Employee's Sales : ");
		sales = scan.nextInt();
		while(sales < 1 ){
			System.out.println("--Error Employee's Sales--");
			System.out.print("Please Input Employee's Sales : ");
			sales = scan.nextInt();
		} 
		double sum;
		Calculate cal = new Calculate(name,salary,sales);
		if (sales >= 1 || sales <= 50000){ //minor change of Project A 
			sum = cal.cal_sale_less_50000();
		}
		else if (sales <= 100000){
			sum = cal.cal_sale_less_100000();
		}
		else{
			sum = cal.cal_sale_more_100001();
			}
		System.out.println("");
		System.out.println("---------------Result----------------");
		System.out.println("Employee's name = " +name);
		System.out.println("result = " +sum + " Bath");
		}
	}

