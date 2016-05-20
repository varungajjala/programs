import java.util.*;

public class lru{
	static Queue<Integer> cache;
	public static int lruCountMiss(int cache_size, int[] pages){
		if(cache == null){
			cache = new LinkedList<Integer>();
		}

		if(pages.length == 0){
			return 0;
		}

		int misscount = 0;

		for(int i=0; i<pages.length;i++){
			if(cache.contains(pages[i])){
				if(cache.size() != 1){
					cache.remove(pages[i]);
					cache.offer(pages[i]);
				}
			}else if(cache.size() == cache_size){
				cache.poll();
				cache.offer(pages[i]);
				misscount++;
			}else{
				misscount++;
				cache.offer(pages[i]);
			}
		}

		return misscount;
	}
	public static void main(String args[]){

		int[] pages = new int[]{2,3,1,3,2,1,4,3,2};
		int cache_size= 2;
		System.out.println(lruCountMiss(2,pages));
	}
}
