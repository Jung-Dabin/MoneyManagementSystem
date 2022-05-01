import java.util.Scanner;

public class MenuManager {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		MoneyManager moneyManager = new MoneyManager(input);
		
		int num = -1;

		// Menu ����
		while (num != 5) {
			System.out.println("*** Money Management System Menu ***");
			System.out.println(" 1. Add Spend");
			System.out.println(" 2. Delete Spend");
			System.out.println(" 3. Edit Spend");
			System.out.println(" 4. Check Spends");
			System.out.println(" 5. Exit");
			System.out.println("Select one number between 1-6: ");
			num = input.nextInt();
			
			// ����ڿ��� �Է� ���� ��ȣ�� ���� �ش��ϴ� �޼ҵ� ����
			if (num == 1) {
				moneyManager.addSpend();
			}
			else if (num == 2) {
				moneyManager.deleteSpend();
			}
			else if (num == 3) {
				moneyManager.editSpend();
			}
			else if (num == 4) {
				moneyManager.checkSpends();
			}
			else {
				continue;
			}
		}
	}
}