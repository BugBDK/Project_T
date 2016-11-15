
public class Calculate {
	private String name;
	private int salary;
	private int sale;
	
	public Calculate (String name,int salary,int sale){
		this.name = name;
		this.salary = salary;
		this.sale = sale;
	}
	public double cal_sale_less_25000(){
		double sum = 0;
		sum = this.salary+(this.sale*1.01); 
		return sum;
	}
	public double cal_sale_less_50000(){
		double sum = 0;
		sum = this.salary+(this.sale*1.02); 
		return sum;
	}
	public double cal_sale_more_50001(){
		double sum = 0;
		sum = this.salary+(this.sale*1.03); 
		return sum;
	}
	
}
