package assignments;

import java.text.DecimalFormat;

import javax.swing.JOptionPane;

public class payroll {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		DecimalFormat myFormat= new DecimalFormat("$####.##");
		DecimalFormat myFormat2= new DecimalFormat("####");

		String employeeN= JOptionPane.showInputDialog(null, "What is the employee's"+ 
				" name?");
		String employeeH= JOptionPane.showInputDialog(null, "How many hours"+
				" has the employee worked?");
		String employeeHP= JOptionPane.showInputDialog(null, "What is the employee"+
				" paid per hour?");
		String employeeFT= JOptionPane.showInputDialog(null, "What rate is the employee"+
				" taxed at federally?");
		String employeeST= JOptionPane.showInputDialog(null, "What rate is the employee"+
				" taxed by the state?");

		double EmployeeH= Double.parseDouble(employeeH);
		double EmployeeHP= Double.parseDouble(employeeHP);
		double EmployeeFT= Double.parseDouble(employeeFT);
		double EmployeeST= Double.parseDouble(employeeST);

		double ETP= EmployeeH*EmployeeHP;
		double EFP= ETP*EmployeeFT;
		double ESP= ETP*EmployeeST;
		double ETD= EFP+ESP;
		double ENP= ETP-ETD;

		String EH= myFormat2.format(EmployeeH);
		String EHP= myFormat.format(EmployeeHP);
		String FP= myFormat.format(EFP);
		String SP= myFormat.format(ESP);
		String TP= myFormat.format(ETP);
		String TD= myFormat.format(ETD);
		String NP= myFormat.format(ENP);

		System.out.println("Name of Employee: "+ employeeN);
		System.out.println("Hours Worked: "+EH);
		System.out.println("Rate Payed: "+EHP);
		System.out.println("Gross Pay: "+TP);
		System.out.println("Deductions:");
		System.out.println("    Federal: "+FP);
		System.out.println("    State: "+SP);
		System.out.println("    Total Deduction: "+TD);
		System.out.println("Net Pay: "+NP);


	}

}
