import java.util.ArrayList;


public class RecordMaker {
	
	//�����ȣ�� �����ϰ� ������ִ� �Լ�
	public String employeeNumMaker(){
		
		int employeeNum = 0;
		String employeeStr;
		
		employeeNum = (int)(Math.random()*100000);
		
		//���ں��� ������ ���� �������� 9999���ϸ� 0���� ä��� ó����
		if(employeeNum<=9){
			employeeStr = "NT0000"+employeeNum;
		}
		else if(employeeNum<=99){
			employeeStr = "NT000"+employeeNum;
		}
		else if(employeeNum<=999){
			employeeStr = "NT00"+employeeNum;
		}
		else if(employeeNum<=9999){
			employeeStr = "NT0"+employeeNum;
		}
		else{
			employeeStr = "NT"+employeeNum;
		}
		
		return employeeStr;
		
	}
	
	//������ �����ϰ� �����ϴ� �Լ�
	public int scoreMaker(){
		
		int score = 0;
		score = (int)(Math.random()*100);
		
		return score;
	}

	public static void main (String[] args){
		
		ArrayList<String> overlapCheck = new ArrayList<String>();
		RecordMaker rm = new RecordMaker();
		
		//���ڷ� ����� ���� ���ڸ� ����
		int count = Integer.parseInt(args[0]);
		
		//����ó��
		if(count>99999){
			System.out.println("����� ������ ��ü �����ȣ ������ �����ϴ�.");
		}
		else{
			for(int i=0; i<count; i++){
				String employeeStr = rm.employeeNumMaker();
				/*arraylist�� �̿��� �����ȣ�� �ߺ������� ������ üũ�Ѵ�.
				arraylist�� �����ȣ�� ������ arraylist�� �� ���� �ְ�
				arraylist�� �����ȣ�� ������ i--�� �� for���� �ٽ� ���� ��Ŵ*/
				if(!overlapCheck.contains(employeeStr)){
					overlapCheck.add(employeeStr);
					System.out.println(employeeStr+" "+rm.scoreMaker());
				}
				else i--;
			}
		}
		
	
		
	}
}
