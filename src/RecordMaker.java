import java.util.ArrayList;


public class RecordMaker {
	
	//사원번호를 랜덤하게 출력해주는 함수
	public String employeeNumMaker(){
		
		int employeeNum = 0;
		String employeeStr;
		
		employeeNum = (int)(Math.random()*100000);
		
		//숫자별로 구간을 나눠 랜덤값이 9999이하면 0으로 채우게 처리함
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
	
	//점수를 랜덤하게 생성하는 함수
	public int scoreMaker(){
		
		int score = 0;
		score = (int)(Math.random()*100);
		
		return score;
	}

	public static void main (String[] args){
		
		ArrayList<String> overlapCheck = new ArrayList<String>();
		RecordMaker rm = new RecordMaker();
		
		//인자로 출력할 줄의 숫자를 받음
		int count = Integer.parseInt(args[0]);
		
		//예외처리
		if(count>99999){
			System.out.println("출력할 범위가 전체 사원번호 수보다 많습니다.");
		}
		else{
			for(int i=0; i<count; i++){
				String employeeStr = rm.employeeNumMaker();
				/*arraylist를 이용해 사원번호가 중복되있진 않은지 체크한다.
				arraylist에 사원번호가 없으면 arraylist에 그 값을 넣고
				arraylist에 사원번호가 있으면 i--를 해 for문을 다시 실행 시킴*/
				if(!overlapCheck.contains(employeeStr)){
					overlapCheck.add(employeeStr);
					System.out.println(employeeStr+" "+rm.scoreMaker());
				}
				else i--;
			}
		}
		
	
		
	}
}
