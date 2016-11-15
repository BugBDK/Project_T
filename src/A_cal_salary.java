import java.util.Scanner;
public class A_cal_salary {

	public static void main(String[] args) {
		System.out.println("------ This Project is Calculate Salary -------");
		Scanner scan = new Scanner(System.in);
		System.out.print("Input Employee's name : ");
		String name = scan.nextLine();
		System.out.print("Input Employee's Salary : ");
		double salary = scan.nextDouble();
		while(salary <= 0){	 //àªç¤¡ÒÃ input
			System.out.println("Input error!!! must input salary more than 0");
			System.out.print("Input Employee's Salary : ");
			salary = scan.nextDouble();
		}
		System.out.print("Input Employee's sales : ");
		double sales = scan.nextDouble();
		while(sales <= 0){	//àªç¤¡ÒÃ input
			System.out.println("Input error!!! must input sales more than 0");
			System.out.print("Input Employee's sales : ");
			sales = scan.nextDouble();
		}
		double sum;
		Calculate cal = new Calculate(name,salary,sales);
		if (sales >= 1 && sales <= 25000){ //minor change of Project A 
			sum = cal.cal_sale_less_25000();
		}
		else if (sales >= 25001 && sales <= 50001){
			sum = cal.cal_sale_less_50000();
		}
		else{
			sum = cal.cal_sale_more_50001();
			}
		if (sum < 18000){
			sum = 18000;
		}
		System.out.println("---------------Result----------------");
		System.out.println("Employee's name = " +name);
		System.out.println("result = " +sum + " Bath");
		}
	}

