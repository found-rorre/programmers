/*
 1.	시도에서는 리턴값에 %1234567 시도
 	자료의 범위를 넘어가는 오류가 발생
  
 2.	long[]으로 선언 후 
 	(int) (arr[n] % 1234567) 로 처리
  	int 타입으로 변환하는 과정에서 데이터 손실 발생(?)

3.	int[]로 선언 후 저장하는 과정에서
	% 1234567 후 저장
 	완료~
*/

class Solution {
    public int solution(int n) {
        
        int[] arr = new int[n+1];
        
        arr[0] = 0;
        arr[1] = 1;
        
		for(int i = 2; i <= n; i++){
            arr[i] = (arr[i-1] + arr[i-2]) % 1234567;
        }
        
        return arr[n];
    }
}
