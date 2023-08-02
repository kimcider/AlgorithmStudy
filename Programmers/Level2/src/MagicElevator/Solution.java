package MagicElevator;

/*
 * https://school.programmers.co.kr/learn/courses/30/lessons/148653#
 */

/*
 * 맨 뒤부터 접근. 
 * 
 * 5 보다 크면 올리고
 * 5 보다 작으면 내리고
 * 5이면 앞의 숫자를 보고 올릴지 내릴지 판단한다. 
 * 그 앞의 숫자 역시 5이면 앞의 숫자가 5가 나오지 않을 때 까지 그 앞의 숫자를 테스트한다. 
 * 앞의 숫자가 5보다 클 경우 현재 숫자를 올려주고, 5보다 작을 경우 현재 숫자를 내려준다.
 * 
 * 
 * 맨 앞까지 5일 경우 뒤의 숫자를 올려가면 그 윗자리 수에 1씩이 더해지기 때문에 보다 계산횟수가 줄어든다. 
 * ex) 55'5' -> 5'6'0 -> 6'0'0
 * 		5번 -> 4번 -> 4번		 
 * 때문에 맨 앞이 5일 경우 현재의 숫자를 올려주는 편이 바람직하다. 
 * 
 * 맨 마지막 부분은 경계(5)에서 오류가 많이 발생한다에서 아이디어를 착안하였다.   
 */


/*
 * 내 풀이법이 틀렸다.
 * 
 * 올바른 풀이법: 현재 자리수의 값이 5이고, 현재 자리수보다 한자리수 큰 값이 5이면 무조건 올린다. 
 * 왜냐하면 5가 중복될수록 올림으로써 얻는 이득이 더 커진다. 
 * 
 * 255라고 쳤을 때, 
 * 1의자리수가 5이고, 10의 자리수도 5이다. 
 * 내 풀이법대로 한다면 10의자리수도 5이기 때문에 100의자리수까지 봐야한다. 이 경우 2이기 때문에 5를 내려서 계산한다.
 * 그럴 경우 5를 내려 250, 50을 내려 200, 200을 내려 0. 5 + 5 + 2 = 12번의 계산이 필요하다.
 * 
 * 그러나 올바른 풀이법대로 한다면 
 * 1의자리수가 5이고 10의자리수도 5이기 때문에 1의자리수를 올린다. 
 * 이 경우 5를 올려서 260. 40을 올려서 300. 300을 내려서 0이된다.--> 5 + 4 + 3= 12.
 * 
 *  여기까지는 다른 것이 없다고 느껴질 것이다.
 *  
 *  그러나 자리수가 더 커질 경우 이야기가 달라진다. 
 *  
 * 25555	
 * 
 * 올바른 풀이법대로 한다면 
 * 
 * 5 더해서 25560
 * 40 더해서 25600
 * 400 더해서 26000
 * 4000 더해서 30000
 * 30000 빼서 0 --> 5+4+4+4+3 = 20 
 * 
 *  
 *  
 *	내식대로하면 
 * 25555
 * 5 빼서 25550
 * 50 빼서 25500
 * 500 빼서 25000
 * 5000 빼서 20000
 * 20000 빼서 0	--> 22
 * 
 * 5가 많아질수록 올려서 얻어지는 이득이 더 커지기 때문에 나의 풀이법은 틀렸다. 
 */
class Solution {
    public int solution(int storey) {
    	int counter = 0;
    	
    	while(storey > 0) {
    		int now = storey % 10;
    		
    		if(now > 5) {
    			counter += (10 - now);
    			storey += 10;
    		}
    		else if(now == 5) {
    			int front = 0; 
    			int tempStorey = storey / 10;
    			
    			while(tempStorey > 0) {
    				front = tempStorey % 10;
    				if(front != 5) break;
    				tempStorey /= 10;
    			}
    			
    			if(front >= 5) {
    				counter += (10 - now);
        			storey += 10;
    			}else {
    				counter += now;
    			}
    		}else {
    			counter += now;
    		}
    		storey /= 10;
    	}
    	return counter;
    }
}

/* 올바른 풀이법은 다음과 같다.*/
//
//class Solution {
//    public int solution(int storey) {
//    	int counter = 0;
//    	
//    	while(storey > 0) {
//    		int now = storey % 10;
//    		int front = (storey % 100) / 10;
//    		if(now > 5) {
//    			counter += (10 - now);
//    			storey += 10;
//    		}
//    		else if(now == 5) {
//    			if(front >= 5) {
//    				counter += (10 - now);
//        			storey += 10;
//    			}else {
//    				counter += now;
//    			}
//    		}else {
//    			counter += now;
//    		}
//    		storey /= 10;
//    	}
//    	return counter;
//    }
//}