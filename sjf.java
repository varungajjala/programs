import java.util.*;
class sjf{
	public static double shortJobFirst(int[] at, int[] bt){
		Queue<Integer> completed = new LinkedList<Integer>();
		int waitingTime = 0;
		int currTime = 0;
		int[] startTime = new int[at.length];

		if(at.length == 0 || at.length == 1){
			return 0;
		}

		while(completed.size() < bt.length){
			int x = getNextJob(at,bt,completed,currTime);
			startTime[x] = currTime;
			currTime = currTime + bt[x];
			completed.offer(x);
		}

		for(int i=0; i<at.length; i++){
			waitingTime = waitingTime + (startTime[i] - at[i]);
		}

		return (double)waitingTime/(double)at.length;

	}

	public static int getNextJob(int[] at , int[] bt, Queue<Integer> completed,  int t){
		int minBt = Integer.MAX_VALUE;
		int index = -1;
		for(int i=0; i<at.length; i++){
			if(at[i] <= t && !completed.contains(i) && bt[i] <= minBt){
				minBt = bt[i];
				index = i;
				
			}
		}
		return index;
	}
	public static void main(String[] args){
		//int[] at = {0,0,0,0,0};
		int[] at = {0,2,1,4,5};
		//int[] bt = {7,4,1,4};
		int[] bt = {2,2,3,4,5};

		System.out.println(shortJobFirst(at,bt));

	}
}
