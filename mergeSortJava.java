public static void mergeSort(ArrayList <Integer> numbers , int first, int last){
		if(first<last){
			int mid = (last + first) / 2;
		    mergeSort(numbers, first, mid);
		    mergeSort(numbers, (mid + 1), last);
		    merge(numbers, first, mid, last);
		}
	}
		
	private static void merge(ArrayList <Integer> A, int first, int mid, int last ){
		int j = first, k = mid + 1;
		ArrayList <Integer> B = new ArrayList <Integer>(last+1);

		while( j <= mid &&  k <= last){
			if( A.get(j) > A.get(k) ){
				B.add(A.get(k));				
				k++;
			}
			else{
				B.add(A.get(j));	
				j++;
			}
		}

		while(j <= mid){
			B.add(A.get(j));	
			j++;
		}
		while(k <= last){
			B.add(A.get(k));
			k++;
		}

        int i = 0;
        int l = first;
        
        while(i < B.size()){
            A.set(l, B.get(i++));
            l++;
        }
	}
