package coban; 
import java.util.Scanner; 
import java.lang.Math; 
import java.util.ArrayList; 
class Taikhoan{
	private long stk; 
	private String tentk; 
	private double sotien; 
	public Taikhoan() {
		this.stk=0; 
		this.tentk=""; 
		this.sotien=1.0; 
	}
	public Taikhoan(long stk,String tentk,double sotien) {
		this.stk=stk; 
		this.tentk=tentk; 
		this.sotien=sotien; 
	}
	public long getstk() {
		return stk; 
	}
	public void setstk() {
		this.stk=stk; 
	}
	public String toString() {
		return "So tai khoan: \n" + stk + 
				"\n" + "Ten Tai Khoan: \n"+tentk+"\n"+
				" So du tai Khoan: \n"+sotien;
	}
}
public class tinhtong{
	public static void main(String[] args) {
		ArrayList<Taikhoan> them  = new ArrayList<>(); 
		them.add(Taikhoan(long stk,String tentk));
		
	}
}