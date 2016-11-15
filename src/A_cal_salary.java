import java.util.Scanner;
public class A_cal_salary {

	public static void main(String[] args) {
		System.out.println("------ This Project is Calculate Salary -------");
		Scanner scan = new Scanner(System.in);
		System.out.print("Input Employee's name : ");
		String name = scan.nextLine();
		System.out.print("Input Employee's Salary : ");
		double salary = scan.nextDouble();
		while (salary < 1){
			System.out.print("!!!! Input Error !!! Salary must more than 0 !!!");
			System.out.print("Input Employee's Salary : ");
			salary = scan.nextDouble();
		}
		System.out.print("Input Employee's sales : ");
		double sales = scan.nextDouble();
		while (sales < 1){
			System.out.print("!!!! Input Error !!! Sales must more than 0 !!!");
			System.out.print("Input Employee's Sales : ");
			sales = scan.nextDouble();
		}
		
		double sum;
		Calculate cal = new Calculate(name,salary,sales);
		if (sales >= 1 && sales <= 25000){
			sum = cal.cal_sale_less_25000();
		}
		else if (sales >= 25001 && sales <= 50000){
			sum = cal.cal_sale_less_50000();
		}
		else{
			sum = cal.cal_sale_more_50001();
			}
		System.out.println("---------------Result----------------");
		System.out.println("Employee's name = " +name);
		System.out.println("result = " +sum + " Bath");
		}
	}
