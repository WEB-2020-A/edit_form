package chapter4_homwork1;

import java.util.Random;
import java.util.Arrays;
public class Homework1 {
	public static void main(String[] args) {
		// Question 1
		System.out.println("..... Answer 1 .....");

		try {
			String[] employee = { "Doung", "Chan", "Minea", "Mesa", "Romdoul", "Veha", "Por", "Kanika" };
			int[] salary = { 560, 560, 500, 500, 190, 190, 560, 700 };
			int[] newSal = new int[salary.length - 1];
			String[] employeeSalary = new String[employee.length - 1];
			System.out.println("1.Find the highest salary of employee");
			// Answer a of Question 1
			int highest_salalry = salary[0];
			String person = employee[0];
			for(int i = 0; i < salary.length; i++){
				if(salary[i] > highest_salalry){
					highest_salalry = salary[i];
					person = employee[i];
				}
			}
			System.out.println(person + " has the highest salary of $" + highest_salalry);
			//  Answer b of Question 1
			int lowest_salalry = salary[0];
			String person2 = employee[0];
			for(int i = 0; i < salary.length; i++){
				if(salary[i] < lowest_salalry){
					lowest_salalry = salary[i];
					person2 = employee[i];
				}
			}
			System.out.println(" .................................");
			System.out.println(" 2.Employee who has lowest salary:");

			System.out.println(person2 + " has the lowest salary of $" + lowest_salalry);
			System.out.println(" .................................");

			// Answer c of Question 1
			int sum = 0;
			int average = 0;
			String person3 = employee[0];
			String person4 = employee[0];
			int count = 0;
			for(int b = 0; b < salary.length; b++){
				sum += salary[b];
				count++;
			}
			average = sum / count;
			System.out.println("3.Employee who has lower salary than average:" + average);
			for(int d = 0 ; d < salary.length; d++) {
				if(salary[d] < average  ) {
					person3 = employee[d];
					System.out.println(person3 + ":" + salary[d] +"$");
				}
			}

			//		Answer d of Question 1
			System.out.println(" .................................");
			System.out.println("4.Employee who has higher salary than average:" + average);
			for(int k = 0 ; k < salary.length; k++) {
				if(salary[k] > average  ) {
					person4 = employee[k];
					System.out.println(person4 + ":" + salary[k] +"$");
				}
			}
			//		Answer e of Question 1
			System.out.println(" .................................");
			System.out.println("5.Employee who has same salary");
			for (int i = 0; i < salary.length; i++) {
				for (int j = 1; j < salary.length; j++) {
					if (salary[i] == salary[j] && i != j) {
						newSal[i] = salary[i];
						employeeSalary[i] = employee[i];
						break;
					}
				}
			}
			sortToArray(newSal, employeeSalary);
		} catch (Exception ex) {
			ex.printStackTrace();
		}
	}

	static public void sortToArray(int[] salary, String[] names) {
		int temp;
		String sTemp;
		for (int i = 0; i <= salary.length - 1; i++) {
			for (int j = 0; j <= salary.length - 2; j++) {
				if (salary[j] < salary[j + 1]) {
					temp = salary[j];
					salary[j] = salary[j + 1];
					salary[j + 1] = temp;
					sTemp = names[j];
					names[j] = names[j + 1];
					names[j + 1] = sTemp;
				}
			}
		}
		for (int i = 0; i <= salary.length - 1; i++) {
			System.out.println(names[i] + ":" + salary[i] + "$");
		}
		// Question 2
		
		System.out.println("..... Answer 2 .....");
		System.out.println();

		int[] numberRandom = new int[15];
		String index="";
		for (int i = 0;i<numberRandom.length;i++){
			numberRandom[i] = (int) (Math.random() * 10);
			System.out.print(numberRandom[i] + " ");
		}

		int count= 0;
		for (int i=0;i<numberRandom.length;i++){
			if(numberRandom[i] == 5 ) {
				count++;
				index += i +" ";
			}
		}
		
		System.out.println();
		if (count != 0) {
			System.out.println("There are "+count+" of number 5 fount in index as below.");
			System.out.println("Index: "+index);
		}else {
			System.out.println("Number 5 not fount");
		}
	}
}
