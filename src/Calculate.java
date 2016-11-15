
public class Calculate {
	private String name;
	private double salary;
	private double sale;
	
	public Calculate (String name,double salary,double sale){
		this.name = name;
		this.salary = salary;
		this.sale = sale;
	}
	public double cal_sale_less_50000(){
		double sum = 0;
		sum = this.salary+(this.sale*0.01); 
		return sum;
	}
	public double cal_sale_less_100000(){
		double sum = 0;
		sum = this.salary+(this.sale*0.02); 
		return sum;
	}
	public double cal_sale_more_100001(){
		double sum = 0;
		sum = this.salary+(this.sale*0.03); 
		return sum;
	}
}
